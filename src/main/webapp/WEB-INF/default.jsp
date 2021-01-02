<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
  <head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title><sitemesh:write property='title' /></title>
	<link rel="stylesheet" href="<c:url value='/resources/stylz/stylz.css'/>" type="text/css" media="screen">
	<link rel="stylesheet" href="<c:url value='/resources/stylz/stylz-print.css'/>" media="print">
  </head>
  <body>
    <div class="main">
    <sitemesh:write property='body'/>
    </div>
  </body>
</html>
