<%-- 
    Document   : login
    Created on : Oct 22, 2021, 3:14:57 PM
    Author     : Nguyen Khanh Duy;
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Ogani Template">
        <meta name="keywords" content="Ogani, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Login</title>
        
        <link href="https://fonts.googleapis.com/css2?family=Inter:wght@200;300;400;600;900&display=swap" rel="stylesheet">
        <!-- Css Styles -->
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="css/nice-select.css" type="text/css">
        <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
        <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
        <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <link rel="stylesheet" href="css/login-form.css" type="text/css">
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
                    <div class="col-lg-6">
                        <nav class="header__menu">
                            <ul>
                                <li class="active"><a href="./HomeControl">Trang chủ</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <div class="humberger__open">
                    <i class="fa fa-bars"></i>
                </div>
            </div>
        </header>
        <div class="alert-success">
            <c:if test="${regisSucess != null}">
                ${regisSucess}
            </c:if>
        </div>
        <div class="login-wrap">
            <div class="login-html">
                <div><p>${signupMessage}</p></div>
                <c:if test="${signupMessage != null}">
                    <input id="tab-1" type="radio" name="tab" class="sign-in" ><label for="tab-1" class="tab">Đăng nhập</label>
                    <input id="tab-2" type="radio" name="tab" class="sign-up" checked><label for="tab-2" class="tab">Đăng ký</label>
                </c:if>
                <c:if test="${signupMessage == null}">
                    <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Đăng nhập</label>
                    <input id="tab-2" type="radio" name="tab" class="sign-up" ><label for="tab-2" class="tab">Đăng ký</label>
                </c:if>
                <div class="login-form">
                    <form action="LoginControl" method="post">
                        <div class="sign-in-htm">
                            <div class="group">
                                <label for="user" class="label">Tên tài khoản</label>
                                <input name="username" id="user" type="text" class="input">
                            </div>
                            <div class="group">
                                <label for="pass" class="label">Mật khẩu</label>
                                <input name="password" id="pass" type="password" class="input" data-type="password">
                            </div>
                            <div class="group">
                                <input type="submit" class="button" value="Đăng nhập">
                            </div>
                            <div class="hr"></div>
                            <div class="group">
                                <p class="text-danger">${message}</p>
                            </div>
                        </div>
                    </form>
                    <form action="signup" method="post">
                        <div class="sign-up-htm">
                            <div class="group">
                                <label for="user" class="label">Tên tài khoản</label>
                                <input name="username" id="user" type="text" class="input">
                            </div>
                            <div class="group">
                                <label for="pass" class="label">Mật khẩu</label>
                                <input name="password"id="pass" type="password" class="input" data-type="password">
                            </div>
                            <div class="group">
                                <label for="pass" class="label">Họ và tên</label>
                                <input name="fullname" id="pass" type="text" class="input">
                            </div>
                            <div class="group">
                                <label for="pass" class="label">Email</label>
                                <input name="email" id="pass" type="text" class="input">
                            </div>
                            <div class="group">
                                <label for="pass" class="label">Số điện thoại</label>
                                <input name="phone" id="pass" type="text" class="input">
                            </div>
                            <div class="group">
                                <input type="submit" class="button" value="Đăng ký">
                            </div>
                        </div>
                    </form>
                    </form>
                </div>
            </div>
        </div>
    </div>

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
