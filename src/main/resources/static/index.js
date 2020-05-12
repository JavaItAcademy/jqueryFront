var prefix = "http://localhost:8080/";
var restGetById = function () {
    var id = $("input#id-value").val();

    $.ajax({
        type: 'GET',
        url: prefix + id,
        dataType: 'json',
        async: true,
        success: function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("ERROR: ");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
};