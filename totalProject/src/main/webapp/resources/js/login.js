
//		ajax로 수정하고 SingUp으로 바로 갈수 있도록 수정하기
$("#signinBtn").click(function() {
	
	let info = "id="+$("#ID").val()+
			   "pw="+$("#PW").val();

	$.ajax({
		url:"/practice/test.do",
		contentType: "application/json;charset=utf-8",
		succsses : function(data) {
			alert(data.msg);
		},
		error : function(request, status, error) {
			alert("code = " + request.status + "   message = " + request.responseText + " error = " + error); // 실패 시 처리

		}

	})
	/*$.ajax({
		type : "post",
		url : "/practice/signIn.do",
		dataType:"json",
		data : {
			"id" : $('#ID').val(),
			"pw" : $('#PW').val()
		},
		succses : function(data) {
			console.log(data);
				console.log(data.memNumber);
				
		},
		error : function(request, status, error) {
			alert("code = " + request.status + "   message = " + request.responseText + " error = " + error); // 실패 시 처리

		}
	});
*/
});