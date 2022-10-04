package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ProtocolException;

@WebServlet(urlPatterns = "/player.do")
public class PlayerServlet extends HttpServlet {

    PlayerService service = new PlayerService();

    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String playerName = request.getParameter("name");
        System.out.println(playerName);
        request.setAttribute("jspPlayerName", playerName);

        Player player = service.getPlayerByName(playerName);
        request.setAttribute("name", playerName);
        request.setAttribute("id",player.getId());
        request.setAttribute("nationality",player.getNationality());
        request.setAttribute("age",player.getAge());









        request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request,response);
        //request.setAttribute("jspPlayerName", playerName);

    }




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws IOException, ServletException {

        String playerName = request.getParameter("name");
        System.out.println(playerName);
        request.setAttribute("PlayerName", playerName);
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);



//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<head>"+
//                        "<title>Player</title/>"+
//                "</head>");
//
//        writer.println("<body>"+
//                "<h1>Welcome to Player Application</h1>"+
//                "</body>");
//        writer.println("</html");

    }


}
