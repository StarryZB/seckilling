function check(){
    var id = document.getElementById("id").value;
    if (id == "") {
        alert("请输入用户Id");
        return false;
    } else {
        document.getElementById("form").submit();
        return true;
    }
}