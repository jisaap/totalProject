<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="ko">
<!-- 각각 개별적인 포프폴리오 저장 페이지 
	이미지를 하드코딩 하지 않고 개별 업로드 하ㄹ수 있도록 만들어야함 
	메인 백그라운ㄴ드 이미지는 기본적으로 있고 수정 가능하게
	포트폴리오 / STUDY섹션은 각자 개별적으로 수정 가능하게  STUDY섹션은 여러가지 백터이미지중 선택할수 있도록 구현
	 -->

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Welcome!!</title>
<link rel="stylesheet" href="${path }/resources/css/index.css" />
<link rel="stylesheet" href="${path }/resources/css/modal.css" />
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

</head>
<body>
	<div class="container">
		<h1 id="title" class="btn">Try For a Better Future</h1>

		<div class="js-clock">
			<h1 class="js-Title">00:00:00</h1>
		</div>

		<form class="js-form form">
			<input type="text" placeholder="What is your Name ?">
		</form>
		<h4 class="js-grettings grettings"></h4>


		<form class="js-toDoForm">
			<input type="text" placeholder="Write a To Do" />
		</form>
		<ul class="js-toDoList">

		</ul>
		<div class="indexBtn-container">
			<button class="fun-btn modalBtn">접속</button>
		</div>

	</div>
	<input type='hidden' class='urlSender' value="${path}" />";
	<!-- 모달창 -->
	<div class="modal">
		<div class="modal_text">
			<span class="modal_span">사용할 이름을 입력해 주세요.</span> 
			<input class="modal_p" type="text" id="entryName" name="entryName">
		</div>
		<div class="modal_x" id="checkName">접속</div>
		<div class="modal_x">닫기</div>
	</div>
	<!-- 백그라운드 -->
	<div class="modal_back"></div>



	<span class="js-weather"></span>

	<script src="${path }/resources/js/gretting.js"></script>
	<script src="${path }/resources/js/clock.js"></script>
	<script src="${path }/resources/js/todo.js"></script>
	<script src="${path }/resources/js/index.js"></script>
	<script src="${path }/resources/js/bg.js"></script>
	<script src="${path }/resources/js/weather.js"></script>
	<script src="${path }/resources/js/modal.js"></script>
	<script src="${path }/resources/js/checkEntry.js"></script>


</body>
</html>