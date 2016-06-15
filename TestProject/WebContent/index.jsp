<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>:: TAX FORM ::</title>
<link href="Style.css" rel="stylesheet" type="text/css">
<link href="http://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
      <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
      <script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
	  <script src="http://code.highcharts.com/highcharts.js"></script>
      <script src= "https://cdnjs.cloudflare.com/ajax/libs/jqgrid/4.6.0/css/ui.jqgrid.css"></script>
	  <script src= "https://cdnjs.cloudflare.com/ajax/libs/jqgrid/4.6.0/js/i18n/grid.locale-en.js"></script>
	  
	<script src="ValidationScript.js" type="text/javascript">
</script> 
</head>
<body class="login_body">
<form action="hello" method="post">
<table border ="1" cellspacing="4" style="width:50%">
<th colspan="2">Personal Information</th>
  <tr>
    <td>Name</td>
    <td><input type="text" name="name"/ id="txtFirstName" placeholder='provide your Name' required>&nbsp;<span id="nameerr"></span></td>
  </tr>
  <tr>
  <td>Address</td>
    <td><input type="text" name="address" placeholder='provide your Address' required/>
</td>    
  </tr>
  <tr>
    <td>PAN</td>
    <td><input type="text" name="pan"/ id="pancard" placeholder='provide your Pan No.' required></td>   
  </tr>
<tr>
    <td>Date of Birth</td>
    <td><input type="text" name="dob" id="datepicker1" placeholder='provide your DOB' required/></td>    
  </tr>

<tr>
    <td>Assesment Year</td>
    <td><input type="text" name="assesment" / onkeypress="return isNumberKey(event)" placeholder='provide Assessment yr E.g. 2015-2016' maxlength="9" size="9" required></td>    
  </tr>
  
<tr>
    <td>Income</td>
    <td><input type="text" name="income"/ id ="quantity" placeholder='provide your Income' required>&nbsp;<span id="incomeerr"></span></td>    
  </tr>
<tr>
    <td>TDS</td>
    <td><input type="text" name="tds"/ id ="quantity1" placeholder='provide your TDS' required>&nbsp;<span id="tdserr"></span></td>    
  </tr>

<tr>
    <td>Tax Deducted</td>
    <td><input type="text" name="taxded"/ id ="quantity2" placeholder='provide Tax Deducted' required>&nbsp;<span id="taxdederr"></span></td>    
  </tr>

<tr>
    <td colspan="2"><center><input id = "buttonsave" type="submit" value="Save"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href='index.jsp'> <input id = "buttonclear" type="button" value="Clear"/></a><center></td>  
    
  </tr>

</table>
</form>
</body>
</html>