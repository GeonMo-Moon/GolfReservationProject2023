function insert(){
    var ic1 = $("#defaultRadio1").val();
    var ic2 = 0;
    if (ic1=='off'){ic2 = 1;}
    const ic = parseInt(ic2);
    var opa = $("#op").val();
    const  op = parseInt(opa);
    const sf1 = $("#sf1").val();
    const sf2 = $("#sf2").val();
    const sf3 = $("#sf3").val();
    const sf4 = $("#sf4").val();
    const sf5 = $("#sf5").val();
    const sf6 = $("#sf6").val();
    const sf7 = $("#sf7").val();
    const sf8 = $("#sf8").val();
    const sf9 = $("#sf9").val();
    const sf10 = $("#sf10").val();
    const sf11 = $("#sf11").val();
    const ss1 = $("#ss1").val();
    const ss2 = $("#ss2").val();
    const ss3 = $("#ss3").val();
    const ss4 = $("#ss4").val();
    const ss5 = $("#ss5").val();
    const ss6 = $("#ss6").val();
    const ss7 = $("#ss7").val();
    const ss8 = $("#ss8").val();
    const ss9 = $("#ss9").val();
    const ss10 = $("#ss10").val();
    const ss11 = $("#ss11").val();
    const tf1 = $("#tf1").val();
    const tf2 = $("#tf2").val();
    const tf3 = $("#tf3").val();
    const tf4 = $("#tf4").val();
    const tf5 = $("#tf5").val();
    const tf6 = $("#tf6").val();
    const tf7 = $("#tf7").val();
    const tf8 = $("#tf8").val();
    const tf9 = $("#tf9").val();
    const tf10 = $("#tf10").val();
    const tf11 = $("#tf11").val();
    var faba = $("#fab").val();
    const  fab = parseInt(faba);
    var flaa = $("#fla").val();
    const  fla = parseInt(flaa);
    var flea = $("#fle").val();
    const  fle = parseInt(flea);
    var frea = $("#fre").val();
    const  fre = parseInt(frea);
    var fbda = $("#fbd").val();
    const  fbd = parseFloat(fbda);
    var feaa = $("#fea").val();
    const  fea = parseFloat(feaa);
    var fvata = $("#fvat").val();
    const  fvat = parseInt(fvata);
    var saba = $("#sab").val();
    const  sab = parseInt(saba);
    var slaa = $("#sla").val();
    const  sla = parseInt(slaa);
    var slea = $("#sle").val();
    const  sle = parseInt(slea);
    var srea = $("#sre").val();
    const  sre = parseInt(srea);
    var sbda = $("#sbd").val();
    const  sbd = parseFloat(sbda);
    var seaa = $("#sea").val();
    const  sea = parseFloat(seaa);
    var svata = $("#svat").val();
    const  svat = parseInt(svata);
    var taba = $("#tab").val();
    const  tab = parseInt(taba);
    var tlaa = $("#tla").val();
    const  tla = parseInt(tlaa);
    var tlea = $("#tle").val();
    const  tle = parseInt(tlea);
    var trea = $("#tre").val();
    const  tre = parseInt(trea);
    var tbda = $("#tbd").val();
    const  tbd = parseFloat(tbda);
    var teaa = $("#tea").val();
    const  tea = parseFloat(teaa);
    var tvata = $("#tvat").val();
    const  tvat = parseInt(tvata);

    var tof = true;
    var arr = [];

    const data = {
        'ic' : ic,
        'op' : op,
        'sf1' : sf1,
        'sf2' : sf2,
        'sf3' : sf3,
        'sf4' : sf4,
        'sf5' : sf5,
        'sf6' : sf6,
        'sf7' : sf7,
        'sf8' : sf8,
        'sf9' : sf9,
        'sf10' : sf10,
        'sf11' : sf11,
        'ss1' : ss1,
        'ss2' : ss2,
        'ss3' : ss3,
        'ss4' : ss4,
        'ss5' : ss5,
        'ss6' : ss6,
        'ss7' : ss7,
        'ss8' : ss8,
        'ss9' : ss9,
        'ss10' : ss10,
        'ss11' : ss11,
        'tf1' : tf1,
        'tf2' : tf2,
        'tf3' : tf3,
        'tf4' : tf4,
        'tf5' : tf5,
        'tf6' : tf6,
        'tf7' : tf7,
        'tf8' : tf8,
        'tf9' : tf9,
        'tf10' : tf10,
        'tf11' : tf11,
        'fab' : fab,
        'fla' : fla,
        'fle' : fle,
        'fre' : fre,
        'fbd' : fbd,
        'fea' : fea,
        'fvat' : fvat,
        'sab' : sab,
        'sla' : sla,
        'sle' : sle,
        'sre' : sre,
        'sbd' : sbd,
        'sea' : sea,
        'svat' : svat,
        'tab' : tab,
        'tla' : tla,
        'tle' : tle,
        'tre' : tre,
        'tbd' : tbd,
        'tea' : tea,
        'tvat' : tvat
    };

    arr[0] = sf1;
    arr[1] = sf2;
    arr[2] = sf3;
    arr[3] = sf4;
    arr[4] = sf5;
    arr[5] = sf6;
    arr[6] = sf7;
    arr[7] = sf8;
    arr[8] = sf9;
    arr[9] = sf10;
    arr[10] = sf11;
    arr[11] = ss1;
    arr[12] = ss2;
    arr[13] = ss3;
    arr[14] = ss4;
    arr[15] = ss5;
    arr[16] = ss6;
    arr[17] = ss7;
    arr[18] = ss8;
    arr[19] = ss9;
    arr[20] = ss10;
    arr[21] = ss11;
    arr[22] = tf1;
    arr[23] = tf2;
    arr[24] = tf3;
    arr[25] = tf4;
    arr[26] = tf5;
    arr[27] = tf6;
    arr[28] = tf7;
    arr[29] = tf8;
    arr[30] = tf9;
    arr[31] = tf10;
    arr[32] = tf11;

    for (var i = 0; i < 33; i++){
        if(arr[i]=="선택"){
            tof = false;
        }
    }
    if (ic==1){
        $.ajax({
            url : "/insert2",
            data : data,
            type : "POST",
            success : function (result){
                alert("저장완료");
            },
            error : function (request,status,error){
                alert("이게 에러?");
            }
        });
    }else{
        if(tof){
            $.ajax({
                url : "/gt2/save",
                data : data,
                type : "POST",
                success : function (result){
                    alert("저장완료");
                },
                error : function (request,status,error){
                    alert("이게 에러?");
                }
            });
        }else{
            alert("교과성적을 모두 입력해주세요.");
        }
    }
}

function updategrade(){
    document.getElementById('grade_type1').style.display = 'block';
    document.getElementById('grade_type2').style.display = 'block';
    document.getElementById('grade_result').style.display = 'block';
    document.getElementById('insertbtn').style.display = 'block';
    document.getElementById('grade_type1-1').style.display = 'none';
    document.getElementById('grade_type2-1').style.display = 'none';
    document.getElementById('grade_result-1').style.display = 'none';
    document.getElementById('updatebtn').style.display = 'none';
    var fbd = (document.getElementById('fbd').value - 4.5).toFixed(1);
    var sbd = (document.getElementById('sbd').value - 4.5).toFixed(1);
    var tbd = (document.getElementById('tbd').value - 4.5).toFixed(1);
    var fea = (document.getElementById('fea').value - 4.5).toFixed(1);
    var sea = (document.getElementById('sea').value - 4.5).toFixed(1);
    var tea = (document.getElementById('tea').value - 4.5).toFixed(1);
    $('input[id=fbd]').attr('value',fbd);
    $('input[id=sbd]').attr('value',sbd);
    $('input[id=tbd]').attr('value',tbd);
    $('input[id=fea]').attr('value',fea);
    $('input[id=sea]').attr('value',sea);
    $('input[id=tea]').attr('value',tea);
}
