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
<h3>Tên: ${medical.name}</h3>
<h3>Năm Sinh: ${medical.yearOfBirth}</h3>
<h3>Giới Tính : ${medical.gender}</h3>
<h3>Quấc Tịch: ${medical.nationality}</h3>
<h3>Số hộ chiếu hoặc CMND: ${medical.numberId}</h3>
<h3>Thông Tin Đi Lại: ${medical.vehicle}</h3>
<h3>Số Hiệu Phương Tiện: ${medical.vehicleOfCode}</h3>
<h3>Số Ghế: ${medical.seatOfCode}</h3>
<h3>Ngày Khởi Hành: ${medical.startDay}</h3>
<h3>Ngày Kết Thúc: ${medical.endDay}</h3>
<h3>Trong Vòng 14 Ngày Có Đi Đâu Không: ${medical.info14Day}</h3>
</body>
</html>
