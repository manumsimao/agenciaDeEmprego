<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Atualizar Produto</title>
</head>
<body>
Seja bem vindo, ${sessionScope.usuario.login}! | <a href=logout>Sair</a>
<form method=post action=atualizarProduto>
Entre com as informa��es do produto:<br>
C�digo:<input type=text name=codigo value="${produto.codigo}" readonly><br>
Nome:<input type=text name=nome value="${produto.nome}"><br>
Pre�o:<input type=text name=preco value="${produto.preco}"><br>
<input type=submit value=Atualizar>
</form>
</body>
</html>