<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo</title>
</head>
<body>
	<h1>Dictionary</h1>
	<table>
		<thead>
			<tr>
				<th>English</th>
				<th>Vietnamese</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${languages }" var="language">
				<tr>
					<td>${language.english }</td>
					<td>${language.vietnamese }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>