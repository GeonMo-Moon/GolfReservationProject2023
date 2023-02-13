function Course(){
    const ccname2 = $("#ccname2").val();
    const coursename = $("#coursename").val();
    const coursenum = $("#coursenum").val();
    const data = {
        'ccname2' : ccname2,
        'coursename' : coursename,
        'coursenum' : coursenum,
    };

    $.ajax({
        url : "/course2",
        data : data,
        type : "POST",
        success : function (result){
            alert("완료");
        },
        error : function (request,status,error){
            alert("골프장 이름을 다시 확인하세요.");
        }
    });
}