<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Carrinho</title>
</head>
<body>
Seja bem vindo, ${sessionScope.usuario.login}! | <a href=logout>Sair</a>
<c:if test="${not empty carrinho}">
<h1>Carrinho</h1>
<table border=1>
<tr>
<th>C�digo</th>
<th>Nome</th>
<th>Pre�o</th>
</tr>
<c:forEach var="produto" items="${carrinho}">
<tr>
<td>${produto.codigo}</td>
<td>${produto.nome}</td>
<td>${produto.preco}</td>
<td><a href=removerProdutocarrinho?codigo=${produto.codigo}>Remover</a></td>
</tr>
</c:forEach>
</table>
</c:if>
<a href=listarProdutosCliente>Card�pio</a> | <a href=finalizarCompra>Finalizar</a>
</body>
</html>