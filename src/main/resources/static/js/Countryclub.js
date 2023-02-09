function Countryclub(){
    const ccname = $("#ccname").val();
    const ccurl = $("#ccurl").val();
    const cccancel = $("#cccancel").val();
    const ccopen = $("#ccopen").val();
    const cctype = $("#cctype").val();
    console.log("1");
    const ccrv = $("input[name='ccrv']:checked").val();
    console.log("2");
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
            alert("이게 에러?");
        }
    });
}