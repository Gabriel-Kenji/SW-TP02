<% //Gabriel Kenji Utiyama CB3012069 %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novoProduto" var="linkServletNovoProduto"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="index.html"><h3>voltar </h3></a>
	<form action="${linkServletNovoProduto}" method="post">
	
		Nome: <input type="text" name="nome"  /><br/>
		Unidade de compra: <input type="number" name="unidadeCompra"  /><br/>
		Descrição: <input type="text" name="descricao"  /><br/>
		Quantidade Prevista Mês: <input type="text" name="qtdPrevistoMes"  /><br/>
		Preco Maximo comprado: <input type="text" name="precoMaxComprado"  /><br/>
	
		<input type="submit" />
	</form>

</body>
</html>