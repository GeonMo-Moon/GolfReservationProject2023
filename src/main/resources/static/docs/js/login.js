const userId = document.getElementById("userid");
const userPw = document.getElementById("userpw");
const btnLogin = document.getElementById("btnlogin");

userId.addEventListener("change", event => {
    noSpaceForm(userId);
});
userId.addEventListener("keyup", event => {
    noSpaceForm(userId);
});

userPw.addEventListener("change", event => {
    noSpaceForm(userPw);
});
userPw.addEventListener("keyup", event => {
    noSpaceForm(userPw);
});

btnLogin.addEventListener("click", handlerLogin);


function enterkey(){
    if(window.event.keyCode == 13){
        handlerLogin();
    }
}

function handlerLogin() {
    if (userId.value === null || userId.value === "") {
//        swal({
//            title: "아이디를 입력하세요.",
//            icon: "info",
//            button: "확인"
//        });
            alert("아이디를 입력하세요.");

        return false;
    } else if (userPw.value === null || userPw.value === "") {
//        swal({
//            title: "비밀번호를 입력하세요.",
//            icon: "info",
//            button: "확인"
//        });
            alert("비밀번호를 입력하세요.");
        return false;
    } else{
        $('#load').show();

        let sendData = {
            "userid" : userId.value,
            "userpw" : userPw.value,
        }

        $.ajax({
            url      : "/userlogin",
            data     : sendData,
            type     : "GET",
            success : function(result) {
                $('#load').hide();
                if(result.loginResult == "1"){
                    location.href = "/";
                }else if(result.loginResult == "0"){
//                    swal({
//                        text: "계정 정보가 일치하지 않습니다.",
//                        icon: "error"
//                    });
                        alert("계정 정보가 일치하지 않습니다.");
                }
            },
            error:function(request,status,error){
                $('#load').hide();
//                swal({
//                    text: "로그인 도중 서버에 문제가 발생했습니다.",
//                    icon: "warning" //"info,success,warning,error" 중 택1
//                });
            }
        });
    };
}


//공백입력막기
function noSpaceForm(obj) {
    let str_space = /\s/;
    if (str_space.exec(obj.value)) {
//        swal({
//            title: "공백을 사용할 수 없습니다.",
//            icon: "error",
//            button: "확인"
//        });
        obj.focus();
        obj.value = obj.value.replace(' ', '');
        return false;
    }
}