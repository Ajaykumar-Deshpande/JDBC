package com.xworkz.bag.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.service.BagService;
import com.xworkz.bag.service.BagServiceImpl;

public class BagServlet extends HttpServlet {
	public BagServlet() {

		System.out.println("no arg const of BagServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	String name = req.getParameter("name");
	String email = req.getParameter("email");
	String age = req.getParameter("age");
	String contact = req.getParameter("contact");
	int convertedAge = Integer.valueOf(age);
	long convertedContact = Long.valueOf(contact);

	BagService bagService = new BagServiceImpl();
	BagDto bagDto = new BagDto(name, email, convertedAge, convertedContact);
	boolean check=bagService.validateAndSave(bagDto);

	if(check)
	{
		System.out.println("valid Form");
	}else
	{
		System.out.println("invalid form");
	}

	RequestDispatcher requestDispatcher = req.getRequestDispatcher("./Bag.jsp");requestDispatcher.forward(req,resp);

}

}
