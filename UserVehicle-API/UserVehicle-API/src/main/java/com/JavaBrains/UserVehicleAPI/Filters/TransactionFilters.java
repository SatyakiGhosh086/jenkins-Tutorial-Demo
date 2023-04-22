package com.JavaBrains.UserVehicleAPI.Filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class TransactionFilters implements Filter
{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException 
	{
		System.out.println("Inside the Transaction Filter");
		HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        System.out.println(
          "TransactionFilters Logging Request  {} "+req.getMethod()+" : "+ 
          req.getRequestURI());
        chain.doFilter(request, response);
        System.out.println(
          "TransactionFilters Logging Response : "+ res.getContentType());
		
	}

}
