<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 10/02/2023
  Time: 2:54 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hiển thị danh sách khách hàng</title>
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body>
<form action="">
    <table class="table">
        <tr>
            <th colspan="4" class="text-center">Danh sách khách hàng</th>
        </tr>
        <tr>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Ảnh</th>
        </tr>
        <c:forEach var="khachHang" items="${listDanhSach}">
            <tr>
                <td>
                    ${khachHang.ten}</td>
                <td>
                   ${khachHang.ngaySinh}</td>
                <td>
                    ${khachHang.diaChi}</td>
                <td>
                    <img style="width: 70px;height: 70px" src="${khachHang.anh}" >
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>