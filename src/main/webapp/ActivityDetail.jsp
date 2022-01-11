<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<title>Easy Travel - 活動詳情</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Alex+Brush"
	rel="stylesheet">

<link rel="stylesheet" type="text/css"
	href="css/open-iconic-bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/animate.css">
<link rel="stylesheet" type="text/css" href="css/owl.carousel.min.css">
<link rel="stylesheet" type="text/css"
	href="css/owl.theme.default.min.css">
<link rel="stylesheet" type="text/css" href="css/magnific-popup.css">
<link rel="stylesheet" type="text/css" href="css/aos.css">
<link rel="stylesheet" type="text/css" href="css/ionicons.min.css">
<link rel="stylesheet" type="text/css"
	href="css/bootstrap-datepicker.css">
<link rel="stylesheet" type="text/css" href="css/jquery.timepicker.css">
<link rel="stylesheet" type="text/css" href="css/flaticon.css">
<link rel="stylesheet" type="text/css" href="css/icomoon.css">
<link rel="stylesheet" type="text/css" href="css/style.css">

</head>

<body>
	<!-- Navbar -->
	<%@ include file="/PartialView/Navbar.jsp"%>
	<!-- END Navbar -->

	<section class="ftco-section ftco-degree-bg">
		<div class="container">
			<div class="row">
				<div class="col-md-9 ftco-animate" id="iv1">
					<h2 class="mt-3 mb-3">${ activityInfo[0].getName() }</h2>
					<div class="row" style="position: relative; left: 30px;">
						<div>
							<h6>縣市：${ activityInfo[0].getRegion() }</h6>
							<h6>地址：${ activityInfo[0].getTown() }${ activityInfo[0].getAdd() }</h6>
							<h6>電話：${ activityInfo[0].getTel() }</h6>
							<h6>開始時間：${ fn:substring(activityInfo[0].getStart(), 0, 10) }</h6>
							<h6>結束時間：${ fn:substring(activityInfo[0].getEnd(), 0, 10) }</h6>
						</div>
						<div style="position: absolute; right: 100px;">
							<button class="btn btn-primary btn-outline-primary">加入收藏&nbsp;&#9733;</button>
							&nbsp;&nbsp;
							<button class="btn btn-outline-primary">加入行程&nbsp;&#10004;</button>
						</div>
					</div>
					<br>
					<h6>描述：&nbsp;&nbsp;${ activityInfo[0].getDescription() }</h6>
					<br>
					<c:if test="${ not empty activityInfo[0].getPicture1()}">
						<h6>&nbsp;&#9660;&nbsp;${ activityInfo[0].getPicdescribe1() }</h6>
						<h6>
							<img src="${ activityInfo[0].getPicture1() }" alt=""
								class="img-fluid">
						</h6>
					</c:if>
					<c:if test="${ not empty activityInfo[0].getPicture2()}">
						<h6>&nbsp;&#9660;&nbsp;${ activityInfo[0].getPicdescribe2() }</h6>
						<h6>
							<img src="${ activityInfo[0].getPicture2() }" alt=""
								class="img-fluid">
						</h6>
					</c:if>
					<c:if test="${ not empty activityInfo[0].getPicture3()}">
						<h6>&nbsp;&#9660;&nbsp;${ activityInfo[0].getPicdescribe3() }</h6>
						<h6>
							<img src="${ activityInfo[0].getPicture3() }" alt=""
								class="img-fluid">
						</h6>
					</c:if>
					<br>
					<c:choose>
						<c:when test="${ not empty activityInfo[0].getTravellinginfo()}">
							<h6>旅遊資訊：${ activityInfo[0].getTravellinginfo() }</h6>
						</c:when>
						<c:otherwise>
							<h6>旅遊資訊：詳情請見活動官網</h6>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${ not empty activityInfo[0].getParkinginfo()}">
							<h6>停車資訊：${ activityInfo[0].getParkinginfo() }</h6>
						</c:when>
						<c:otherwise>
							<h6>停車資訊：詳情請見活動官網</h6>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${ not empty activityInfo[0].getCharge()}">
							<h6>費用：${ activityInfo[0].getCharge() }</h6>
						</c:when>
						<c:otherwise>
							<h6>費用：詳情請見活動官網</h6>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${ not empty activityInfo[0].getRemarks()}">
							<h6>備註：${ activityInfo[0].getRemarks() }</h6>
						</c:when>
						<c:otherwise>
							<h6>備註：詳情請見活動官網</h6>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${ not empty activityInfo[0].getWebsite()}">
							<a href="${ activityInfo[0].getWebsite()}" target="_blank"><span
								style="font-size: 16px;">官網：</span>${ activityInfo[0].getWebsite()}</a>
						</c:when>
						<c:otherwise>
							<h6>官網：未提供官方網址</h6>
						</c:otherwise>
					</c:choose>
				</div>
				<!-- .col-md-8 -->

				<!--Sidebar-->
				<%@ include file="/PartialView/Sidebar.jsp"%>
				<!--End Sidebar-->
			</div>
		</div>
	</section>
	<!-- .section -->

	<!-- Footer -->
	<%@ include file="/PartialView/Footer.jsp"%>
	<!-- End Footer -->

	<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/jquery-migrate-3.0.1.min.js"></script>
	<script type="text/javascript" src="js/popper.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
	<script type="text/javascript" src="js/jquery.waypoints.min.js"></script>
	<script type="text/javascript" src="js/jquery.stellar.min.js"></script>
	<script type="text/javascript" src="js/owl.carousel.min.js"></script>
	<script type="text/javascript" src="js/jquery.magnific-popup.min.js"></script>
	<script type="text/javascript" src="js/aos.js"></script>
	<script type="text/javascript" src="js/jquery.animateNumber.min.js"></script>
	<script type="text/javascript" src="js/bootstrap-datepicker.js"></script>
	<script type="text/javascript" src="js/jquery.timepicker.min.js"></script>
	<script type="text/javascript" src="js/scrollax.min.js"></script>
	<script type="text/javascript" src="js/google-map.js"></script>
	<script type="text/javascript" src="js/main.js"></script>

	<script type="text/javascript">
		function ChangeRegion(theRegion) {
			window.location.href = "GetActivity?page=1&regionStr="+theRegion;
		}
	</script>
</body>

</html>


