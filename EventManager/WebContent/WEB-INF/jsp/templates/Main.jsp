<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 		<link rel="stylesheet" href="<c:url value="/assets/css/bootstrap.min.css"/>">
 		<link rel="stylesheet" href="<c:url value="/assets/css/main.css"/>">
  		<link rel="stylesheet" href="<c:url value="/assets/css/bootstrap-datetimepicker.min.css"/>">	

		<script src="<c:url value="/assets/js/jquery.min.js"/>"> </script> 	  			
		<script src="<c:url value="/assets/js/bootstrap.min.js"/>"> </script> 	
		<script src="<c:url value="/assets/js/moment.js"/>"> </script> 	
		<script src="<c:url value="/assets/js/bootstrap-datetimepicker.js"/>"> </script> 		

				  		
		<title>Event Manager</title>
	</head>
	<body>
	
		<%@ include file="../../jspf/Header.jspf" %>
			 
		<main>
			<jsp:include page="../..${view}" />
		</main>
		
	</body>
</html>