package com.wangin.admin.controller;

import com.wangin.admin.common.SessionCheck;
import com.wangin.admin.dto.GolfDto;
import com.wangin.admin.dto.GolfUserDto;
import com.wangin.admin.entity.GolfEntity;
import com.wangin.admin.entity.GolfUserEntity;
import com.wangin.admin.predicate.LoginPredicate;
import com.wangin.admin.predicate.RvPredicate;
import com.wangin.admin.repository.GolfRepository;
import com.wangin.admin.repository.GolfUserRepository;
import com.wangin.admin.service.GolfService;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Controller
@AllArgsConstructor
@RequestMapping("/")
public class GolfController {


    @PersistenceContext
    private EntityManager entityManager;

    private GolfService golfService;
    private GolfUserRepository golfUserRepository;
    private GolfRepository golfRepository;

    @GetMapping("/")
    public String main(){
        return "formRI";
    }

    @GetMapping("/gjoin")
    public String gjoin(){
        return "golfjoin";
    }

//    @GetMapping("/gaccount")
//    public String gaccount(Model m, HttpServletRequest request){
//        String returnValue= "";
//        // 로그인 성공시 페이지 이동가능하게
//        if(new SessionCheck().loginSessionCheck(request)){
//            returnValue = "ccjoin";
//        }else{
//            returnValue = "golfchoice";
//        }
//        return returnValue;
//    }


//    @GetMapping("/gcountryclub")
//    public String gcountryclub(){
//        return "golfchoice";
//    }
//        @GetMapping("/gcountryclub")
//    public String gcountryclub(){
//        return "Countryclub.html";
//    }

    @GetMapping("/greservationi")
    public String greservationi(){
        return "golfclupinsert";
    }

    //    @GetMapping("/greservations")
//    public String greservations(){
//        return "golfchoice";
//    }
    @GetMapping("/greservations")
    public String greservations(Model m, HttpServletRequest request) {
        String returnValue = "";
        HttpSession session = request.getSession();
        if(new SessionCheck().loginSessionCheck(request)){
            String sessioninid = (String) session.getAttribute("user_signature");
            Optional<GolfUserEntity> guet = golfUserRepository.findOne(LoginPredicate.hiuser(sessioninid));
            Long finduinum = guet.get().getUI_NO();
            List<GolfEntity> listgolfentity = (List)golfRepository.findAll(RvPredicate.rvv(finduinum));
            m.addAttribute("rvinfo",listgolfentity);
            returnValue = "rvcheck";
        }else{
            returnValue = "formRI";
        }
        return returnValue;
//        return "logintest.html";
    }


    @PostMapping("/golftest2")
    public String golftest2(HttpServletRequest request, Model model, @RequestParam(required = false, defaultValue = "", value = "uid") String uid, @RequestParam(required = false, defaultValue = "", value = "upw") String upw, String... args){
        String ipmsg = uid + "/" + upw;
        System.out.println(ipmsg);
        // 클라이언트 소켓을 받을 threadpool를 선언한다. 쓰레드 풀안에는 최대 10개의 쓰레드를 가동시킬 수 있다.
        ExecutorService clientService = Executors.newFixedThreadPool(10);
        // serverSocket를 선언한다.
        try (ServerSocket server = new ServerSocket()) {
            System.out.println("소켓서버 오픈");
            // 포트는 9513으로 오픈한다.
            InetSocketAddress ipep = new InetSocketAddress(9513);
            server.bind(ipep);
            clientService.submit(() -> {
                try{
                    String arg1;
                    ProcessBuilder builder;
                    BufferedReader br;

                    arg1 = "C:/Users/abcd/Desktop/selenium/selenium/golftest4.py";
                    System.out.println("여긴 안오는거니?");
                    builder = new ProcessBuilder("python", arg1);

                    builder.redirectErrorStream(true);
                    Process process = builder.start();

                    int exitval = process.waitFor();

                    br = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));

                    String line;
                    while ((line = br.readLine()) != null){
                        System.out.println(">>> " + line);
                    }

                    if(exitval != 0){
                        System.out.println("비정상종료");
                    }
                } catch (Throwable e){
                    e.printStackTrace();
                }
            });

            while (true) {
                System.out.println("와일문 안이잖아");
                // 클라이언트가 접속할 때까지 대기한다.
                Socket client = server.accept();
                System.out.println("1");
                // 클라이언트가 접속이 되면 쓰레드 풀에 쓰레드를 하나 생성하고 inputstream과 outputstream을 받는다.
                clientService.submit(() -> {
                    try (OutputStream sender = client.getOutputStream();
                         InputStream receiver = client.getInputStream();) {
                        System.out.println("2");
                        // 서버 무한 대기를 한다.
                        while (true) {
                            System.out.println("와일문 안이잖아2");
                            byte[] data = new byte[4];
                            // 데이터 길이를 받는다.
                            receiver.read(data, 0, 4);
                            // ByteBuffer를 통해 little 엔디언 형식으로 데이터 길이를 구한다.
                            ByteBuffer b = ByteBuffer.wrap(data);
                            b.order(ByteOrder.LITTLE_ENDIAN);
                            int length = b.getInt();
                            // 데이터를 받을 버퍼를 선언한다.
                            data = new byte[length];
                            // 데이터를 받는다.
                            receiver.read(data, 0, length);

                            // byte형식의 데이터를 string형식으로 변환한다.
                            String msg = new String(data, "UTF-8");
                            // 콘솔에 출력한다.
                            System.out.println(msg);
                            // echo를 붙힌다.
                            msg = ipmsg;
                            // string을 byte배열 형식으로 변환한다.
                            data = msg.getBytes();
                            // ByteBuffer를 통해 데이터 길이를 byte형식으로 변환한다.
                            b = ByteBuffer.allocate(4);
                            // byte포멧은 little 엔디언이다.
                            b.order(ByteOrder.LITTLE_ENDIAN);
                            b.putInt(data.length);
                            // 데이터 길이 전송
                            sender.write(b.array(), 0, 4);
                            // 데이터 전송
                            sender.write(data);
                            server.close();
                            break;
                        }
                    } catch (Throwable e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            // 에러가 발생하면 접속을 종료한다.
                            client.close();
                        } catch (Throwable e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }

        return "golfchoice";
    }

    @PostMapping("/golftest3")
    public String golftest3(HttpServletRequest request, Model model,
                            @RequestParam(required = false, defaultValue = "", value = "mountin") int mountin,
                            @RequestParam(required = false, defaultValue = "", value = "hope_y") int hope_y,
                            @RequestParam(required = false, defaultValue = "", value = "hope_m") int hope_m,
                            @RequestParam(required = false, defaultValue = "", value = "hope_d") int hope_d,
                            @RequestParam(required = false, defaultValue = "", value = "hope_c") int hope_c,
                            @RequestParam(required = false, defaultValue = "", value = "hope_t1") int hope_t1,
                            @RequestParam(required = false, defaultValue = "", value = "hope_t2") int hope_t2,
                            @RequestParam(required = false, defaultValue = "", value = "hope_h") int hope_h,
                            @RequestParam(required = false, defaultValue = "", value = "user_id") String user_id,
                            @RequestParam(required = false, defaultValue = "", value = "user_pw") String user_pw){
        GolfDto golfDto = new GolfDto(null, 0, 0, mountin, user_id, user_pw, hope_y, hope_m, hope_d, hope_t1, hope_t2, hope_h, hope_c, 0, 0, 0, 1, null, null, null);
        golfService.insertData1(golfDto);
        return "golfclupinsert";
    }

    @PostMapping("/golftest4")
    public String golftest4(HttpServletRequest request, Model model,
                            @RequestParam(required = false, defaultValue = "", value = "uid") String uid,
                            @RequestParam(required = false, defaultValue = "", value = "upw") String upw,
                            @RequestParam(required = false, defaultValue = "", value = "uname") String uname,
                            @RequestParam(required = false, defaultValue = "", value = "uphone") String uphone,
                            @RequestParam(required = false, defaultValue = "", value = "sms") int sms){
        System.out.println("와써?");
        GolfUserDto golfUserDto = new GolfUserDto(null, uid, upw, uname, uphone, sms, 0, null,null,null);
        golfService.insertData2(golfUserDto);
        return "golfclupinsert";
    }

}
