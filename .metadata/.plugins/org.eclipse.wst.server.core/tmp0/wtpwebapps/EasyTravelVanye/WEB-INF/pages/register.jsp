


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>DirEngine - Free Bootstrap 4 Template by Colorlib</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Alex+Brush" rel="stylesheet">

    <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
    <link rel="stylesheet" href="css/animate.css">
    
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">

    <link rel="stylesheet" href="css/aos.css">

    <link rel="stylesheet" href="css/ionicons.min.css">

    <link rel="stylesheet" href="css/bootstrap-datepicker.css">
    <link rel="stylesheet" href="css/jquery.timepicker.css">

    
    <link rel="stylesheet" href="css/flaticon.css">
    <link rel="stylesheet" href="css/icomoon.css">
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>

      <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
          <div class="container">
              <a class="navbar-brand" href="index.html"><img src="images/logo2.png" width="40px" height="40px"> Easy Travel</a>
              <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="oi oi-menu"></span> Menu
              </button>

              <div class="collapse navbar-collapse" id="ftco-nav">
                  <ul class="navbar-nav ml-auto">
                      <li class="nav-item"><a href="index.html" class="nav-link">首頁</a></li>
                      <li class="nav-item"><a href="about.html" class="nav-link">會員中心</a></li>
                      <li class="nav-item "><a href="tour.html" class="nav-link">景點</a></li>
                      <li class="nav-item"><a href="hotel.html" class="nav-link">住宿</a></li>
                      <li class="nav-item"><a href="blog.html" class="nav-link">餐廳</a></li>
                      <li class="nav-item"><a href="contact.html" class="nav-link">聯系我們</a></li>
                      <li class="nav-item cta"><a href="contact.html" class="nav-link"><span>開始規劃</span></a></li>
                  </ul>
              </div>
          </div>
      </nav>
      
      <!-- END nav -->

      <div class="hero-wrap js-fullheight" style="background-image: url('images/bg_5.jpg');">
          <div class="overlay"></div>
          <div class="container">
              <div class="row no-gutters slider-text js-fullheight align-items-center justify-content-center" data-scrollax-parent="true">
                  <div class="col-md-9 ftco-animate text-center" data-scrollax=" properties: { translateY: '70%' }">

                      <h1 class="mb-3 bread" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">註冊表單</h1>
                  </div>
              </div>
          </div>
      </div>


      <section class="ftco-section ftco-degree-bg">
          <div class="container">

              <div class="col-lg-10">
                  <div class="row">

                      <div class="col-md-12 hotel-single ftco-animate mb-5 mt-4">

                          <h4 class="mb-5">註冊畫面 </h4>
                          <form method="post" action="RegisterCheck.controller" enctype="multipart/form-data" >

                              <div class="row align-items-end">
                                  <div class="col-md-6">
                                      <div class="form-group">
                                         
                                          <input class="form-control" type="text" name="username" id="username" placeholder="請輸入帳號" value="" />
                                      </div>
                                  </div>
                                  <div class="col-md-6">
                                      <div class="form-group">
                                        	<lable for="password">密碼</lable>
                                          <input class="form-control" type="password" name="password" id="password" placeholder="請輸入密碼" value="" />
                                      </div>
                                  </div>
                                  
                                  
                                  <div class="col-md-6">
                                      <div class="form-group">
                                          <lable for="name">姓名</lable>
                                          <input class="form-control" type="text" name="name" id="name" placeholder="請輸入姓名" value="" />
                                      </div>
                                  </div>
                                  <div class="col-md-6">
                                      <div class="form-group">
                                         <lable for="password">身分證字號</lable>
                                          <input class="form-control" type="text" name="IDName" id="IDName" placeholder="請輸入身分證字號" value="" />
                                      </div>
                                  </div>
                                  <div class="col-md-6">
                                      <div class="form-group">
                                          <lable for="phoneNumber">手機號碼</lable>
                                          <input class="form-control" type="text" name="phoneNumber" id="phoneNumber" placeholder="請輸入手機號碼" value="" />
                                      </div>
                                  </div>
                                  <div class="col-md-6">
                                      <div class="form-group">
                                          <lable for="address">聯絡地址</lable>
                                          <input class="form-control" type="text" name="address" id="address" placeholder="請輸入聯絡地址" value="" />
                                      </div>
                                  </div>
                                  <div class="col-md-6">
                                      <div class="form-group">
                                           <lable for="email">電子信箱</lable>
                                          <input class="form-control" type="text" name="email" id="email" placeholder="請輸入電子信箱" value="" />
                                      </div>
                                  </div>

                                  <div class="col-md-6">
                                      <div class="form-group">
                                          <div class="select-wrap one-third">
                                              <div class="icon"><span class="ion-ios-arrow-down">請選擇性別</span></div>
                                              <select name="gender" id="gender" class="form-control" >

                                                  <option value="boy">男生</option>
                                                  <option value="girl">女生</option>
                                              </select>
                                          </div>
                                      </div>
                                  </div>
                                  	<div class="col-md-12">
                                      <div class="form-group">
                                  			<lable for="Birthday">出生年月日</lable>
                                          <input class="form-control" type="date" name="Birthday" id="Birthday" />
                                      </div>
                                  </div>
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  <div class="col-md-12">
                                      <div class="form-group">
                                          <input type="submit" value="確定並且送出" class="btn btn-primary py-3">
                                      </div>
                                  </div>
                                  <div class="col-md-12">
                                      <div class="form-group">
                                          <input type="reset" value="取消所有資料" class="btn btn-primary py-3">
                                      </div>
                                  </div>
                              </div>
                          </form>
                      </div>
                  </div>



              </div>
          </div> <!-- .col-md-8 -->
          
      </section> <!-- .section -->


















      <!-- .下面是footer -->

      <footer class="ftco-footer ftco-bg-dark ftco-section">
          <div class="container">
              <div class="row mb-5">
                  <div class="col-md">
                      <div class="ftco-footer-widget mb-4">
                          <h2 class="ftco-heading-2">dirEngine</h2>
                          <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
                          <ul class="ftco-footer-social list-unstyled float-md-left float-lft mt-5">
                              <li class="ftco-animate"><a href="#"><span class="icon-twitter"></span></a></li>
                              <li class="ftco-animate"><a href="#"><span class="icon-facebook"></span></a></li>
                              <li class="ftco-animate"><a href="#"><span class="icon-instagram"></span></a></li>
                          </ul>
                      </div>
                  </div>
                  <div class="col-md">
                      <div class="ftco-footer-widget mb-4 ml-md-5">
                          <h2 class="ftco-heading-2">Information</h2>
                          <ul class="list-unstyled">
                              <li><a href="#" class="py-2 d-block">About</a></li>
                              <li><a href="#" class="py-2 d-block">Service</a></li>
                              <li><a href="#" class="py-2 d-block">Terms and Conditions</a></li>
                              <li><a href="#" class="py-2 d-block">Become a partner</a></li>
                              <li><a href="#" class="py-2 d-block">Best Price Guarantee</a></li>
                              <li><a href="#" class="py-2 d-block">Privacy and Policy</a></li>
                          </ul>
                      </div>
                  </div>
                  <div class="col-md">
                      <div class="ftco-footer-widget mb-4">
                          <h2 class="ftco-heading-2">Customer Support</h2>
                          <ul class="list-unstyled">
                              <li><a href="#" class="py-2 d-block">FAQ</a></li>
                              <li><a href="#" class="py-2 d-block">Payment Option</a></li>
                              <li><a href="#" class="py-2 d-block">Booking Tips</a></li>
                              <li><a href="#" class="py-2 d-block">How it works</a></li>
                              <li><a href="#" class="py-2 d-block">Contact Us</a></li>
                          </ul>
                      </div>
                  </div>
                  <div class="col-md">
                      <div class="ftco-footer-widget mb-4">
                          <h2 class="ftco-heading-2">Have a Questions?</h2>
                          <div class="block-23 mb-3">
                              <ul>
                                  <li><span class="icon icon-map-marker"></span><span class="text">203 Fake St. Mountain View, San Francisco, California, USA</span></li>
                                  <li><a href="#"><span class="icon icon-phone"></span><span class="text">+2 392 3929 210</span></a></li>
                                  <li><a href="#"><span class="icon icon-envelope"></span><span class="text">info@yourdomain.com</span></a></li>
                              </ul>
                          </div>
                      </div>
                  </div>
              </div>
              <div class="row">
                  <div class="col-md-12 text-center">

                      <p>
                          <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                          Copyright &copy;
                          <script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                          <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                      </p>
                  </div>
              </div>
          </div>
      </footer>



      <!-- loader -->
<!--       <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee" /><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00" /></svg></div> -->


      <script src="js/jquery.min.js"></script>
      <script src="js/jquery-migrate-3.0.1.min.js"></script>
      <script src="js/popper.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <script src="js/jquery.easing.1.3.js"></script>
      <script src="js/jquery.waypoints.min.js"></script>
      <script src="js/jquery.stellar.min.js"></script>
      <script src="js/owl.carousel.min.js"></script>
      <script src="js/jquery.magnific-popup.min.js"></script>
      <script src="js/aos.js"></script>
      <script src="js/jquery.animateNumber.min.js"></script>
      <script src="js/bootstrap-datepicker.js"></script>
      <script src="js/jquery.timepicker.min.js"></script>
      <script src="js/scrollax.min.js"></script>
      <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
      <script src="js/google-map.js"></script>
      <script src="js/main.js"></script>

  </body>
</html>