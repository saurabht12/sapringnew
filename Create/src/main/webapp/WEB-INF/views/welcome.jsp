<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Welcome</title>
       
           
            <table id="users_table" class="table">
                </thead>
                <tbody>
                    <c:forEach items="${users}" var="user">
                        <tr align="center">
                            <!-- <td><c:out value="${user.id}" /></td>-->
                            <td><c:out value="${user.name}" /></td>
                             <td><c:out value="${user.pass}" /></td>
                              <td><c:out value="${user.mobileNumber}" /></td>
                               <td><c:out value="${user.email}" /></td>
                            <td>
                                <c:url var="editUrl" value="/user/edit?id=${user.id}" /><a id="update" href="${editUrl}" class="btn btn-warning">Update</a>
                            </td>
                            <td>
                                <c:url var="deleteUrl" value="/user/delete?id=${user.id}" /><a id="delete" href="${deleteUrl}" class="btn btn-danger">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>        
    </body>
</html>