<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 		<link rel="stylesheet" href="<c:url value="/assets/css/bootstrap.min.css"/>">
 		<link rel="stylesheet" href="<c:url value="/assets/css/main.css"/>">
		<title>Event Manager</title>
	</head>
	<body>
		<main>
			<jsp:include page="../..${view}" />
		</main>
	</body>
</html>