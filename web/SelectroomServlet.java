package com.sample;

import com.sample.model.LiquorType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "selectroomservlet",
        urlPatterns = "/Selectroom"
)
public class SelectroomServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String roomType = req.getParameter("Type");

        roomService roomService = new roomService();
        roomType l = String.valueOf(roomType);

        List room = roomService.getAvailablerooms(l);

        req.setAttribute("Rooms", room);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
