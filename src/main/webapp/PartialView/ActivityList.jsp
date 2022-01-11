<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<h5 style="color: gray">【活動】${ regionStr } ‧&nbsp;第&nbsp;${ page }&nbsp;頁&nbsp;‧&nbsp;共&nbsp;${ regionCount }&nbsp;筆資料</h5>
<div class="row">
	<c:forEach var="i" begin="0" end="${ acSize - 1 }">
		<div id="${ activity[i].getId() }" class="col-md-3 d-flex">
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

