package com.javarnd.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfTheWeekInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
			
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(calendar.DAY_OF_WEEK);
		
		/*if (day == 5) {
			response.getWriter().write("This website is closed on Sunday Please visit tomorrow or any other day of the week");
			return false;
			
		}*/
		
		return true;
		
	}

}
