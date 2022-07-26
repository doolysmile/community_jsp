<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.kch.exam.Rq"%>
<%
//    int dan = Integer.parseInt(request.getParameter("dan"));
//    int limit = Integer.parseInt(request.getParameter("limit"));
    Rq rq = new Rq(request, response);
    int dan = rq.getIntParam("dan", 9);
    int limit = rq.getIntParam("limit", 9);
%>
<h1>.jsp입니다.</h1>
<h1><%=dan%>단</h1>

<% for ( int i = 1; i <= limit; i++ ) { %>
<div><%=dan%> * <%=i%> = <%=dan * i%></div>
<% } %>