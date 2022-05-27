<% //Gabriel Kenji Utiyama CB3012069 %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, Gabriel.Kenji.Utiyama.Produto" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>

	<a href="formNovoProduto.jsp"><h3>voltar </h3></a>
	<c:if test="${not empty produto}">
		Produto ${ produto } cadastrada com sucesso!
	</c:if>
	Lista de produtos: <br />
	
	<ul>
		<c:forEach items="${produtos}" var="produto">
			
			<li>
				Nome: ${produto.nome } <br/>
				Unidade Compra: ${produto.unidadeCompra } <br/>
				Descrição: ${produto.descricao } <br/>
				Quantidade Previsto Mes: ${produto.qtdPrevistoMes } <br/>
				Preço Maximo Comprado:: ${produto.precoMaxComprado } <br/>
				<a href="/TP02/mostraProdutos?id=${produto.id}">edita</a>
				<a href="/TP02/removeProdutos?id=${produto.id}">remove</a>
			</li><br/>
			
		</c:forEach>
	</ul>
	
</body>
</html>