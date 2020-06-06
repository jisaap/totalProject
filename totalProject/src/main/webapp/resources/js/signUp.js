/**
 * 회원가입 하는 페이지로 이동후 자기 페이지 템플릿 고르는 페이지로 넘기기
 */

let oldVal

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
			}else {
				oldVal = $("#name").val();
				$("#name").attr("id","checkedId");
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
	
	