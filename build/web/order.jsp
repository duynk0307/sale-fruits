<%-- 
    Document   : order
    Created on : Nov 7, 2021, 8:11:20 PM
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
        <title>Đơn Hàng Của Tôi</title>

        <!-- Google Font -->
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
    </head>

    <body>
        <!-- Page Preloder -->
        <div id="preloder">
            <div class="loader"></div>
        </div>

        <!-- Humberger Begin -->
        <div class="humberger__menu__overlay"></div>
        <div class="humberger__menu__wrapper">
            <div class="humberger__menu__logo">
                <a href="#"><img src="img/logo.png" alt=""></a>
            </div>
            <div class="humberger__menu__cart">
                <ul>
                    <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li>
                    <li><a href="#"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
                </ul>
                <div class="header__cart__price">item: <span>$150.00</span></div>
            </div>
            <div class="humberger__menu__widget">
                <div class="header__top__right__language">
                    <img src="img/language.png" alt="">
                    <div>English</div>
                    <span class="arrow_carrot-down"></span>
                    <ul>
                        <li><a href="#">Spanis</a></li>
                        <li><a href="#">English</a></li>
                    </ul>
                </div>
                <div class="header__top__right__auth">
                    <a href="./login.jsp"><i class="fa fa-user"></i> Login</a>
                </div>
            </div>
            <nav class="humberger__menu__nav mobile-menu">
                <ul>
                    <li class="active"><a href="./HomeControl">Home</a></li>
                    <li><a href="./ShopControl">Shop</a></li>
                    <li><a href="#">Pages</a>
                        <ul class="header__menu__dropdown">
                            <li><a href="./shoppingcart">Shoping Cart</a></li>
                            <li><a href="./checkout">Check Out</a></li>
                        </ul>
                    </li>
                    <li><a href="./contact">Contact</a></li>
                </ul>
            </nav>
            <div id="mobile-menu-wrap"></div>
            <div class="header__top__right__social">
                <a href="#"><i class="fa fa-facebook"></i></a>
                <a href="#"><i class="fa fa-twitter"></i></a>
                <a href="#"><i class="fa fa-linkedin"></i></a>
                <a href="#"><i class="fa fa-pinterest-p"></i></a>
            </div>
            <div class="humberger__menu__contact">
                <ul>
                    <li><i class="fa fa-envelope"></i> hello@colorlib.com</li>
                    <li>Free Shipping for all Order of $99</li>
                </ul>
            </div>
        </div>
        <!-- Humberger End -->

        <!-- Header Section Begin -->
        <!-- Header Section Begin -->
        <header class="header">
            <div class="header__top">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-6 col-md-6">
                            <div class="header__top__left">
                                <ul>
                                    <li><i class="fa fa-envelope"></i> hellogroup6@gmail.com</li>
                                    <li>Miễn phí giao hàng cho đơn hàng từ 500.000 đồng</li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6">
                            <div class="header__top__right">
                                <div class="header__top__right__social">
                                    <a href="#"><i class="fa fa-facebook"></i></a>
                                    <a href="#"><i class="fa fa-twitter"></i></a>
                                    <a href="#"><i class="fa fa-linkedin"></i></a>
                                    <a href="#"><i class="fa fa-pinterest-p"></i></a>
                                </div>
                                <c:if test="${account == null}">
                                    <div class="header__top__right__auth">
                                        <a href="./login.jsp"><i class="fa fa-user"></i> Đăng nhập</a>
                                    </div>
                                </c:if>
                                <c:if test="${account != null}">
                                    <div class="header__top__right__auth">
                                        <a href="./userinfo"><i class="fa fa-user"></i>${account.username}  </a>
                                    </div>
                                    <div class="header__top__right__auth">
                                        <a href="Logout"><i class="fa fa-user"></i> Đăng xuất</a>
                                    </div>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
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
                                <li><a href="./ShopControl">Shop</a></li>
                                <li class="active"><a href="#">Pages</a>
                                    <ul class="header__menu__dropdown">
                                        <!--                                        <li><a href="./shop-details.jsp">Shop Details</a></li>-->
                                        <li><a href="./shoppingcart">Giỏ hàng</a></li>
                                        <li><a href="./checkout">Thanh toán</a></li>
                                        <li><a href="./order">Đơn hàng đã đặt</a></li>
                                    </ul>
                                </li>
                                <li><a href="./contact">Liên hệ</a></li>
                                    <c:if test="${account.roleID == 1}">
                                    <li><a href="./user">Administrator</a></li>
                                    </c:if>
                            </ul>
                        </nav>
                    </div>
                    <c:if test="${account != null}">
                        <c:if test="${cItem != null}">
                            <div class="col-lg-2">
                                <div class="header__cart">
                                    <ul>
                                        <li><a href="./shoppingcart"><i class="fa fa-shopping-bag"></i> <span>${cItem.size()}</span></a></li>
                                    </ul>
                                    <div class="header__cart__price"> <span>${cSession.total}vnd</span></div>
                                </div>
                            </div>
                        </c:if>
                        <c:if test="${cItem == null}">
                            <div class="col-lg-2">
                                <div class="header__cart">
                                    <ul>
                                        <li><a href="./shoppingcart"><i class="fa fa-shopping-bag"></i> <span>0</span></a></li>
                                    </ul>
                                    <div class="header__cart__price"> <span>${cSession.total}vnd</span></div>
                                </div>
                            </div>
                        </c:if>
                    </c:if>
                    <c:if test="${account == null}">
                        <div class="col-lg-2">
                            <div class="header__cart">
                                <ul>
                                    <li><a href="./shoppingcart"><i class="fa fa-shopping-bag"></i> <span>0</span></a></li>
                                </ul>
                                <div class="header__cart__price"> <span>0.00vnd</span></div>
                            </div>
                        </div>
                    </c:if>
                </div>
                <div class="humberger__open">
                    <i class="fa fa-bars"></i>
                </div>
            </div>
        </header>
        <!-- Header Section End -->
        <!-- Shoping Cart Section Begin -->
        <section class="shoping-cart spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="shoping__cart__table">
                            <form action="./update" method="post">
                                <table>
                                    <thead>
                                        <tr>
                                            <th class="shoping__product">Mã đơn hàng</th>
                                            <th class="shoping__cart__price">Ngày đặt</th>
                                            <th>Tình trạng</th>
                                            <th>.....</th>
                                            <th>Actions</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:if test="${!listOrder.isEmpty()}">
                                            <c:forEach items="${listOrder}" var="item" >
                                                <tr>
                                                    <td class="shoping__cart__item">
                                                        <h3><c:out value="${item.orderID}" /></h3>
                                                    </td>
                                                    <td >
                                                        <c:out value="${item.dateofOrder}" />
                                                    </td>
                                                    <td>
                                                        <c:if test="${item.delivered != null}">
                                                            <c:out value="Đã giao ${item.delivered}" />
                                                        </c:if>
                                                        <c:if test="${item.delivered == null}">
                                                            <c:out value="Chưa giao" />
                                                        </c:if>
                                                    </td>
                                                    
                                                    <td></td>
                                                    <c:if test="${item.delivered==null}">
                                                        <td class="shoping__cart__item__close">
                                                            <a href="deleteorder?orderID=${item.orderID}"><span class="icon_close"></span></a>
                                                        </td>
                                                    </c:if>
                                                </tr>
                                            </c:forEach>
                                        </c:if>
                                        <c:if test="${listOrder.isEmpty()}">
                                            <tr>
                                                <td class="shoping__cart__item">Bạn chưa từng mua gì!</td>
                                            </tr>
                                        </c:if>
                                    </tbody>
                                </table>
                            </form>
                        </div>
                    </div>
                </div>
        </section>
        <!-- Shoping Cart Section End -->

        <!-- Footer Section Begin -->
        <footer class="footer spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-sm-6">
                        <div class="footer__about">
                            <div class="footer__about__logo">
                                <a href="./index.jsp"><img src="img/logo.png" alt=""></a>
                            </div>
                            <ul>
                                <li>Địa chỉ: Ninh Kiều, Cần Thơ</li>
                                <li>Số điện thoại: +8436 3323 084</li>
                                <li>Email: hellogroup6@gmail.com</li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 col-sm-6 offset-lg-1">
                        <div class="footer__widget">
                            <h6>Useful Links</h6>
                            <ul>
                                <li><a href="./HomeControl">Trang chủ</a></li>
                                <li><a href="./contact">Thông tin liên hệ</a></li>
                                <li><a href="./ShopControl">Mua ngay</a></li>
                                <li><a href="./shoppingcart">Giỏ hàng</a></li>
                                <li><a href="./checkout">Thủ tục thanh toán</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-12">
                        <div class="footer__widget">
                            <h6>Đến Ngay Với Chúng Tôi</h6>
                            <p>Thời gian hoạt động: từ 7:00 đến 21:00 hằng ngày.</p>

                            <p>Miễn phí giao hàng trong phạm vi nội ô Ninh Kiều.</p>
                            <div class="footer__widget__social">
                                <a href="#"><i class="fa fa-facebook"></i></a>
                                <a href="#"><i class="fa fa-instagram"></i></a>
                                <a href="#"><i class="fa fa-twitter"></i></a>
                                <a href="#"><i class="fa fa-pinterest"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="footer__copyright">
                            <div class="footer__copyright__text"><p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p></div>
                            <div class="footer__copyright__payment"><img src="img/payment-item.png" alt=""></div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <!-- Footer Section End -->

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
