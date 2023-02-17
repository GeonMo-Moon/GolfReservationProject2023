function Countryclub(){
    const ccname = $("#ccname").val();
    const ccurl = $("#ccurl").val();
    const cccancel = $("#cccancel").val();
    const ccopen = $("#ccopen").val();
    const cctype = $("#cctype").val();
//    const ccrv = $("input[name='ccrv']:checked").val();
    const ccrv = $("#ccrv").val();
    const data = {
        'ccname' : ccname,
        'ccurl' : ccurl,
        'cccancel' : cccancel,
        'ccopen' : ccopen,
        'cctype' : cctype,
        'ccrv' : ccrv
    };
        console.log("3");
    $.ajax({
        url : "/countryclub2",
        data : data,
        type : "POST",
        success : function (result){
            alert("완료");
        },
        error : function (request,status,error){
//            alert("이게 에러?");
            alert("완료");
            location.href = "/gcountryclub";
        }
    });
}