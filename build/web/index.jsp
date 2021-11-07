<%-- 
    Document   : index
    Created on : Oct 21, 2021, 7:34:53 PM
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
        <title>Ogani | Template</title>

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
                    <li><a href="./shoppingcart"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
                </ul>
                <div class="header__cart__price">item: <span>$150.00</span></div>
            </div>
            <div class="humberger__menu__widget">
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
                            <!--<li><a href="./shop-details.jsp">Shop Details</a></li>-->
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
                                        <a href="Logout"><i class="fa fa-sign-out"></i>Đăng xuất</a>
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
                                <li class="active"><a href="./HomeControl">Trang chủ</a></li>
                                <li><a href="./ShopControl">Shop</a></li>
                                <li><a href="#">Pages</a>
                                    <ul class="header__menu__dropdown">
                                        <!--                                        <li><a href="./shop-details.jsp">Shop Details</a></li>-->
                                        <li><a href="./shoppingcart">Giỏ hàng</a></li>
                                        <li><a href="./checkout">Thanh toán</a></li>
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

        <!-- Hero Section Begin -->
        <section class="hero">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="hero__categories">
                            <div class="hero__categories__all">
                                <i class="fa fa-bars"></i>
                                <span>Các loại trái cây</span>
                            </div>
                            <ul>
                                <c:forEach var="cate" items="${listCate}">
                                    <li><a href="ShopControl?cid=${cate.cateID}">${cate.cateName}</a></li>
                                    </c:forEach>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-9">
                        <div class="hero__search">
                            <div class="hero__search__form">
                                <form action="#">
                                    <div class="hero__search__categories">
                                        Bạn muốn tìm gì
                                        <span class="arrow_carrot-down"></span>
                                    </div>
                                    <input type="text" placeholder="What do yo u need?">
                                    <button type="submit" class="site-btn">Tìm kiếm</button>
                                </form>
                            </div>
                            <div class="hero__search__phone">
                                <div class="hero__search__phone__icon">
                                    <i class="fa fa-phone"></i>
                                </div>
                                <div class="hero__search__phone__text">
                                    <h5>+84363 323 084</h5>
                                    <span>hỗ trợ 24/7 </span>
                                </div>
                            </div>
                        </div>
                        <div class="hero__item set-bg" data-setbg="img/hero/banner.jpg">
                            <div class="hero__text">
                                <c:forEach items="${listBnr}" var="b">
                                    <c:if test="${b.bnrID == 1}">
                                        <span>${b.content}</span>
                                    </c:if>
                                    <c:if test="${b.bnrID == 2}">
                                        <h2>${b.content}</h2>
                                    </c:if>
                                    <c:if test="${b.bnrID == 3}">
                                        <p>${b.content}</p>
                                    </c:if>
                                </c:forEach>
                                <a href="./ShopControl" class="primary-btn">MUA NGAY</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Hero Section End -->

        <!-- Categories Section Begin -->
        <section class="categories">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="section-title">
                            <h2>Sản phẩm đến từ</h2>
                        </div>
                    </div>
                    <div class="categories__slider owl-carousel">
                        <c:forEach var="p" items="${Logo1}">
                            <div class="col-lg-3">
                                <div class="categories__item set-bg" data-setbg="${p.sourceLogo}">
                                    <h5><a href="ShopControl?srcId=${p.sourceID}">${p.sourceName}</a></h5>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </section>
        <!-- Categories Section End -->

        <!-- Featured Section Begin -->
        <section class="featured spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="section-title">
                            <h2>Sản phẩm nổi bật</h2>
                        </div>
                        <div class="featured__controls">
                            <ul>
                                <li class="active" data-filter="*">Tất cả</li>
                                    <c:forEach items="${listFeat}" var="f">
                                    <li data-filter=".${f.cateID}">${f.cateName}</li>
                                    </c:forEach>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="row featured__filter">
                    <c:forEach var="p" items="${listPro}">
                        <div class="col-lg-3 col-md-4 col-sm-6 mix ${p.cateID}">
                            <div class="featured__item">
                                <div class="featured__item__pic set-bg" data-setbg="${p.image}">
                                    <ul class="featured__item__pic__hover">
                                        <!--                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                                                <li><a href="#"><i class="fa fa-retweet"></i></a></li>-->
                                        <li><a href="<c:url value="AddToCart">
                                                   <c:param name="pID" value="${p.productID}"/>
                                               </c:url>"><i class="fa fa-shopping-cart"></i></a></li>
                                    </ul>
                                </div>
                                <div class="featured__item__text">
                                    <h6><a href="detailsControl?sid=${p.productID}">${p.title}</a></h6>
                                    <h5>${p.salePrice}đ</h5>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </section>
        <!-- Featured Section End -->

        <!-- Banner Begin -->
        <div class="banner">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="banner__pic">
                            <img src="img/banner/banner-1.jpg" alt="">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="banner__pic">
                            <img src="img/banner/banner-2.jpg" alt="">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Banner End -->

        <!-- Latest Product Section Begin -->
        <section class="latest-product spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4 col-md-6">
                        <div class="latest-product__text">
                            <h4>Sản phẩm mới nhất</h4>
                            <div class="latest-product__slider owl-carousel">
                                <div class="latest-prdouct__slider__item">
                                    <c:forEach var="lp" items="${lastPro}" end="2">
                                        <a href="detailsControl?sid=${lp.productID}" class="latest-product__item">
                                            <div class="latest-product__item__pic">
                                                <img src="${lp.image}" alt="">
                                            </div>
                                            <div class="latest-product__item__text">
                                                <h6>${lp.title}</h6>
                                                <span>${lp.salePrice}đ</span>
                                            </div>
                                        </a>
                                    </c:forEach>
                                </div>
                                <div class="latest-prdouct__slider__item">
                                    <c:forEach var="lp" items="${lastPro}" begin="3">
                                        <a href="detailsControl?sid=${lp.productID}" class="latest-product__item">
                                            <div class="latest-product__item__pic">
                                                <img src="${lp.image}" alt="">
                                            </div>
                                            <div class="latest-product__item__text">
                                                <h6>${lp.title}</h6>
                                                <span>${lp.salePrice}đ</span>
                                            </div>
                                        </a>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="latest-product__text">
                            <h4>Sản phẩm bán chạy</h4>
                            <div class="latest-product__slider owl-carousel">
                                <div class="latest-prdouct__slider__item">
                                    <c:forEach var="lp" items="${bestPro}" end="2">
                                        <a href="detailsControl?sid=${lp.productID}" class="latest-product__item">
                                            <div class="latest-product__item__pic">
                                                <img src="${lp.image}" alt="">
                                            </div>
                                            <div class="latest-product__item__text">
                                                <h6>${lp.title}</h6>
                                                <span>${lp.salePrice}đ</span>
                                            </div>
                                        </a>
                                    </c:forEach>
                                </div>
                                <div class="latest-prdouct__slider__item">
                                    <c:forEach var="lp" items="${bestPro}" begin="3">
                                        <a href="detailsControl?sid=${lp.productID}" class="latest-product__item">
                                            <div class="latest-product__item__pic">
                                                <img src="${lp.image}" alt="">
                                            </div>
                                            <div class="latest-product__item__text">
                                                <h6>${lp.title}</h6>
                                                <span>${lp.salePrice}đ</span>
                                            </div>
                                        </a>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="latest-product__text">
                            <h4>Sản phẩm gợi ý</h4>
                            <div class="latest-product__slider owl-carousel">
                                <div class="latest-prdouct__slider__item">
                                    <c:forEach var="lp" items="${rewPro}" end="2">
                                        <a href="detailsControl?sid=${lp.productID}" class="latest-product__item">
                                            <div class="latest-product__item__pic">
                                                <img src="${lp.image}" alt="">
                                            </div>
                                            <div class="latest-product__item__text">
                                                <h6>${lp.title}</h6>
                                                <span>${lp.salePrice}đ</span>
                                            </div>
                                        </a>
                                    </c:forEach>
                                </div>
                                <div class="latest-prdouct__slider__item">
                                    <c:forEach var="lp" items="${rewPro}" begin="3">
                                        <a href="detailsControl?sid=${lp.productID}" class="latest-product__item">
                                            <div class="latest-product__item__pic">
                                                <img src="${lp.image}" alt="">
                                            </div>
                                            <div class="latest-product__item__text">
                                                <h6>${lp.title}</h6>
                                                <span>${lp.salePrice}đ</span>
                                            </div>
                                        </a>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Latest Product Section End -->



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
