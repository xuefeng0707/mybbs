(function($) {
	$(function() {
		
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
						if(result === 'true') {
							$('#email_tip').html('The email already exists, try another one please.').show();
						} else {
							$('#email_tip').html('The email is valid.').show();
						}
					}
				});
			}
		});
	});
})(jQuery);