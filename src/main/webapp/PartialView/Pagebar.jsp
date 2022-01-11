<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<li><a id="backwardbutton" href="#"
	onclick="BackwardButtonClick('${ region }');"> &lt; </a></li>
<c:forEach var="i" begin="1" end="${ Math.ceil(regionCount / 20) }">
	<li id="${i}"><a href="#" onclick="GoToPage(${i}, '${region}');">${i}</a></li>
</c:forEach>
<li><a id="forwardbutton" href="#" onclick="ForwardButtonClick('${ region }');">
		&gt; </a></li>

