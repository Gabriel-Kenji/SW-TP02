<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/alteraProduto" var="linkServletNovoProduto"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkServletNovoProduto }" method="post">
	
		Nome: <input type="text" name="nome" value="${produto.nome }" /><br/>
		Unidade de compra: <input type="number" name="unidadeCompra" value="${produto.unidadeCompra }" /><br/>
		Descri��o: <input type="text" name="descricao" value="${produto.descricao }" /><br/>
		Quantidade Prevista M�s: <input type="text" name="qtdPrevistoMes"  value="${produto.qtdPrevistoMes }"/><br/>
		Preco Maximo comprado: <input type="text" name="precoMaxComprado" value="${produto.precoMaxComprado }" /><br/>
		<input type="hidden" name="id" value="${produto.id }">
		<input type="submit" />
	</form>

</body>
</html>