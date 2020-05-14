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
            $(".hello-reaction").html('<h1>' + result.id + ' ' + result.name + '</h1>');
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("ERROR: ");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
};

var restPost = function () {
    var name = $("input#name-value").val(); // Получение значения поля Name

    var jsonObject = {
        name: name
    }; // Создание объекта
    console.log("Request: " + name); // Пишем в лог
    $.ajax({
        type: 'POST', // Тип запроса
        url: prefix, // Адрес запроса, куда отправить
        dataType: 'json', // Тип
        async: true, // Асинхронность (почитать про это)
        contentType: 'application/json', // Тип №2
        data: JSON.stringify(jsonObject), // Конвертируем объект в строковый JSON
        success: function(result) { // Функция отработает при успешном сохранении
            console.log(result);
            $(".hello-reaction").html('<h1>' + result.id + ' ' + result.name + '</h1>'); // Отображение на фронте, там где стоит параграф с классом hello-reaction
        },
        error: function (jqXHR, textStatus, errorThrown) { // В случае ошибки отобразить в консоли
            console.log("ERROR: ");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
};

var restGetAll = function () {
    var str = "";
    $.ajax({
        type: 'GET',
        url: prefix + 'all',
        dataType: 'json',
        async: true,
        success: function (result) {
            console.log(result);
            $.each(result, function(index, value){
                str = str + '<h1>' + value.id + ' ' + value.name + '</h1>';
            });
            console.log(str);
            $(".hello-reaction").html(str);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("ERROR: ");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
};

var update = function() {
    var name = $("input#name-value").val(); // Получение значения поля Name
    var id = $("input#id-value").val(); // Получение значения поля Id

    var jsonObject = {
        id: id,
        name: name
    }; // Создание объекта
    console.log("Request: " + name); // Пишем в лог
    $.ajax({
        type: 'POST', // Тип запроса
        url: prefix, // Адрес запроса, куда отправить
        dataType: 'json', // Тип
        async: true, // Асинхронность (почитать про это)
        contentType: 'application/json', // Тип №2
        data: JSON.stringify(jsonObject), // Конвертируем объект в строковый JSON
        success: function(result) { // Функция отработает при успешном сохранении
            console.log(result);
            $(".hello-reaction").html('<h1>' + result.id + ' ' + result.name + '</h1>'); // Отображение на фронте, там где стоит параграф с классом hello-reaction
        },
        error: function (jqXHR, textStatus, errorThrown) { // В случае ошибки отобразить в консоли
            console.log("ERROR: ");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
};