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
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表----修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updataBooks" method="post">
        <div><input type="hidden" name="bookID" value="${book.bookID}"></div>
        <div>书籍名称：<input type="text" name="bookName" required value="${book.bookName}"></div>
        <div>书籍数量：<input type="text" name="bookCounts" required value="${book.bookCounts}"></div>
        <div>书籍详情：<input type="text" name="detail" required value="${book.detail}"></div>
        <div><input type="submit" value="修改"></div>
    </form>
</div>



</body>
</html>
