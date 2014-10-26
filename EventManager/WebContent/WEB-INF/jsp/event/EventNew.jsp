<%@ include file="/WEB-INF/jspf/Prolog.jspf" %>

<section>
	<c:if test="${param.invalid == \"true\" }">
		<p class="alert alert-danger">Error: Invalid data</p>
	</c:if>
	
	<h3> Add a new event </h3>
	<form action="${pageContext.request.contextPath}/event_new" method="post">
		<div class="form-group">
			<label for="event_name">Name of the event</label> 
			<input type="text" id="event_name" name="eventName" required class="form-control">
		</div>

		<div class="form-group">
			<label for="event_address">Place of the event</label> 
			<input type="text" id="event_address" name="eventAddress" required class="form-control">
		</div>

		<div class="row">
			<div class='col-sm-12'>
				<div class="form-group">
					<label for="event_begdate">When does the event start ?</label> 
  					<div id="datetimepicker_beg" class="input-group date">
						<input type="text" id="event_begdate" name="eventBegDate" required class="form-control">
						<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
 					</div>
        		</div>
 			</div>
		</div>

		<div class="row">
			<div class='col-sm-12'>
				<div class="form-group">		
					<label for="event_enddate">When does the event end ?</label> 
			  		<div id="datetimepicker_end" class="input-group date">
						<input type="text" id="event_enddate" name="eventEndDate" required class="form-control">
						<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
 					</div>
        		</div>
 			</div>
		</div>

		<div class="form-group">
			<label for="event_published">Publish the event</label> 
			<input type="checkbox" id="event_published" name="eventPublished">
		</div>

		<input type="submit" value="Add the event" class="btn btn-primary">
	</form>
</section>
<script type="text/javascript">
$(function () {
    $('#datetimepicker_beg').datetimepicker();
    $('#datetimepicker_end').datetimepicker();
});
</script>
