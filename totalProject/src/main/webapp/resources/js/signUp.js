/**
 * 회원가입 하는 페이지로 이동후 자기 페이지 템플릿 고르는 페이지로 넘기기
 */


$(document).on('click','#signupBtn', function() {
	location.href="signUp.do";
});


$(document).on('click','#checkId',function(){
	$.ajax({
		type : "post",
		url : "checkId.do",
		data :  {"id" : $("#ID").val()},
		success : function(data) {
			alert(data);
		},
		error : function(request, status, error) {
			alert("code = " + request.status + "   message = " + request.responseText + " error = " + error); // 실패 시 처리
		}
	});
});