<%@ page contentType="text/html" pageEncoding="UTF-8" session="false"%>

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
	<h2>Vandaag zijn we ${openGesloten}</h2>
	<img src="images/${openGesloten}.png" alt="${openGesloten}" title="${openGesloten}">
	<h2>Adres</h2>
	<p>${adres.straat} ${adres.huisNr} <br>
		${adres.gemeente.postCode} ${adres.gemeente.naam} 
	</p>
</body>
</html>
