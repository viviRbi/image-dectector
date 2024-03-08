$(function () {
    $('#submitBio').click(function (e) {
        //Prevent default submission of form
        e.preventDefault();
        $.post({
            url: _ctx + 'save-bio',
            data: $('#bioForm').serialize(),
            success: function (res) {
                if (res.validated) {
                    //take your successful action here; you may want to redirect to another page
                    alert("Registration Successful");
                } else {
                    $.each(res.errorMessages, function (key, value) {
                        $('input[name=' + key + ']').after('<span class="error">' + value + '</span>');
                    });
                }
            }
        })
    });
});
