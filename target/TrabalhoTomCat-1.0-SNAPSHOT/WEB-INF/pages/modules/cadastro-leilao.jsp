<%@ page import="java.io.PrintWriter" %>
<%@ page import="acao.CadastrarLeilao" %>
<%@ page import="Enumeradores.SituacaoEnum" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Cadastro Leilão</title>
  <style>
    body{
      background-color: aqua;
    }
    h2 {
      color: red;
    }
  </style>
</head>
<body>
<a href="dashboard?acao=dashboard">Menu</a>
<h1>Cadastro</h1>
<h2>${Verificar}</h2>
<p>${VerificarCampo}</p>
<form action="dashboard?acao=cadastraLeilao" method="post" class="inputs">
  <input type="text" name="input-name" placeholder="Informe o nome" class="input-nome" required>
  <input type="text" name="input-descricao" placeholder="Informe uma descrição" class="input-descricaoo" required>
  <select name="status" >
    <option value="FECHADO">FECHADO</option>
    <option value="ABERTO">ABERTO</option>
    <option value="ENCERRADO">ENCERRADO</option>
    <option value="CANCELADO">CANCELADO</option>
  </select>
  <input type="submit" value="Salvar" class="button">
</form>
</body>
</html>