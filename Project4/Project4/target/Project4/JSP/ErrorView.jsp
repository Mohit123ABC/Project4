<%@page import="in.co.rays.proj4.controller.ORSView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error</title>
</head>
<body>

	<form action="<%=ORSView.ERROR_CTL%>" method="get">
 	<div align="center">
 		<img src="<%=ORSView.APP_CONTEXT%>/img/500img.png" width="550" height="250">
 		<h1 align="center" style="color:red "> Ooops! Network Issue..</h1>
 		<font style="color: black ; font-size: 25px ">
 		<b>500</b> : Requested resources is not available
 		
 		</font>
 	<div style="width: 25% ; text-align: justify;">
 		<h3>Try :</h3> 
 		<ul>
 			<li> Check the network cables , modem and router</li>
 			<li> Reconnect to network or wi-fi</li>
 		</ul>
 	</div>
 	</div>
	
		<h4 align="center">
			<font size="5px" color="black">
			<a href="<%=ORSView.WELCOME_CTL %>" style="color: silver">*Click here to Go Back*</a>			
			</font>
		</h4>
	</form>	
</body>
</html>