function ccjoin(){
    const ccname = $("#ccname2").val();
    const ccid = $("#ccid").val();
    const ccpw = $("#ccpw").val();

    console.log(ccname+ccid+ccpw);

    const data = {
        'ccname2' : ccname,
        'ccid' : ccid,
        'ccpw' : ccpw,
    };
    $.ajax({
        url : "/ccjoin",
        data : data,
        type : "POST",
        success : function (result){
            alert("등록완료");
            location.href = "/gaccount";
        },
        error : function (request,status,error){
            alert("이게 에러?");
        }
    });
}