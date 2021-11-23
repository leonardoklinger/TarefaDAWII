<%@ page import="java.io.PrintWriter" %>
<%@ page import="acao.CadastrarLeilao" %>
<%@ page import="Enumeradores.SituacaoEnum" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Cadastro Participante</title>
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
<h1>Cadastro Participante</h1>
<form action="dashboard?acao=cadastraParticipante" method="post" class="inputs">
  <input type="text" name="input-name" placeholder="Informe o nome" class="input-nome" required>
  <input type="text" name="input-sobrenome" placeholder="Informe um sobrenome" class="input-sobrenome" required>
  <input type="text" name="input-cpf" placeholder="Informe um cpf" class="input-cpf" required>
  <input type="submit" value="Salvar" class="button">
</form>
</body>
</html>