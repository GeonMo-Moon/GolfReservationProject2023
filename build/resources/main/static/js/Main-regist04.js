function insertphone() {
    const ph = $("#phoneinput").val();
    const pa = $("#passwordinput").val();

    const data = {
        'ph': ph,
        'pa': pa
    };
    $.ajax({
        url: "/insertjoin",
        data: data,
        type: "POST",
        success: function (result) {
            alert("저장완료");
        },
        error: function (request, status, error) {
            alert("이게 에러?");
        }
    });
}
    function login() {
        var ph = $('#phone').val();
        var pa = $('#password').val();

        const params = {
            phone: ph,
            password: pa
        }

        $.ajax({
            url: "/login",
            data: params,
            type: "POST",
            async: false,
            success : function(result){
                location.href = "/choice";
            },
            error: function (request, status, error) {
                alert("로그인 실패");
            }
        });

}