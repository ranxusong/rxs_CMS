<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>编号</th>
			<th>影视名称</th>
			<th>介绍</th>
			<th>上限</th>
			<th>下限</th>
			<th>亮点</th>
			<th>地区</th>
			<th>时间</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${list}" var="j">
			<tr>
			<th><input type="checkbox"></th>
			<th>${j.jid }</th>
			<th>${j.jname }</th>
			<th>${j.introduction }</th>
			<th>${j.start }</th>
			<th>${j.end }</th>
			<th>${j.lname }</th>
			<th>${j.sname }</th>
			<th>${j.startdate }</th>
			<th>
				<input type="button" value="删除">
			</th>
		</tr>
		</c:forEach>
	</table>
</body>
</html>