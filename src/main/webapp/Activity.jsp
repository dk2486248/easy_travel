<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<title>Easy Travel - 活動搜尋</title>
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

	<!-- Header -->
	<%@ include file="/PartialView/Header.jsp"%>
	<!-- END Header -->

	<section class="ftco-section ftco-degree-bg">
		<div class="container">
			<div class="row">
				<div class="col-md-9 ftco-animate" id="iv1">
					<div id="ListDiv1">
						<h5 style="color: gray">【活動】${ regionStr } ‧&nbsp;第&nbsp;${ page }&nbsp;頁&nbsp;‧&nbsp;共&nbsp;${ regionCount }&nbsp;筆資料</h5>
						<div class="row">
							<c:forEach var="i" begin="0" end="19">

								<div id="${ activity[i].getId() }"
									class="col-md-3 d-flex ftco-animate">
									<div class="blog-entry align-self-stretch">
										<c:choose>
											<c:when test="${ not empty activity[i].getPicture1()}">
												<a
													href="/EasyTravel/GetActivityDetail?Id=${ activity[i].getId() }"
													class="block-20"
													style="background-image: url('${ activity[i].getPicture1() }');">
												</a>
											</c:when>
											<c:otherwise>
												<a
													href="/EasyTravel/GetActivityDetail?Id=${ activity[i].getId() }"
													class="block-20"
													style="background-image: url('images/logo.png');"> </a>
											</c:otherwise>
										</c:choose>

										<div class="text p-1 d-block">
											<h4 class="tag" style="font-size: 20px;">${ activity[i].getName() }</h4>
											<p class="heading mt-1" style="line-height: normal;">
												<c:choose>
													<c:when test="${ not empty activity[i].getPicture1()}">
														<a
															href="/EasyTravel/GetActivityDetail?Id=${ activity[i].getId() }">
															<font size="3">&nbsp;&nbsp;${ fn:substring(activity[i].getDescription(), 0, 100) }······&lt;延伸閱讀&gt;
														</font>
														</a>
													</c:when>
													<c:otherwise>
														<a
															href="/EasyTravel/GetActivityDetail?Id=${ activity[i].getId() }">
															<font size="3">&nbsp;&nbsp;${ activity[i].getName() }······&lt;延伸閱讀&gt;
														</font>
														</a>
													</c:otherwise>
												</c:choose>
											</p>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>

				</div>
				<!-- .col-md-8 -->

				<!--Sidebar-->
				<%@ include file="/PartialView/Sidebar.jsp"%>
				<!--End Sidebar-->
			</div>
		</div>

		<div class="row mt-5">
			<div class="col text-center">
				<div class="block-27">
					<ul id="pageArea">
						<li><a id="backwardbutton" href="#"
							onclick="BackwardButtonClick('${regionStr}');"> &lt; </a></li>
						<c:forEach var="i" begin="1"
							end="${ Math.ceil(regionCount / 20) }">
							<li id="${i}"><a href="#"
								onclick="GoToPage(${i}, '${regionStr}');">${i}</a></li>
						</c:forEach>
						<li><a id="forwardbutton" href="#"
							onclick="ForwardButtonClick('${regionStr}');"> &gt; </a></li>
					</ul>
				</div>
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
	<script type="text/javascript" src="js/scrollax.min.js"></script>
	<script type="text/javascript" src="js/main.js"></script>
	<script>
		var currentPage = ${page};
		
		$(document).ready(function () {
			$("#"+"${page}").attr("class","active");
		});
		
		function BackwardButtonClick (region) {
			GoToPage(currentPage - 1, region );
			return false;
		}
		
		function ForwardButtonClick(region) {
			GoToPage(currentPage + 1, region);
			return false;
		}
		
		function GoToPage(goPage, region)
		{
			debugger;
			 
			$.ajax({
				url : "/EasyTravel/AjaxGetActivityPV",
				type : "POST",
				data : {
					page: goPage,
					region : region
				},
				success : function(data) {
					$("#ListDiv1").html(data);
				}
			});
			$("#1").attr("class","");
			$("#"+currentPage).attr("class","");
		    $("#"+goPage).attr("class","active");
			currentPage = goPage;
		}
		
		function ChangeRegion(theRegion)
		{
			
			$.ajax({
				url : "/EasyTravel/AjaxGetActivityPV",
				type : "POST",
				data : {
					page: 1,
					region : theRegion
				},
				success : function(data) {
					$("#ListDiv1").html(data);
				}
			});
			$.ajax({
				url : "/EasyTravel/AjaxGetPagePV",
				type : "POST",
				data : {
					region : theRegion
				},
				success : function(data) {
					$("#pageArea").html(data);
					$("#"+currentPage).attr("class","");
					$("#1").attr("class","active");
				}
			});
			
		}

	</script>

</body>
</html>

