<%--
  Created by IntelliJ IDEA.
  User: hella
  Date: 7/15/2022
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Tờ Khai Y Tế</h1>
<table class="table table-bordered border-primary">
    <thead>
    <tr>
        <th>Tên</th>
        <th>Năm Sinh</th>
        <th>Thông Tin Đi Lại</th>
        <th>Ngày Khởi Hành</th>
        <th>Ngày Kết Thúc</th>
        <th>Trong Vòng 14 Ngày Có Đi Đâu Không</th>
        <th>Edit</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${medical.name}</td>
        <td>${medical.yearOfBirth}</td>
        <td>${medical.vehicle}</td>
        <td>${medical.startDay}</td>
        <td>${medical.endDay}</td>
        <td>${medical.info14Day}</td>
    </tr>
    </tbody>
</table>
</body>
</html>
