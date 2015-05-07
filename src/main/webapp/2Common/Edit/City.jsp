<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit</title>
</head>
<body>
<form action="/demoApp/Attributes" method="get" enctype="text/plain"><div>
  <select name="adressTypeEdit">
    <option value="zameldowania">zameldowania</option>
    <option value="korespondencyjny">korespondencyjny</option>
    <option value="pracy">pracy</option>
  </select><br></br>
 City :<input type="text" name="cityEdit" /><br />
 
<input type="submit" value="Wyślij formularz" />
<input type="reset" value="Wyczyść dane" />
</div></form>
</body>
</html>