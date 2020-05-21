	$(function(){
	    // modalCenter
	    function modalCenter(){
	        var modal_w = $(".modal").width()/2;
	        $(".modal").css("margin-left", -modal_w);
	        var modal_h = $(".modal").height()/2;
	        $(".modal").css("margin-top", -modal_h);
	    }
	    modalCenter();
	    $(window).resize(function(){
	        modalCenter();
	    });
	    // modal on/off
	    function modalOn(text){
	        $(".modal").addClass("modal_on");
	        $(".modal_back").addClass("back_on");
	        $("body").addClass("body_lock");
	    }
	    function modalOff(){
	        $(".modal").removeClass("modal_on");
	        $(".modal_back").removeClass("back_on");
	        $("body").removeClass("body_lock");
	    }
	    $(".modalBtn").click(function(){
	        modalOn();
	    });
	    $(".modal_x").click(function(){
	        modalOff();
	    });
	    $(".modal_back").click(function(){
	        modalOff();
	    });
	});

		/*//버튼 누를 때
	$('.fun-btn').on('click', function(event) {
		  $(this).toggleClass('start-fun');
		  var $page = $('.page');
		  $page.toggleClass('color-bg-start')
		    .toggleClass('bg-animate-color');

		  //change text when when button is clicked

		  $(this).hasClass('start-fun') ?
		    $(this).text('stop the fun') :
		    $(this).text('start the fun');

		});*/