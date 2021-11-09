<%-- 
    Document   : import
    Created on : Nov 9, 2021, 7:50:10 AM
    Author     : Nguyen Khanh Duy;
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Danh Sách Nhập Hàng</title>
        <!-- Css Styles -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://fonts.googleapis.com/css2?family=Inter:wght@200;300;400;600;900&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="css/nice-select.css" type="text/css">
        <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
        <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
        <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <style>
            body {
                color: #566787;
                background: #f5f5f5;
                font-family: 'Roboto', sans-serif;
            }
            .table-responsive {
                margin: 30px 0;
            }
            .table-wrapper {
                min-width: 1000px;
                background: #fff;
                padding: 20px;
                box-shadow: 0 1px 1px rgba(0,0,0,.05);
            }
            .table-title {
                padding-bottom: 10px;
                margin: 0 0 10px;
                min-width: 100%;
            }
            .table-title h2 {
                margin: 8px 0 0;
                font-size: 22px;
            }
            .search-box {
                position: relative;        
                float: right;
            }
            .search-box input {
                height: 34px;
                border-radius: 20px;
                padding-left: 35px;
                border-color: #ddd;
                box-shadow: none;
            }
            .search-box input:focus {
                border-color: #3FBAE4;
            }
            .search-box i {
                color: #a0a5b1;
                position: absolute;
                font-size: 19px;
                top: 8px;
                left: 10px;
            }
            table.table tr th, table.table tr td {
                border-color: #e9e9e9;
            }
            table.table-striped tbody tr:nth-of-type(odd) {
                background-color: #fcfcfc;
            }
            table.table-striped.table-hover tbody tr:hover {
                background: #f5f5f5;
            }
            table.table th i {
                font-size: 13px;
                margin: 0 5px;
                cursor: pointer;
            }
            table.table td:last-child {
                width: 130px;
            }
            table.table td a {
                color: #a0a5b1;
                display: inline-block;
                margin: 0 5px;
            }
            table.table td a.view {
                color: #03A9F4;
            }
            table.table td a.edit {
                color: #FFC107;
            }
            table.table td a.delete {
                color: #E34724;
            }
            table.table td i {
                font-size: 19px;
            }    
            .pagination {
                float: right;
                margin: 0 0 5px;
            }
            .pagination li a {
                border: none;
                font-size: 95%;
                width: 30px;
                height: 30px;
                color: #999;
                margin: 0 2px;
                line-height: 30px;
                border-radius: 30px !important;
                text-align: center;
                padding: 0;
            }
            .pagination li a:hover {
                color: #666;
            }	
            .pagination li.active a {
                background: #03A9F4;
            }
            .pagination li.active a:hover {        
                background: #0397d6;
            }
            .pagination li.disabled i {
                color: #ccc;
            }
            .pagination li i {
                font-size: 16px;
                padding-top: 6px
            }
            .hint-text {
                float: left;
                margin-top: 6px;
                font-size: 95%;
            } 
            form {
                border: 5px solid #f1f1f1;
            }
            input[type=text], input[type=password] {
                width: 100%;
                padding: 16px 8px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }
            .icon {
                font-size: 50px;
                display: flex;
                justify-content: center;
                color: #4286f4;
            }
            button {
                background-color: #4286f4;
                color: white;
                padding: 14px 0;
                margin: 10px 0;
                border: none;
                cursor: grab;
                width: 48%;
            }
            h1 {
                text-align:center;
                font-size:18px;
            }
            button:hover {
                opacity: 0.8;
            }
            .formcontainer {
                text-align: center;
                margin: 24px 50px 12px;
            }
            .container {
                padding: 16px 0;
                text-align:left;
            }
            span.psw {
                float: right;
                padding-top: 0;
                padding-right: 15px;
            }
            .success {
                border: 1px solid;
                margin: 10px 0px;
                padding: 15px 10px 15px 50px;
                background-repeat: no-repeat;
                background-position: 10px center;
            }
            .success {
                color: #4F8A10;
                background-color: #DFF2BF;
                background-image: url('https://i.imgur.com/Q9BGTuy.png');
            }
            /* Change styles for span on extra small screens */
            @media screen and (max-width: 300px) {
                span.psw {
                    display: block;
                    float: none;
                }
            </style>
            <script>
                $(document).ready(function () {
                    $('[data-toggle="tooltip"]').tooltip();
                });
                function validateForm(){
                    // lay value
                    let ipID = document.forms["myForm"]["ipID"].value;
                    var error = false;
                    if (/^[a-zA-Z0-9]{3,4}$/.test(ipID) === false) {
                        document.getElementById("errid").innerHTML = "Import id not contain special characters";
                        error = true;
                    } else {
                        document.getElementById("errid").innerHTML = "";
                    }
                    if (error) {
                        return false;
                    }
                    return true;
                }
            </script>
        </head>
        <body>
            <header class="header">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3">
                            <div class="header__logo">
                                <a href="./HomeControl"><img src="img/logo.png" alt=""></a>
                            </div>
                        </div>
                        <div class="col-lg-7">
                            <nav class="header__menu">
                                <ul>
                                    <li><a href="./HomeControl">Trang chủ</a></li>
                                    <li><a href="./user" class="active" >Người dùng</a></li>
                                    <li><a href="./product">Sản phẩm</a></li>
                                    <li><a href="./allorder">Đơn hàng</a></li>
                                        <c:if test="${account != null}">
                                        <li><a href="./userinfo"><i class="fa fa-user"></i>${account.username}  </a></li>
                                        <li><a href="Logout"><i class="fa fa-sign-out"></i>Đăng xuất</a></li>
                                        </c:if>
                                </ul>
                            </nav>
                        </div>
                    </div>
                    <div class="humberger__open">
                        <i class="fa fa-bars"></i>
                    </div>
                </div>
            </header>
            <div class="container-xl">
                <div class="table-responsive">
                    <div class="table-wrapper">
                        <div class="table-title">
                            <div class="row">
                                <div class="col-sm-8"><h2>Danh Sách  <b>Đơn Hàng</b></h2></div>
                                <div class="col-sm-4">

                                </div>
                            </div>
                        </div>
                        <table class="table table-striped table-hover table-bordered">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Import Date </th>
                                    <th>User ID</th>
                                    <th>Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${listIp}" var="li">
                                    <tr>
                                        <td>${li.ipID}</td>
                                        <td>${li.ipDate}</td>
                                        <td>${li.userID}</td>
                                        <td>
                                            <a href="importdetails?ipID=${li.ipID}" class="edit" title="View" data-toggle="tooltip"><i class="fa fa-view"></i></a>
                                        </td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                        <div class="clearfix">
                            <div class="hint-text">Showing <b>${shownumber}</b> out of <b>${totalImport}</b> entries</div>
                            <ul class="pagination">
                                <li class="page-item disabled"><i class="fa fa-angle-double-left"></i></li>
                                    <c:forEach begin="1" end="${endP}" var="i">
                                    <li class="page-item ${activePage == i ? "active": ""}"><a href="import?index=${i}" class="page-link">${i}</a></li>
                                    </c:forEach>
                                <li class="page-item disabled"><i class="fa fa-angle-double-right"></i></li>
                            </ul>
                        </div>
                    </div>
                </div>  
            </div>
            <c:if test="${sucess != null}">
                <div class="success">
                    ${sucess}
                </div>
            </c:if>
            <form action="addimport?index=${activePage}" name="myForm" onsubmit="return validateForm()" method="POST">
                <br>
                <br>
                <div class="icon">
                    <i class="fa fa-product-hunt"></i>
                </div>
                <h1 style="font-size:30px">ADD IMPORT</h1>
                <div class="formcontainer">
                    <div class="container">
                        <label for="ipID"><strong>Import ID</strong></label>
                        <input type="text" placeholder="Enter Import ID, example: i21" minlength="3" maxlength="4" name="ipID" required>
                        <jsp:useBean id="now" class="java.util.Date" />
                        <fmt:formatDate var="dateNow" value="${now}" pattern="yyyy-MM-dd" />
                        <label for="ipDate"><strong>Import Date</strong></label>
                        <input type="text" placeholder="Enter Import Date" name="ipDate" value="${dateNow}" readonly>
                        <label for="userID"><strong>User ID</strong></label>
                        <input type="text" name="userID" value="${account.username}" readonly>

                    </div>
                    <button type="submit"><strong>ADD PRODUCT</strong></button>
                    <br>
                    <button type="reset"><strong>RESET</strong></button>
                </div>
            </form>
            <!-- Js Plugins -->
            <script src="js/jquery-3.3.1.min.js"></script>
            <script src="js/bootstrap.min.js"></script>
            <script src="js/jquery.nice-select.min.js"></script>
            <script src="js/jquery-ui.min.js"></script>
            <script src="js/jquery.slicknav.js"></script>
            <script src="js/mixitup.min.js"></script>
            <script src="js/owl.carousel.min.js"></script>
            <script src="js/main.js"></script>
        </body>
    </html>