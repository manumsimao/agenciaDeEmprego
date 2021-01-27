<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administração</title>
</head>
<body>
Seja bem vindo, ${sessionScope.usuario.login}! | <a href=logout>Sair</a>
<form method=post action=cadastrarProduto>
Entre com as informações do produto:<br>
Código:<input type=text name=codigo><br>
Nome:<input type=text name=nome><br>
Preço:<input type=text name=preco><br>
<input type=submit value=Cadastrar>
</form>
<c:if test="${not empty produtos}">
Produtos:
<table border=1>
<tr>
<th>Código</th>
<th>Nome</th>
<th>Preço</th>
</tr>
<c:forEach var="produto" items="${produtos}">
<tr>
<td>${produto.codigo}</td>
<td>${produto.nome}</td>
<td>${produto.preco}</td>
<td><a href=excluirProduto?codigo=${produto.codigo}>Excluir</a>
<td><a href=alterarProduto?codigo=${produto.codigo}>Alterar</a>
</tr>
</c:forEach>
</table>
</c:if>
</body>
</html>