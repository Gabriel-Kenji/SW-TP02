<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
	Lista de produtos: <br />
	<c:if test="${not empty produto}">
		Produto ${produto} cadastrado com sucesso!
	</c:if>
	<ul>
		<c:forEach items="${produto}" var="empresa">
			
			<li>${produto.nome } - ${produto.unidadeCompra} - ${produto.descricao} - ${produto.qtdPrevistoMes} - ${produto.precoMaxComprado} </li>
			<a href="/TP-02/mostraProduto?id=${produto.id}">edita</a>
			<a href="/TP-02/removeProduto?id=${produto.id}">remove</a>
		</c:forEach>
	</ul>
	
</body>
</html>