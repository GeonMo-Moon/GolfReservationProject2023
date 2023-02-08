function golfres(){
    const uid = $("#uid").val();
    const upw = $("#upw").val();

    const data = {
        'uid' : uid,
        'upw' : upw
    };
    $.ajax({
        url : "/golftest2",
        data : data,
        type : "POST",
        success : function (result){
            alert("예약완료");
        },
        error : function (request,status,error){
            alert("이게 에러?");
        }
    });
}

function golfinsert(){
    const mountin = $("#mountain").val();
    const hope_y = $("#year").val();
    const hope_m = $("#month").val();
    const hope_d = $("#day").val();
    const hope_c = $("#cource").val();
    const hope_t1 = $("#time1").val();
    const hope_t2 = $("#time2").val();
    const hope_h = $("#hall").val();
    const user_id = $("#uid").val();
    const user_pw = $("#upw").val();

    const data = {
        'mountin' : mountin,
        'hope_y' : hope_y,
        'hope_m' : hope_m,
        'hope_d' : hope_d,
        'hope_c' : hope_c,
        'hope_t1' : hope_t1,
        'hope_t2' : hope_t2,
        'hope_h' : hope_h,
        'user_id' : user_id,
        'user_pw' : user_pw
    };
    $.ajax({
        url : "/golftest3",
        data : data,
        type : "POST",
        success : function (result){
            alert("저장완료");
        },
        error : function (request,status,error){
            alert("이게 에러?");
        }
    });
}

document.getElementById("upw")
    .addEventListener("keydown", function (e){
        if (e.code === 'Enter'){
            document.getElementById("reservation").click();
        }
    });

document.getElementById("uid")
    .addEventListener("keydown", function (e){
        if (e.code === 'Enter'){
            document.getElementById("reservation").click();
        }
    });