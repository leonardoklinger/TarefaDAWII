<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
  <title>Menu Inicial</title>
</head>
<body>
<a href="dashboard?acao=dashboard">Menu</a>
<h1>Leilões</h1>
<h2></h2>
<table id="minhaTabela">
  <thead>
  <tr id="tr-corpo">
  <tr>
    <th>ID</th>
    <th>Nome</th>
    <th>Descrição</th>
    <th>Situação</th>
  </tr>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${list}" var="l">
    <tr>
      <td>#${l.id}</td>
      <td>${l.nome}</td>
      <td id="statustd">${l.descricao}</td>
      <td id="valortd">${l.situacao}</td>
      <td><a href="dashboard?acao=deleta&id=${l.id}">Excluir</a></td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>