<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Web App</title>
</head>
<body>
	<!-- extracting model object from dispatcher Servlet via Model&View refer HomeController.java -->
	Welcome User: ${modelobj.aid} , ${modelobj.aname} , ${modelobj.lang} (from Home View) 
</body>
</html>

<!-- Home (View)-> localhost:8080/home -->
