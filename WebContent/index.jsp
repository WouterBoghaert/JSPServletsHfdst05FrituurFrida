<%@ page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.DayOfWeek" %>
<!DOCTYPE html>
<html lang="nl">
<head>
	<title>Frituur Frida</title>
	<link rel='icon' href='images/favicon.ico'>
	<meta name='viewport' content='width=device-width,initial-scale=1'>
	<link rel='stylesheet' href='styles/frituurfrida.css'>
</head>
<body>
	<h1>Frituur Frida</h1>
	<h2>
	 Vandaag zijn we 
	 <%
	 DayOfWeek vandaag = LocalDate.now().getDayOfWeek();
	out.print(vandaag == DayOfWeek.MONDAY||vandaag == DayOfWeek.THURSDAY ? "gesloten" : "open");
	 %>
	</h2>
</body>
</html>
