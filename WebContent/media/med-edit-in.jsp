<%@page language="java" contentType="text/html; charset=UTF-8" %>

<%@page import="bean.MediaBean" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% MediaBean media =(MediaBean)session.getAttribute("mediaCode"); %>

<%@include file="../html/header.html" %>

<%@include file="../menu/header.jsp" %>


<center>
		<p>変更する内容を入力してください。</p>
		<form action="../media/MediaEditCheck.action" method="post">
		<input type ="hidden" name="mediaCode"value="${media.mediaCode}">
		<table align="center">
		<tr>
		 <th>タイトル :</th>
		 <td>
		 <input type="text"name="medTitle"value="${media.medTitle}"
		 minlength="3"maxlength="15"required="required">
		 </td>
		 </tr>
		 <tr>
		 <th>パスワード :</th>
		 <td>
		 <input type="text"name="userPass"value="${user.userPass}"
		 minlength="4"maxlength="10"required="required">
		 </td>
		 </tr>
		 <tr>
		 <th>ニックネーム :</th>
		 <td>
		 <input type="text"name="userName"value="${user.userName}"
		 minlength="1"maxlength="30"required="required">
		 </td>
		 </tr>
		 </table>
		 <p>
		 <input type="submit" value="変更する">
	     </form>


</center>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>