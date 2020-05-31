
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
			if(data.info != null) {
				alert(data.info.memNumber);
				
			}else { 
				alert ("ID 혹은 Password를 확인해 주세요.");
				
//				아이디 혹은 비밀번호 값이 공백인 경우 HTML UI 띄워주기
//				새로운 클래스 추가해서 outline 색상 변경 / 
				if($("#ID").val() == "") {
					$("#ID").attr("placeholder", "아이디를 입력하세요.");
					$("#ID").addClass("nullCheck");
					$("#ID").focus();
//					outline 바꾸는 형식 (여러 document가 영향 받음)
/*					$("#ID").focus(function(){
						$(".form-control:focus").css("border-color":"red",)
					});*/
				}else if ($("#PW").val() == "") {
					$("#PW").attr("placeholder", "비밀번호를 입력하세요.");
					$("#ID").addClass("nullCheck");
					$("#PW").focus();
					
					
				}
			}
		},
		error : function(request, status, error) {
			alert("code = " + request.status + "   message = " + request.responseText + " error = " + error); // 실패 시 처리

		}
	});

});
