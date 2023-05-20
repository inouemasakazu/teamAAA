<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<body id="common">
<%@include file="../menu/header.jsp" %>

<div class="main">


<!--テキストボックスのサイズはCSSで指定できるそうですわよ  -->

 <div class="review">
     <p >レビュー投稿フォーム（全角200文字以内）</p>
     <textarea class="reviewform-textarea"></textarea>
   </div>


<input type="button" onclick="history.back()" value="戻る">
<input type="reset" value="リセット">
<input type="submit" value="投稿内容確認">



</div>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>