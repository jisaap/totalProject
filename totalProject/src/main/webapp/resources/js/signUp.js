/**
 * 회원가입 하는 페이지로 이동후 자기 페이지 템플릿 고르는 페이지로 넘기기
 */

let oldVal

$(document).ready(function () {
	$('html, body').animate({scrollTop : $("#signUp").prop('scrollHeight')});
});


$(document).on('click','#signupBtn', function() {
	location.href="signUp.do";
});

	$(document).on("blur", "#name", function(){
	$.ajax({
		type : "post",
		url : "checkId.do",
		data :  {"id" : $("#name").val()},
		success : function(data) {
			if(data != "사용가능한 아이디 입니다.") {
				$("#name").val(null);
				// placeHolder 추가
				$("#name").attr("placeholder", data);
				$("#name").addClass("nullCheck");
				$("#name").focus();
				$("#idInfo").text(data);
				$("#idInfo").css("color","red");
			}else {
				oldVal = $("#name").val();
				$("#name").attr("id","checkedId");
				$("#idInfo").text("");
			}
		},
		error : function(request, status, error) {
			alert("code = " + request.status + "   message = " + request.responseText + " error = " + error); // 실패 시 처리
		}
	});
});

	$(document).on("propertychange change keyup paste input", "#checkedId", function() {
		let currentVal = $(this).val();
		if(currentVal == oldVal) {
			return;
		}
	oldVal = $("#checkedId").val();
	$("#checkedId").attr("id","name");
});
	
	
	
	
//	버튼 을 기존에 이메일 체킄로 만들고 이메일 체크가 완료되면 signUp버튼으로 확성화 되는 형식
	$(document).on("click","#entryBtn", function(){
		// 유효성 검사 로직 추가하기 

		// 메일 검증 정규식
		let mailCk = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@([0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

		if($("#email").val().match(mailCk)){

			$.ajax({
				type : "post",
				url : "checkEmail.do",
				data : {
					"email" : $("#email").val()
				},
				success : function(data) {
					let ckMail = Object.keys(data)[0];

					//					$("entryBtn").innerHTML("SIGN UP");
					let mailVal = prompt("이메일 인증 값을 입력 해주세요.");
					if(mailVal == ckMail) {
						$("#entryBtn").html('SIGN UP');
					}else {
						alert("정확한 인증 코드를 입력해주세요.");
					}
				},
				error : function(request, status, error) {
					alert("code = " + request.status + "   message = " + request.responseText + " error = " + error); // 실패 시 처리
				}
			});
		}
		});
	