<!-- report generating module -->
<html>
<head>
	<title>Radiology Report</title>
</head>
<body>
	<h1>Generate Radiology Report</h1>
	<form name="report" method="get" action="report.jsp">
	<H3><b>Diagnosis:</b><input name="input_diagnosis" type="text"><br></H3>
	<p>Please enter dates as DD/MM/YYYY</p>
	<H3><b>Date Range Start: </b><input name="input_date_start" pattern="(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\d\d" type="text" title="DD/MM/YYYY"><br></H3>
	
	<H3><b>Date Range End: </b><input name="input_date_end" pattern="(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\d\d" type="text" title="DD/MM/YYYY"><br></H3>
	<input name="report_submit" type="submit" value="Generate">
	</form>
	
	<%
	  String error = (String) session.getAttribute("error");
	  if (error != null) {
	    out.println(error);
	    session.removeAttribute("error");
	  }
	%>
</body>
</html>
