$("#checkName").click(function(){
//    SingUp에서 아이디 중복 체크용 ajax	
	/*$.ajax({
            type:"post",
            url: "/practice/checkEntry.do",
            data:{name:$("#entryName").val()},
            sucsses: function(data) {
                console.log(data);
            }
        })*/
    location.href="joinHome.do";
});