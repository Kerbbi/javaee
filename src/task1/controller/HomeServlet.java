package task1.controller;

import task1.model.DBManager;
import task1.model.Tasks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Tasks> tasks= DBManager.getAllTasks();
        request.setAttribute("todoList",tasks);
        request.getRequestDispatcher("/view/home.jsp").forward(request,response);
    }
}
