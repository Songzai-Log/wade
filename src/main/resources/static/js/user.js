function closefeedback() {
    $(".feedback").hide();
}

function submitfeeback() {
    $(".feedback").show();
}

function insertfeedback() {
    var data = {
        feedback: $("#feedback").val(),
        info: $("#info").val(),
    };
    $.ajax({
        url: "/insertFeedback",
        type: "Post",
        data:data,
        datatype: "html",
        success: function(data, status) {
            if(data=="success"){
                eval("alert(\"我们已收到你的反馈信息\")");
                $(".feedback").hide();
            }
        }
    });
}

function inputwade(wade){
    var data = {
        wade:wade.value,
    };
    $.ajax({
        url: "/Wade2Chinese",
        type: "Post",
        data:data,
        datatype: "html",
        success: function(data, status) {
            eval(data);
            /*document.getElementById("chinese").innerText=wade.value;*/
        }
    });
}


function inputchinese(chinese){
    var data = {
        chinese:chinese.value,
    };
    $.ajax({
        url: "/Chinese2Wade",
        type: "Post",
        data:data,
        datatype: "html",
        success: function(data, status) {
            eval(data);
        }
    });
}

function startcarousel() {
    $(".carousel").show();
    var data = {
        id:0,
    };
        $.ajax({
            url: "/CarouselById",
            type: "Post",
            data:data,
            datatype: "html",
            success: function(data, status) {
                eval(data);
            }
        });
}

function closecarousel() {
    $(".carousel").hide();
}


function autocarousel() {
    var data = {
        id:0,
    };
    $.ajax({
        url: "/CarouselById",
        type: "Post",
        data:data,
        datatype: "html",
        success: function(data, status) {
            eval(data);
        }
    });
}