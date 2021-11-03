<%-- 
    Document   : shop-grid
    Created on : Oct 21, 2021, 7:37:40 PM
    Author     : Huynh Minh Nhat;
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
        <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

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
                    <a href="#"><i class="fa fa-user"></i> Login</a>
                </div>
            </div>
            <nav class="humberger__menu__nav mobile-menu">
                <ul>
                    <li class="active"><a href="./HomeControl">Home</a></li>
                    <li><a href="./ShopControl">Shop</a></li>
                    <li><a href="#">Pages</a>
                        <ul class="header__menu__dropdown">
                            <li><a href="./shoping-cart.jsp">Shoping Cart</a></li>
                            <li><a href="./checkout.jsp">Check Out</a></li>
                        </ul>
                    </li>
                    <li><a href="./contact.jsp">Contact</a></li>
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
                        <div class="col-lg-6">
                            <div class="header__top__left">
                                <ul>
                                    <li><i class="fa fa-envelope"></i> hello@colorlib.com</li>
                                    <li>Free Shipping for all Order of $99</li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="header__top__right">
                                <div class="header__top__right__social">
                                    <a href="#"><i class="fa fa-facebook"></i></a>
                                    <a href="#"><i class="fa fa-twitter"></i></a>
                                    <a href="#"><i class="fa fa-linkedin"></i></a>
                                    <a href="#"><i class="fa fa-pinterest-p"></i></a>
                                </div>
                                <div class="header__top__right__auth">
                                    <a href="./login.jsp"><i class="fa fa-user"></i> Login</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="header__logo">
                            <a href="./index.jsp"><img src="img/logo.png" alt=""></a>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <nav class="header__menu">
                            <ul>
                                <li><a href="./HomeControl">Home</a></li>
                                <li class="active"><a href="./ShopControl">Shop</a></li>
                                <li><a href="#">Pages</a>
                                    <ul class="header__menu__dropdown">
                                        <li><a href="./shoping-cart.jsp">Shoping Cart</a></li>
                                        <li><a href="./checkout.jsp">Check Out</a></li>
                                    </ul>
                                </li>
                                <li><a href="./contact.jsp">Contact</a></li>
                            </ul>
                        </nav>
                    </div>
                    <div class="col-lg-3">
                        <div class="header__cart">
                            <ul>
                                <li><a href="./shoping-cart.jsp"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
                            </ul>
                            <div class="header__cart__price">item: <span>$150.00</span></div>
                        </div>
                    </div>
                </div>
                <div class="humberger__open">
                    <i class="fa fa-bars"></i>
                </div>
            </div>
        </header>
        <!-- Header Section End -->

        <!-- Hero Section Begin -->
        <section class="hero hero-normal">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="hero__categories">
                            <div class="hero__categories__all">
                                <i class="fa fa-bars"></i>
                                <span>All departments</span>
                            </div>
                            <ul>
                                <c:forEach items="${category1}" var="i">
                                    <li><a href="#">${i.cateName}</a></li>
                                    </c:forEach>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-9">
                        <div class="hero__search">
                            <div class="hero__search__form">
                                <form action="#">
                                    <div class="hero__search__categories">
                                        All Categories
                                        <span class="arrow_carrot-down"></span>
                                    </div>
                                    <input type="text" placeholder="What do yo u need?">
                                    <button type="submit" class="site-btn">SEARCH</button>
                                </form>
                            </div>
                            <div class="hero__search__phone">
                                <div class="hero__search__phone__icon">
                                    <i class="fa fa-phone"></i>
                                </div>
                                <div class="hero__search__phone__text">
                                    <h5>+84363 323 084</h5>
                                    <span>support 24/7 time</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Hero Section End -->

        <!-- Breadcrumb Section Begin -->
        <section class="breadcrumb-section set-bg" data-setbg="img/breadcrumb.jpg">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <div class="breadcrumb__text">
                            <h2>Organi Shop</h2>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Breadcrumb Section End -->

        <!-- Product Section Begin -->
        <section class="product spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-5">
                        <div class="sidebar">
                            <div class="sidebar__item">
                                <h4>Department</h4>
                                <ul>
                                    <c:forEach items="${category1}" var="i">
                                        <li><a href="#">${i.cateName}</a></li>
                                        </c:forEach>
                                </ul>
                            </div>
                            <div class="sidebar__item">
                                <div class="latest-product__text">
                                    <h4>Latest Products</h4>
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
                        </div>
                    </div>
                    <div class="col-lg-9 col-md-7">
                        <div class="product__discount">
                            <div class="section-title product__discount__title">
                                <h2>Sale Off</h2>
                            </div>
                            <div class="row">
                                <div class="product__discount__slider owl-carousel">
                                    <c:forEach items="${listPff}" var="p">
                                        <div class="col-lg-4">
                                            <div class="product__discount__item">
                                                <div class="product__discount__item__pic set-bg"
                                                     data-setbg="${p.image}">
                                                    <div class="product__discount__percent">-${(p.saleOff*100).intValue()}%</div>
                                                    <ul class="product__item__pic__hover">
                                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                        <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                                    </ul>
                                                </div>
                                                <div class="product__discount__item__text">
                                                    <span>${p.cateName}</span>
                                                    <h5><a href="detailsControl?sid=${p.productID}">${p.title}</a></h5>
                                                    <div class="product__item__price">${p.salePrice.intValue()}đ <span>${p.salePrice*(p.saleOff+1)}</span></div>
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                        <!--                        <div class="filter__item">
                                                    <div class="row">
                                                        <div class="col-lg-4 col-md-5">
                                                            <div class="filter__sort">
                                                                <span>Sort By</span>
                                                                <select>
                                                                    <option value="0">Default</option>
                                                                    <option value="0">Default</option>
                                                                </select>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-4 col-md-4">
                                                            <div class="filter__found">
                                                                <h6><span>16</span> Products found</h6>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-4 col-md-3">
                                                            <div class="filter__option">
                                                                <span class="icon_grid-2x2"></span>
                                                                <span class="icon_ul"></span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>-->
                        <div class="row">
                            <c:forEach var="p" items="${listPro}" >
                                <div class="col-lg-4 col-md-6 col-sm-6">
                                    <div class="product__item">
                                        <div class="product__item__pic set-bg" data-setbg="${p.image}">
                                            <ul class="product__item__pic__hover">
                                                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="product__item__text">
                                            <h6><a href="detailsControl?sid=${p.productID}">${p.title}</a></h6>
                                            <h5>${p.salePrice}đ</h5>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                            <!--                            <div class="col-lg-4 col-md-6 col-sm-6">
                                                            <div class="product__item">
                                                                <div class="product__item__pic set-bg" data-setbg="img/product/product-1.jpg">
                                                                    <ul class="product__item__pic__hover">
                                                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                                                    </ul>
                                                                </div>
                                                                <div class="product__item__text">
                                                                    <h6><a href="#">Crab Pool Security</a></h6>
                                                                    <h5>$30.00</h5>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-4 col-md-6 col-sm-6">
                                                            <div class="product__item">
                                                                <div class="product__item__pic set-bg" data-setbg="img/product/product-2.jpg">
                                                                    <ul class="product__item__pic__hover">
                                                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                                                    </ul>
                                                                </div>
                                                                <div class="product__item__text">
                                                                    <h6><a href="#">Crab Pool Security</a></h6>
                                                                    <h5>$30.00</h5>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-4 col-md-6 col-sm-6">
                                                            <div class="product__item">
                                                                <div class="product__item__pic set-bg" data-setbg="img/product/product-3.jpg">
                                                                    <ul class="product__item__pic__hover">
                                                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                                                    </ul>
                                                                </div>
                                                                <div class="product__item__text">
                                                                    <h6><a href="#">Crab Pool Security</a></h6>
                                                                    <h5>$30.00</h5>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-4 col-md-6 col-sm-6">
                                                            <div class="product__item">
                                                                <div class="product__item__pic set-bg" data-setbg="img/product/product-4.jpg">
                                                                    <ul class="product__item__pic__hover">
                                                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                                                    </ul>
                                                                </div>
                                                                <div class="product__item__text">
                                                                    <h6><a href="#">Crab Pool Security</a></h6>
                                                                    <h5>$30.00</h5>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-4 col-md-6 col-sm-6">
                                                            <div class="product__item">
                                                                <div class="product__item__pic set-bg" data-setbg="img/product/product-5.jpg">
                                                                    <ul class="product__item__pic__hover">
                                                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                                                    </ul>
                                                                </div>
                                                                <div class="product__item__text">
                                                                    <h6><a href="#">Crab Pool Security</a></h6>
                                                                    <h5>$30.00</h5>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-4 col-md-6 col-sm-6">
                                                            <div class="product__item">
                                                                <div class="product__item__pic set-bg" data-setbg="img/product/product-6.jpg">
                                                                    <ul class="product__item__pic__hover">
                                                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                                                    </ul>
                                                                </div>
                                                                <div class="product__item__text">
                                                                    <h6><a href="#">Crab Pool Security</a></h6>
                                                                    <h5>$30.00</h5>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-4 col-md-6 col-sm-6">
                                                            <div class="product__item">
                                                                <div class="product__item__pic set-bg" data-setbg="img/product/product-7.jpg">
                                                                    <ul class="product__item__pic__hover">
                                                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                                                    </ul>
                                                                </div>
                                                                <div class="product__item__text">
                                                                    <h6><a href="#">Crab Pool Security</a></h6>
                                                                    <h5>$30.00</h5>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-4 col-md-6 col-sm-6">
                                                            <div class="product__item">
                                                                <div class="product__item__pic set-bg" data-setbg="img/product/product-8.jpg">
                                                                    <ul class="product__item__pic__hover">
                                                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                                                    </ul>
                                                                </div>
                                                                <div class="product__item__text">
                                                                    <h6><a href="#">Crab Pool Security</a></h6>
                                                                    <h5>$30.00</h5>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-4 col-md-6 col-sm-6">
                                                            <div class="product__item">
                                                                <div class="product__item__pic set-bg" data-setbg="img/product/product-9.jpg">
                                                                    <ul class="product__item__pic__hover">
                                                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                                                    </ul>
                                                                </div>
                                                                <div class="product__item__text">
                                                                    <h6><a href="#">Crab Pool Security</a></h6>
                                                                    <h5>$30.00</h5>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-4 col-md-6 col-sm-6">
                                                            <div class="product__item">
                                                                <div class="product__item__pic set-bg" data-setbg="img/product/product-10.jpg">
                                                                    <ul class="product__item__pic__hover">
                                                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                                                    </ul>
                                                                </div>
                                                                <div class="product__item__text">
                                                                    <h6><a href="#">Crab Pool Security</a></h6>
                                                                    <h5>$30.00</h5>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-4 col-md-6 col-sm-6">
                                                            <div class="product__item">
                                                                <div class="product__item__pic set-bg" data-setbg="img/product/product-11.jpg">
                                                                    <ul class="product__item__pic__hover">
                                                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                                                    </ul>
                                                                </div>
                                                                <div class="product__item__text">
                                                                    <h6><a href="#">Crab Pool Security</a></h6>
                                                                    <h5>$30.00</h5>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-4 col-md-6 col-sm-6">
                                                            <div class="product__item">
                                                                <div class="product__item__pic set-bg" data-setbg="img/product/product-12.jpg">
                                                                    <ul class="product__item__pic__hover">
                                                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                                                    </ul>
                                                                </div>
                                                                <div class="product__item__text">
                                                                    <h6><a href="#">Crab Pool Security</a></h6>
                                                                    <h5>$30.00</h5>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>-->
                            <div class="product__pagination">
                                <c:if test="${tag > 1}">
                                    <a href="ShopControl?index=${tag-1}"><i class="fa fa-long-arrow-left"></i></a>
                                    </c:if>
                                    <c:forEach begin="1" end="${endP}" var="i">
                                    <a style="${tag == i?"background-color: forestgreen":""}" href="ShopControl?index=${i}">${i}</a>
                                </c:forEach>
                                <c:if test="${tag < endP}">
                                    <a href="ShopControl?index=${tag+1}"><i class="fa fa-long-arrow-right"></i></a>
                                    </c:if>
                            </div>
                        </div>
                    </div>
                </div>
        </section>
        <!-- Product Section End -->

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
                                <li>Address: 60-49 Road 11378 New York</li>
                                <li>Phone: +84363 323 084</li>
                                <li>Email: hello@colorlib.com</li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 col-sm-6 offset-lg-1">
                        <div class="footer__widget">
                            <h6>Useful Links</h6>
                            <ul>
                                <li><a href="#">About Us</a></li>
                                <li><a href="#">About Our Shop</a></li>
                                <li><a href="#">Secure Shopping</a></li>
                                <li><a href="#">Delivery infomation</a></li>
                                <li><a href="#">Privacy Policy</a></li>
                                <li><a href="#">Our Sitemap</a></li>
                            </ul>
                            <ul>
                                <li><a href="#">Who We Are</a></li>
                                <li><a href="#">Our Services</a></li>
                                <li><a href="#">Projects</a></li>
                                <li><a href="#">Contact</a></li>
                                <li><a href="#">Innovation</a></li>
                                <li><a href="#">Testimonials</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-12">
                        <div class="footer__widget">
                            <h6>Join Our Newsletter Now</h6>
                            <p>Get E-mail updates about our latest shop and special offers.</p>
                            <form action="#">
                                <input type="text" placeholder="Enter your mail">
                                <button type="submit" class="site-btn">Subscribe</button>
                            </form>
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
