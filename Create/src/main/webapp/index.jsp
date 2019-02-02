<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html><body style='background-color:#5900ff;height:200px';>
<head><h1 align='center' style='margin-top:30px;'><u>User LogIn</u></h1></head>
<table width=30% style='margin-top:100px;height:200px' align='center' border=1>
<form action='find'><tr><td>Enter Username</td><td><input type='text' name='name'></td></tr>
<tr><td>Enter Password</td><td><input type='password' name='pass'></td></tr></table>
<input type='submit' style='color:blue;margin-left:450px;margin-top:30px;width:90px;height:40px;' value='LogIn'></form>
