// 준호씨의 방식
function Countryclub(){
    const ccname = $("#ccname").val();
    const ccurl = $("#ccurl").val();
    const cccancel = $("#cccancel").val();
    const ccopen = $("#ccopen").val();
    const cctype = $("#cctype").val();
    const ccrv = $("input[name='ccrv']:checked").val();
    const data = {
        'ccname' : ccname,
        'ccurl' : ccurl,
        'cccancel' : cccancel,
        'ccopen' : ccopen,
        'cctype' : cctype,
        'ccrv' : ccrv
    };
    $.ajax({
        url : "/countryclub2",
        data : data,
        type : "POST",
        success : function (result){
            alert("완료");
        },
        error : function (request,status,error){
            alert("에러");
//            alert("완료");
        }
    });
}

//const ccName = document.getElementById("ccname");
//const ccUrl = document.getElementById("ccurl");
//const ccCancel = document.getElementById("cccancel");
//const ccOpen = document.getElementById("ccopen");
//const ccType = document.getElementById("cctype");
////const ccRv = document.getElementById("ccrv");
////const ccRv = $("input[name='ccrv']:checked").val();
//var ccRv = $('input[name=ccrv]:checked').val();
//console.log(ccRv);
//const btnCc = document.getElementById("btncc");
//btnCc.addEventListener("click", Countryclub);
//
//    console.log("1");
//function Countryclub(){
//    if(ccName.value === null || ccName.value.value===""){
//            alert("골프장 이름을 입력하세요.");
//        return false;
//        }else if (ccUrl.value === null || ccUrl.value === ""){
//                alert("골프장 URL을 입력하세요.");
//        return false;
//        }else if (ccCancel.value === null || ccCancel.value === ""){
//                alert("취소 가능일자를 입력하세요.");
//
//            return false;
//        }else if (ccOpen.value === null || ccOpen.value === ""){
//                alert("오픈 일자를 입력하세요.");
//
//            return false;
//            }else if (ccType.value === null || ccType.value === ""){
//                alert("타입을 입력하세요.");
//
//            return false;
////            }else if (ccRv.value === null || ccRv.value === ""){
////                alert("예약 가능 여부를 입력하세요.");
////                return false;
//    } else {
//        $('#load').show();
//        let sendData ={
//            "ccname" : ccName.value,
//            "ccurl" : ccUrl.value,
//            "cccancel" : ccCancel.value,
//            "ccopen" : ccOpen.value,
//            "cctype" : ccType.value,
//            "ccrv" : ccRv,
//            }
//            console.log("2");
//$.ajax({
//        url      : "/countryclub2",
//        data     : sendData,
//        type     : "POST",
//        success : function(result) {
//        // 성공시 알림창 띄우고 확인버튼 클릭시 로그인 페이지로 이동
////        if(ccName.value != null&&
////            ccUrl.value != null&&
////            ccCancel.value != null&&
////            ccOpen.value != null&&
////            ccType.value != null){
//        alert("전송 성공")
////        .then(function(){
////        location.href="/gcountryclub";
////        }
//            },
//
//                    error:function(request,status,error){
//                    alert("이게 에러?");
//            }
//
//
//
//    });
//}
//}