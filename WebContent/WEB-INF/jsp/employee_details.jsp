<%@ page contentType="text/html; charset = UTF-8"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>

<html>
<head>
<title>Employee Details</title>
</head>
<body>
	<%
		String msg = (String) request.getAttribute("message");
		if (!msg.equals("NULL")) {
			String data=(String)request.getAttribute("empmap");
			out.println(data);
		}
	%>

</body>
</html>