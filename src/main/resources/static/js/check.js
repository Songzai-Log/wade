function initHtml() {
    $("table tbody tr").remove();
    $.ajax({
        url: "/getFeedbackInit",
        type: "Post",
        data:"",
        datatype: "html",
        success: function(data, status) {
           eval(data);
        }
    });
}

function deletefeedback(id) {
    if(confirm("确定删除当前记录？")) {
        $.ajax({
            url: "/deleteFeedback",
            type: "Post",
            data: "id=" + id,
            datatype: "html",
            success: function (data, status) {
                eval(data);
            }
        })
    }
}

function closechange() {
    $(".change").hide();
}

function add() {
    $(".change").show();
}

function addwade() {
    var data = {
        id: 0,
        wade: $("#wade").val(),
        chinese: $("#chinese").val(),
    };
    $.ajax({
        url: "/insertWade",
        type: "Post",
        data:data,
        datatype: "html",
        success: function(data, status) {
            if(data=="success"){
                eval("alert(\"添加成功\")");
                $(".change").hide();
            }
        }
    });
}


function delwade() {
    var data = {
        id: 0,
        wade: $("#wade").val(),
        chinese: $("#chinese").val(),
    };
    $.ajax({
        url: "/deleteWade",
        type: "Post",
        data:data,
        datatype: "html",
        success: function(data, status) {
            if(data=="success"){
                eval("alert(\"删除成功\")");
                $(".change").hide();
            }
        }
    });
}

function closeupdate() {
    $(".update").hide();
}

function update() {
    $(".update").show();
}

function updatewade() {
    var data = {
        oldid:0,
        oldwade: $("#oldwade").val(),
        newwade: $("#newwade").val(),
        newid:0,
        oldchinese: $("#oldchinese").val(),
        newchinese: $("#newchinese").val(),
    };
    $.ajax({
        url: "/updateWade",
        type: "Post",
        data:data,
        datatype: "html",
        success: function(data, status) {
            if(data=="success"){
                eval("alert(\"更新成功\")");
                $(".update").hide();
            }
        }
    });
}