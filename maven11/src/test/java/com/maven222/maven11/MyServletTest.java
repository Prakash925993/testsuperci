package com.maven222.maven11;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

import junit.framework.Assert;

import java.io.StringWriter;
import java.io.PrintWriter;



	public class MyServletTest {

	    @Test
	    public void testDoGet() throws ServletException, IOException {

	       
	        HttpServletRequest request = mock(HttpServletRequest.class);
	        HttpServletResponse response = mock(HttpServletResponse.class);

	       
	        when(request.getParameter("name")).thenReturn("John");
	        StringWriter sw = new StringWriter();
	        PrintWriter pw = new PrintWriter(sw);
	        when(response.getWriter()).thenReturn(pw);

	      
	        MyServlet servlet = new MyServlet();
	        servlet.doGet(request, response);
	        verify(response).setContentType("text/plain");
	        verify(response).getWriter();
	        String expected = "Hello, John";
	        assertEquals(expected, sw.toString().trim());
	    }

	}
