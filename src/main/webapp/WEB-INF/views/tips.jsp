<!DOCTYPE html><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
  <head>
    <title>Pragmatic Software Development Tips</title>
    <meta charset="UTF-8">
  </head>
  <body>
    <h1>Pragmatic Software Development Tips</h1>
    <p>Extracted From <em>The Pragmatic Programmer</em><br>
      by Andrew Hunt and David Thomas. Copyright 2000, Addison Wesley.</p>
	<dl>
		<c:forEach items="${pragtips}" var="pragtip">
			<dt><c:out value="${pragtip.tip}" /></dt>
			<dd><c:out value="${pragtip.tipDescription}" /></dd>
		</c:forEach>
	</dl>
	<ul class="nav">
	    <li><a href="<%= request.getContextPath() %>">&lt;&lt; home</a></li>
    </ul>
</body>
</html>
