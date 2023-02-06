# 소켓을 사용하기 위해서는 socket을 import해야 한다.	
import socket	
from selenium import webdriver
from selenium.webdriver.common.by import By
import time
from time import sleep
from datetime import datetime
import pymysql
# 로컬은 127.16.101.5의 ip로 접속한다.	
HOST = '127.16.101.5'	
# port는 위 서버에서 설정한 9898로 접속을 한다.	
PORT = 9513
# 소켓을 만든다.	
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)	
# connect함수로 접속을 한다.	
client_socket.connect((HOST, PORT))	

# 메시지를 보낸다.	
msg = ''
# 메시지를 바이너리(byte)형식으로 변환한다.	
data = msg.encode()
# 메시지 길이를 구한다.	
length = len(data)
# server로 little 엔디언 형식으로 데이터 길이를 전송한다.	
client_socket.sendall(length.to_bytes(4, byteorder="little"))
# 데이터를 전송한다.	
client_socket.sendall(data)

# server로 부터 전송받을 데이터 길이를 받는다.	
data = client_socket.recv(4)
# 데이터 길이는 little 엔디언 형식으로 int를 변환한다.
length = int.from_bytes(data, "big")
# 데이터 길이를 받는다.	
data = client_socket.recv(length)
# 데이터를 수신한다.	
msg = data.decode()
# 데이터를 출력한다.	
print('Received from : ', msg)

#DB에서 예약정보 받아오는 부분(튜플형식)
uid = msg.split('/')[0]
upw = msg.split('/')[1]
db = pymysql.connect(host='idateyou.dotname.kr', port=3306, user='lms', passwd='0070', db='golf_reservation', charset='utf8')
cursor = db.cursor()
sql = "SELECT * FROM test_table WHERE user_id = '" + uid + "' AND user_pw = '" + upw + "';"
cursor.execute(sql)
res = cursor.fetchone()

#예약사이트로 이동
driver = webdriver.Chrome("chromedriver")
urltext = 'http://www.eodeungsancc.com/html/member/login.asp'
driver.get(urltext)
driver.implicitly_wait(5)

#로그인
user_id = res[2]
user_pw = res[3]
# rd = datetime.today().day+1
# restime = False
# while restime == False:
#     if datetime.today().day == rd and datetime.today().hour == 0 and datetime.today().minute == 0 and datetime.today().second == 1:
#         restime = True
driver.find_element(By.ID, 'loginId').send_keys(user_id)
driver.find_element(By.ID, 'loginPw').send_keys(user_pw)
driver.find_element(By.XPATH, '/html/body/div[2]/div/div[3]/div/div/form/fieldset/button').click()
driver.implicitly_wait(5)

#예약페이지로 이동
driver.find_element(By.XPATH, '/html/body/div[1]/div[2]/ul/li[4]/a').click()
driver.implicitly_wait(5)

#예약 풀리는 날짜 자동계산 해주는 함수
def openday():
    a= datetime.today().month
    open_m = 0
    open_d = 0
    if a == 1 or a == 3 or a == 5 or a == 7 or a == 8 or a == 10 or a == 12:
        if datetime.today().day + 28 <= 31:
            open_m = datetime.today().month
            open_d = datetime.today().day+28
        else:
            b = 31 - datetime.today().day
            open_m = datetime.today().month+1
            if open_m == 13:
                open_m = 1
            open_d = 28-b
    elif a == 4 or a == 6 or a == 9 or a == 11:
        if datetime.today().day + 28 <= 30:
            open_m = datetime.today().month
            open_d = datetime.today().day+28
        else:
            b = 30 - datetime.today().day
            open_m = datetime.today().month+1
            open_d = 28-b
    else:
        b = 28 - datetime.today().day
        open_m = datetime.today().month+1
        open_d = 28-b
    if open_m < 10:
        result_m = '0'+str(open_m)
    else:
        result_m = str(open_m)
    if open_d < 10:
        result_d = '0'+str(open_d)
    else:
        result_d = str(open_d)
    return result_m+'/'+result_d

#원하는 날짜 찾아가기
# user_y = '2023'
# user_m = openday()[0:2]
# user_d = openday()[3:5]
user_y = str(res[4])
user_m = res[5]
user_d = res[6]
web_y = driver.find_element(By.XPATH, '/html/body/div[2]/div/div[3]/div/div/div[1]/div/div[1]/span/span[1]').text
if int(user_y) > int(web_y):
    driver.find_element(By.XPATH, '/html/body/div[2]/div/div[3]/div/div/div[1]/div/div[1]/a[2]/img').click()
    driver.implicitly_wait(5)
web_m = driver.find_element(By.XPATH, '/html/body/div[2]/div/div[3]/div/div/div[1]/div/div[1]/span/span[2]').text
while int(user_m) > int(web_m):
    driver.find_element(By.XPATH, '/html/body/div[2]/div/div[3]/div/div/div[1]/div/div[1]/a[2]/img').click()
    driver.implicitly_wait(5)
    web_m = driver.find_element(By.XPATH, '/html/body/div[2]/div/div[3]/div/div/div[1]/div/div[1]/span/span[2]').text
i = 2
j = 2
d_XPATH = '/html/body/div[2]/div/div[3]/div/div/div[1]/div/table/tbody/tr['+str(i)+']/td['+str(j)+']'
web_d = driver.find_element(By.XPATH, '/html/body/div[2]/div/div[3]/div/div/div[1]/div/table/tbody/tr[2]/td[1]').text
if web_d == '':
    web_d = '0'
while int(user_d) > int(web_d):
    web_d = driver.find_element(By.XPATH, d_XPATH).text
    if web_d == '':
        web_d = '0'
    user_d = int(user_d)
    web_d = int(web_d)
    if web_d == user_d:
        break
    d_XPATH = '/html/body/div[2]/div/div[3]/div/div/div[1]/div/table/tbody/tr['+str(i)+']/td['+str(j)+']'
    j += 1
    if j > 7:
        j = 1
        i += 1
d_XPATH += '/a'
find_day = False
while find_day == False:
    try:
        driver.find_element(By.XPATH, d_XPATH).click()
        find_day = True
    except:
        driver.refresh()
#원하는 코스, 시간 찾아가기
# user_course = '2'
# user_time = '11'
# user_min = '15'
user_course = str(res[7])
user_time = str(res[8])
user_min = '15'

user_chice = res[9]

#바로 예약하는 함수
def liveres(uc, ut, um):
    #코스선택
    course_XPATH = '/html/body/div[2]/div/div[3]/div/div/div[2]/div/div/ul/li['+uc+']'
    driver.find_element(By.XPATH, course_XPATH).click()
    driver.implicitly_wait(5)
    #시간선택
    time_XPATH = '/html/body/div[2]/div/div[3]/div/div/div[2]/div/div/div/div['+uc+']/table/tbody/tr[1]/td[2]'
    web_time = driver.find_element(By.XPATH, time_XPATH).text[0:2]
    ut = int(ut)
    if web_time == '':
        web_time = driver.find_element(By.XPATH, time_XPATH).text[0:2]
    web_time = int(web_time)
    i1 = 1
    while ut > web_time:
        i1 += 1
        time_XPATH = '/html/body/div[2]/div/div[3]/div/div/div[2]/div/div/div/div['+uc+']/table/tbody/tr[' + str(i1) + ']/td[2]'
        web_time = driver.find_element(By.XPATH, time_XPATH).text[0:2]
        web_time = int(web_time)
        if int(ut) == int(web_time):
            web_min = driver.find_element(By.XPATH, time_XPATH).text[3:5]
            web_min = int(web_min)
            while int(um) > int(web_min):
                i1 += 1
                time_XPATH = '/html/body/div[2]/div/div[3]/div/div/div[2]/div/div/div/div['+uc+']/table/tbody/tr[' + str(i1) + ']/td[2]'
                web_min = driver.find_element(By.XPATH, time_XPATH).text[3:5]
                web_min = int(web_min)
                if int(um) == int(web_min):
                    break
    tm_XPATH = '/html/body/div[2]/div/div[3]/div/div/div[2]/div/div/div/div['+uc+']/table/tbody/tr[' + str(i1) + ']/td[3]/a/span'
    driver.find_element(By.XPATH, tm_XPATH).click()
    driver.implicitly_wait(5)
    
#시간 나올때까지 기다리는 함수
def waitres(uc, ut):
    success = False
    while success == False:
        course_XPATH = '/html/body/div[2]/div/div[3]/div/div/div[2]/div/div/ul/li['+uc+']'
        driver.find_element(By.XPATH, course_XPATH).click()
        driver.implicitly_wait(5)
        time_XPATH = '/html/body/div[2]/div/div[3]/div/div/div[2]/div/div/div/div['+uc+']/table/tbody/tr[1]/td[2]'
        web_time = driver.find_element(By.XPATH, time_XPATH).text[0:2]
        ut = int(ut)
        if web_time == '':
            web_time = driver.find_element(By.XPATH, time_XPATH).text[0:2]
        web_time = int(web_time)
        i1 = 1
        while ut > web_time:
            i1 += 1
            time_XPATH = '/html/body/div[2]/div/div[3]/div/div/div[2]/div/div/div/div['+uc+']/table/tbody/tr[' + str(i1) + ']/td[2]'
            try:
                web_time = driver.find_element(By.XPATH, time_XPATH).text[0:2]
                web_time = int(web_time)
                if int(ut) == web_time:
                    success = True
            except:
                i1 = 1
                web_time = '0'
                web_time = int(web_time)
                sleep(2)
                driver.refresh()
                driver.implicitly_wait(5)
                break
    tm_XPATH = '/html/body/div[2]/div/div[3]/div/div/div[2]/div/div/div/div['+uc+']/table/tbody/tr[' + str(i1) + ']/td[3]/a/span'
    driver.find_element(By.XPATH, tm_XPATH).click()
    driver.implicitly_wait(5)
    
if user_chice == 1:
    liveres(user_course, user_time, user_min)
else:
    waitres(user_course, user_time)

#예약하기
tm_XPATH = '/html/body/div[2]/div/div[3]/div/div/div[2]/a[2]'
driver.find_element(By.XPATH, tm_XPATH).click()
driver.implicitly_wait(5)
# driver.switch_to.alert.accept()
# driver.implicitly_wait(5)

time.sleep(5)
 	
client_socket.close()