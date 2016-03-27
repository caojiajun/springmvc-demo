<html>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<body>
<h2>Welcome!</h2>
用户搜索：<input type="text" id="key" name="key"><input type="button" id="search" value="搜索"><br>
<h3><a href="user/list">所有用户</a></h3><br>
</body>
</html>

<script src="jquery-2.2.2.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
        alert("==");
       $("#search").click(function() {
           alert("!!!");
           $.get("/user/json/users/list?key=z", function(data, status){
               alert(data);
               alert(status);
           })
       })
    });

</script>
