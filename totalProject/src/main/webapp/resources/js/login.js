
//		ajax로 수정하고 SingUp으로 바로 갈수 있도록 수정하기
$(document).on('click','#signinBtn', function() {

	$.ajax({
		type : "post",
		url : "signIn.do",
		data :  {"id" : $("#ID").val(),
	   			"pw" : $("#PW").val()},
		success : function(data) {
/*			console.log(data);
			console.log(data.info.memNumber)
*/				

		},
		error : function(request, status, error) {
			alert("code = " + request.status + "   message = " + request.responseText + " error = " + error); // 실패 시 처리

		}
	});

});

// 페이지 넘길건지 팝업창을 확상해서 사용할건지 정하기
$(document).on('click','#signupBtn', function() {
	
	$.ajax ({
		type : "post",
		url : "signUp.do",
		
	})
});