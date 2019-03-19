package com.sglwb.web.servlet;

import com.sglwb.web.base.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserServlet")
public class UserServlet extends BaseServlet {
    public String registUI(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return "/jsp/register.jsp";
    }
    public String loginUI(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return "/jsp/login.jsp";
    }



}
