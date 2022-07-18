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
<h3>Tên: ${product.name}</h3>
<h3>Năm Sinh: ${product.yearOfBirth}</h3>
<h3>Giới Tính : ${product.gender}</h3>
<h3>Quấc Tịch: ${product.nationality}</h3>
<h3>Số hộ chiếu hoặc CMND: ${product.numberId}</h3>
<h3>Thông Tin Đi Lại: ${product.vehicle}</h3>
<h3>Số Hiệu Phương Tiện: ${product.vehicleOfCode}</h3>
<h3>Số Ghế: ${product.seatOfCode}</h3>
<h3>Ngày Khởi Hành: ${product.startDay}</h3>
<h3>Ngày Kết Thúc: ${product.endDay}</h3>
<h3>Trong Vòng 14 Ngày Có Đi Đâu Không: ${product.info14Day}</h3>
</body>
</html>
