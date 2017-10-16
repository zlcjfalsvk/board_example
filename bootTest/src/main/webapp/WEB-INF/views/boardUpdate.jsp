<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글 수정</title>
</head>
<body>
	<h3>게시글 수정</h3>
	<div style="padding: 30px;">
		<form:form commandName="BoardVO" action="/board/post/${board.bno}"
			method="PATCH">
			<div class="form-group">
				<label>제목</label><input type="text" name="subject"
					value="${board.subject}" class="form-control">
			</div>
			<div class="form-group">
			<label>내용</label><textarea name="content" class="form-control" rows="5">${board.content}</textarea>
			</div>
			<button type="submit" class="btn btn-default">수정</button>
		</form:form>
	</div>

</body>
</html>