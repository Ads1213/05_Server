package edu.kh.servlet.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/coffee")
public class ExampleController3 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String order 	= req.getParameter("orderer");
		String coffee 	= req.getParameter("coffee");
		String type 	= req.getParameter("type");
		
		String opt 		= req.getParameter("opt");
		String[] optArr = req.getParameterValues("opt");
//		getParameterValues 메서드 : 같은 name 속성을 가진 모든 값을 배열(String[])로 반환
		
		System.out.println(order);
		System.out.println(coffee);
		System.out.println(type);
		System.out.println(opt); 	// shot
		System.out.println(optArr); // 주소값
		
//		opt 미 선택시 optionArr = null
		if(optArr != null) {
			for(String options : optArr) {
				System.out.println(options);
			}
		}
		
		RequestDispatcher dispatcher
		= req.getRequestDispatcher("/WEB-INF/views/result2.jsp");
		
		dispatcher.forward(req, resp);
		
		
		
	}
	
	

}
