<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="task1.model.Tasks" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
        <title>Title</title>
        <%@include file="head.jsp"%>
    </head>
    <body>
    <%@include file="navbar.jsp"%>

    <div class="container mt-5" >
       <!-- Button trigger modal -->
        <button type="button" class="btn btn-info text-light" data-bs-toggle="modal"
                data-bs-target="#addTask">
         + ADD TASK
        </button>
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">TO DO</th>
                    <th scope="col">DEADLINE</th>
                    <th scope="col">DONE</th>
                    <th scope="col">DETAILS</th>
                </tr>
                </thead>
                <tbody>
                <%
                    ArrayList<Tasks> tasks=(ArrayList<Tasks>) request.getAttribute("todoList");
                    if (tasks!=null){
                        for (Tasks task:tasks) {

                %>
                <tr>
                    <td scope="row"><%=task.getId()%></td>
                    <td><%=task.getName()%></td>
                    <td><%=task.getDeadlineDate()%></td>
                    <td><%=task.getDescription()%></td>
                    <td><a href="#" class="btn btn-info text-light"> DETAILS</a>
                    </td>
                </tr>
                <%
                        }
                    }
                %>

                </tbody>
            </table>
    </div>
    </body>
    </html>
