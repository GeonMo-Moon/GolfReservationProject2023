function golfjoin(){
    const uid = $("#uid").val();
    const upw = $("#upw").val();
    const uname = $("#uname").val();
    const uphone = $("#uphone").val();
    console.log("여기가 문제구만?");
//    const sms = $("input[name='sms']:checked").val();
    const sms = $("#sms").val();
    console.log(sms);

    const data = {
        'uid' : uid,
        'upw' : upw,
        'uname' : uname,
        'uphone' : uphone,
        'sms' : sms
    };
    $.ajax({
        url : "/golftest4",
        data : data,
        type : "POST",
        success : function (result){
            alert("완료");
        },
        error : function (request,status,error){
            alert("이게 에러?");
        }
    });
}