<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fresenius Build your Pc</title>
<style type="text/css">
@import url("design.css")
</style>
</head>
<body>
<center>Welkom bij Frenesius</center>
<section class="main">
	 <form action="HandleUserInfo.do" class="search" method="post" autocomplete="on">
		 <input type="text" name="PcBuilder" placeholder="Build your pc..." />
		
		 <ul class="results" >
			 <li><a href="Products.jsp" >Core I7<br /></a></li>
			 <li><a href="Products.jsp">Core I5<br /></a></li>
	 		<li><a href="Products.jsp">Core I3<br /></a></li>
		 </ul>
	 </form>
</section>
</body>
</html>