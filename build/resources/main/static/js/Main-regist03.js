function insert(){
    var g1a = $("#g1").val();
    const  g1 = parseInt(g1a);
    var g2a = $("#g2").val();
    const  g2 = parseInt(g2a);

    const data = {
        'g1' : g1,
        'g2' : g2
    };
    $.ajax({
        url : "/gt3/save",
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

function updategrade(){
    document.getElementById('grade1').style.display = 'block';
    document.getElementById('insertbtn').style.display = 'block';
    document.getElementById('grade1-1').style.display = 'none';
    document.getElementById('updatebtn').style.display = 'none';
}