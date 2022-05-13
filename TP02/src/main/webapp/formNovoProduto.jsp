<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novoProduto" var="linkServletNovoProduto"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>

<body>
	<form action="${linkServletNovoProduto}" method="post">
		
		Nome: <input type="text" name="nome">
		
		Unidade Compra: <input type="number" name="unidadeCompra">
		
		Descrição : <input type="text" name="descricao">
		
		Quantidade previsto mês: <input type="number" name="qtdPrevistoMes">
		
		Preco Maximo Comprado: <input type="number" name="precoMaxComprado">
		
	</form>
</body>
</html>