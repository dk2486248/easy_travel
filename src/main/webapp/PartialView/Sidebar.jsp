<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="col-md-3 sidebar ftco-animate">

	<!-- <div class="sidebar-box">
						<form action="#" class="search-form">
							<div class="form-group">
								<span class="icon fa fa-search"></span> <input type="text"
									class="form-control" placeholder="搜尋...">
							</div>
						</form>
					</div> -->

	<div class="sidebar-box ftco-animate">
		<div class="categories">
			<h3>北部地區</h3>
			<ul>
				<li><a id="臺北市" href="#" onclick="ChangeRegion('臺北市');">臺北市<span>(${ regionQty[0] })</span></a></li>
				<li><a id="新北市" href="#" onclick="ChangeRegion('新北市');">新北市<span>(${ regionQty[1] })</span></a></li>
				<li><a id="基隆市" href="#" onclick="ChangeRegion('基隆市');">基隆市<span>(${ regionQty[2] })</span></a></li>
				<li><a id="桃園市" href="#" onclick="ChangeRegion('桃園市');">桃園市<span>(${ regionQty[3] })</span></a></li>
				<li><a id="新竹縣" href="#" onclick="ChangeRegion('新竹縣');">新竹縣<span>(${ regionQty[4] })</span></a></li>
				<li><a id="新竹市" href="#" onclick="ChangeRegion('新竹市');">新竹市<span>(${ regionQty[5] })</span></a></li>
			</ul>
			<br>
			<h3>中部地區</h3>
			<ul>
				<li><a id="苗栗縣" href="#" onclick="ChangeRegion('苗栗縣');">苗栗縣<span>(${ regionQty[6] })</span></a></li>
				<li><a id="臺中市" href="#" onclick="ChangeRegion('臺中市');">臺中市<span>(${ regionQty[7] })</span></a></li>
				<li><a id="彰化縣" href="#" onclick="ChangeRegion('彰化縣');">彰化縣<span>(${ regionQty[8] })</span></a></li>
				<li><a id="南投縣" href="#" onclick="ChangeRegion('南投縣');">南投縣<span>(${ regionQty[9] })</span></a></li>
				<li><a id="雲林縣" href="#" onclick="ChangeRegion('雲林縣');">雲林縣<span>(${ regionQty[10] })</span></a></li>
				<li><a id="嘉義縣" href="#" onclick="ChangeRegion('嘉義縣');">嘉義縣<span>(${ regionQty[11] })</span></a></li>
				<li><a id="嘉義市" href="#" onclick="ChangeRegion('嘉義市');">嘉義市<span>(${ regionQty[12] })</span></a></li>
			</ul>
			<br>
			<h3>南部地區</h3>
			<ul>
				<li><a id="臺南市" href="#" onclick="ChangeRegion('臺南市');">臺南市<span>(${ regionQty[13] })</span></a></li>
				<li><a id="屏東縣" href="#" onclick="ChangeRegion('屏東縣');">屏東縣<span>(${ regionQty[14] })</span></a></li>
				<li><a id="高雄市" href="#" onclick="ChangeRegion('高雄市');">高雄市<span>(${ regionQty[15] })</span></a></li>
			</ul>
			<br>
			<h3>東部地區</h3>
			<ul>
				<li><a id="宜蘭縣" href="#" onclick="ChangeRegion('宜蘭縣');">宜蘭縣<span>(${ regionQty[16] })</span></a></li>
				<li><a id="花蓮縣" href="#" onclick="ChangeRegion('花蓮縣');">花蓮縣<span>(${ regionQty[17] })</span></a></li>
				<li><a id="臺東縣" href="#" onclick="ChangeRegion('臺東縣');">臺東縣<span>(${ regionQty[18] })</span></a></li>
				<li><a id="澎湖縣" href="#" onclick="ChangeRegion('澎湖縣');">澎湖縣<span>(${ regionQty[19] })</span></a></li>
			</ul>
		</div>
	</div>

	<div class="sidebar-box ftco-animate">
		<!-- 
						<h3>近期瀏覽活動</h3>
						<div class="block-21 mb-4 d-flex">
							<a class="blog-img mr-4"
								style="background-image: url(images/image_1.jpg);"></a>
							<div class="text">
								<h3 class="heading">
									<a href="#">標題</a>
								</h3>
								<div class="meta">
									<div>
										<a href="#"><span class="icon-calendar"></span> 日期</a>
									</div>
									<div>
										<a href="#"><span class="icon-person"></span> 作者</a>
									</div>
									<div>
										<a href="#"><span class="icon-chat"></span> 評論數</a>
									</div>
								</div>
							</div>
						</div>

						<div class="block-21 mb-4 d-flex">
							<a class="blog-img mr-4"
								style="background-image: url(images/image_2.jpg);"></a>
							<div class="text">
								<h3 class="heading">
									<a href="#">標題</a>
								</h3>
								<div class="meta">
									<div>
										<a href="#"><span class="icon-calendar"></span> 日期</a>
									</div>
									<div>
										<a href="#"><span class="icon-person"></span> 作者</a>
									</div>
									<div>
										<a href="#"><span class="icon-chat"></span> 評論數</a>
									</div>
								</div>
							</div>
						</div>
						<div class="block-21 mb-4 d-flex">
							<a class="blog-img mr-4"
								style="background-image: url(images/image_3.jpg);"></a>
							<div class="text">
								<h3 class="heading">
									<a href="#">標題</a>
								</h3>
								<div class="meta">
									<div>
										<a href="#"><span class="icon-calendar"></span> 日期</a>
									</div>
									<div>
										<a href="#"><span class="icon-person"></span> 作者</a>
									</div>
									<div>
										<a href="#"><span class="icon-chat"></span> 評論數</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					-->

		<div class="sidebar-box ftco-animate">
			<h3>關鍵字標籤</h3>
			<div class="tagcloud">
				<a href="#" class="tag-cloud-link">住宿</a> <a href="#"
					class="tag-cloud-link">餐廳</a> <a href="#" class="tag-cloud-link">景點</a>
				<a href="#" class="tag-cloud-link">活動</a>
			</div>
		</div>

	</div>
</div>


