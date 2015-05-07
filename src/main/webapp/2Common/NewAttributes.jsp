<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New attributes</title>
</head>
<body>
<form action="/demoApp/Attributes" method="get" enctype="text/plain"><div>
  <select name="typAdresu">
    <option value="zameldowania">zameldowania</option>
    <option value="korespondencyjny">korespondencyjny</option>
    <option value="pracy">pracy</option>
  </select><br></br>
    <select name="województwo">
    <option value="dolnoslaskie">dolnośląskie</option>
    <option value="kujawsko-pomorskie">kujawsko-pomorskie</option>
    <option value="lubelskie">lubelskie</option>
    <option value="lubuskie">lubuskie</option>
    <option value="lodzkie">łódzkie</option>
    <option value="malopolskie">małopolskie</option>
    <option value="mazowieckie">mazowieckie</option>
    <option value="opolskie">opolskie</option>
    <option value="podkarpackie">podkarpackie</option>
    <option value="swietokrzyskie">świętokrzyskie</option>
    <option value="warminsko-mazurskie">warmińsko-mazurskie</option>
    <option value="wielkopolskie">wielkopolskie</option>
    <option value="zachodniopomorskie">zachodniopomorskie</option>
  </select><br></br>
 City :<input type="text" name="miasto" /><br />
 Postal code :<input type="text" name="kodPocztowy" /><br />
 Street :<input type="text" name="ulica" /><br />
 House :<input type="text" name="dom" /><br />
 
<input type="submit" value="Wyślij formularz" />
<input type="reset" value="Wyczyść dane" />
</div></form>
</body>
</html>