package demo;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 153733M on 11/14/2016.
 */
@WebServlet(name = "Servlet",urlPatterns = "/servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Book b = new Book();
        Gson gson = new Gson();
        String json = gson.toJson(b);
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println(json);
        out.close();
    }
}
