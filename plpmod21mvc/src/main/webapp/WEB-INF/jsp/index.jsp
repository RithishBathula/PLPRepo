<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/addproducts">
Enter pId: <input type="text" name="p_id"/><br>
Enter pName: <input type="text" name="p_name"/>
CompNAme: <input type="text" name="companyName"/>
price  <input type="number" name="p_price"/>
Date <input type="date" name="p_datemanufacturing">
P_Type: <input type="text" name="p_type"> 
P_type <input type="number" name="m_id">
Quantity: <input type="number" name="quantity">
Coupon: <input type="text" name="coupon_id">

<input type="submit" value="add Product"/>
</form>
</body>
</html>