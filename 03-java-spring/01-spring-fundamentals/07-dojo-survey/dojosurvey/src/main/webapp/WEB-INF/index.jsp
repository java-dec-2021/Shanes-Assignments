<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey</title>
</head>
<body>
	<div>
		<div id="surveyQuestions">
			<form method="POST" action="/submit">
				<label for="name">Your Name:</label>
				<input type="text" name="name">
				<label for="location">Dojo Location:</label>
				<select name="location">
					<option value="San Jose">San Jose</option>
					<option value="LA">Los Angeles</option>
					<option value="Houston">Houston</option>
					<option value="La Luna">La Luna</option>
					<option value="El Sol">El Sol</option>
				</select>
				<select name="language">
					<option value="Python">Python</option>
					<option value="Java">Java</option>
					<option value="Javascript">Javascript</option>
					<option value="HTML">HTML</option>
					<option value="CSS">CSS</option>
				</select>
				<label for="comment">Comment(Optional):</label>
				<textarea name="comment" rows="4" cols="2"></textarea>
				<input type="submit" value="Submit">
			</form>
		</div>
	</div>
</body>
</html>