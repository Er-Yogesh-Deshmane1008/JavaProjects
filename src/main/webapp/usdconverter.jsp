<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		double rupeesToUSD(int rs)
		{
		  return rs*0.0121951219512195;
		}
		double rupeesToAusDollar(int rs)
		{
		  return rs*0.018;
		}
		double rupeesToMexicanPeso(int rs)
		{
		  return rs*0.22;
		}
		double rupeesToSingaporeDollar(int rs)
		{
		  return rs*0.016;
		}
		double rupeesToMaldivianRufiyaa(int rs)
		{
		  return rs*0.19;
		}
		double rupeesToEgyptianPound(int rs)
		{
		  return rs*0.38;
		}
		%>
		<%
		   String rs =(String)pageContext.getAttribute("rupees",pageContext.SESSION_SCOPE);
		System.out.println(rs);
		    int rupees=Integer.parseInt(rs);
		%>
		<h3><%=rupees%> rs =<%= rupeesToUSD(rupees) %> USD</h3>
		<h3><%=rupees%> rs =<%= rupeesToAusDollar(rupees) %> AusDollar</h3>
		<h3><%=rupees%> rs =<%= rupeesToMexicanPeso(rupees) %> MexicanPeso</h3>
		<h3><%=rupees%> rs =<%= rupeesToSingaporeDollar(rupees) %> SingaporeDollar</h3>
		<h3><%=rupees%> rs =<%= rupeesToMaldivianRufiyaa(rupees) %>  MaldivianRufiyaar</h3>
		<h3><%=rupees%> rs =<%= rupeesToEgyptianPound(rupees) %>  EgyptianPound</h3>
</body>
</html>