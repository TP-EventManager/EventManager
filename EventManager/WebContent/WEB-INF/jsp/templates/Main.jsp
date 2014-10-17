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
	
	
		<header>
			<nav class="navbar navbar-default">
				<div class="container-fluid">
					<div class="navbar-header">
						<a href="${pageContext.request.contextPath}" class="navbar-brand"> Event Manager </a>
					</div>
					<c:choose>
						<c:when test="${empty sessionScope.token}">
    						<div class="nav navbar-nav navbar-form navbar-right">
    							<a href="${pageContext.request.contextPath}/login" class="btn btn-default">Sign in</a> 
    						</div>
    					</c:when>
    					
    					<c:otherwise>
    						<form action="${pageContext.request.contextPath}/logout" method="post" class="navbar-form">
    							<div class="nav navbar-nav navbar-right">
    								<input type="submit" value="Sign out" class="btn btn-default"/> 
    							</div>
    						</form>
    					</c:otherwise>
					</c:choose>
					
  				</div>
			</nav>
		</header>
		
		
		<main>
			<jsp:include page="../..${view}" />
		</main>
		
		
	</body>
</html>