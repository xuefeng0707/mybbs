(function($) {
	$(function() {
		var usernameValid = true,
			emailValid = true;
		$('.regForm .username').change(function() {
			var $this = $(this),
				val = $this.val();
			if(val) {
				$.ajax({
					method : 'post',
					url : 'user/validateUsername.action',
					asynchronous : true,
					data : {
						username : val
					},
					success : function(result) {
						usernameValid = result === 'false';
						if(!usernameValid) {
							$('#username_tip').html('This username already exists, try another one please.').show();
						} else {
							$('#username_tip').html('This username is valid.').show();
						}
					}
				});
			}
		});
		
		$('.regForm .email').change(function() {
			var $this = $(this),
				val = $this.val();
			if(val) {
				$.ajax({
					method : 'post',
					url : 'user/validateEmail.action',
					asynchronous : true,
					data : {
						email : val
					},
					success : function(result) {
						emailValid = result === 'false';
						if(!emailValid) {
							$('#email_tip').html('The email already exists, try another one please.').show();
						} else {
							$('#email_tip').html('The email is valid.').show();
						}
					}
				});
			}
		});
		
//		$('.regForm').submit(function(e) {
//			e.preventDefault();
//			// TODO add validation
//			alert('before submit');
//		});
//		
//		$('.regForm .submit').click(function() {
//			$(this).parents('.regForm').submit();
//		});
	});
})(jQuery);