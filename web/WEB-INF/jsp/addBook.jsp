<%--
  Created by IntelliJ IDEA.
  User: XZR
  Date: 2022/9/4
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表----新增书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div>书籍名称：<input type="text" name="bookName" required></div>
        <div>书籍数量：<input type="text" name="bookCounts" required></div>
        <div>书籍详情：<input type="text" name="detail" required></div>
        <div><input type="submit" value="添加"></div>
    </form>
</div>



</body>
</html>
