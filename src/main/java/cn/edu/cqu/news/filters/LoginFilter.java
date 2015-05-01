package cn.edu.cqu.news.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		/*	HttpServletRequest req=(HttpServletRequest)request;
		String uri=req.getRequestURI();
		if(uri.endsWith(".do")||uri.endsWith(".html"))
		{
			if(uri.endsWith("index.html")||uri.endsWith("login.do"))
			{
			}else
			{
				HttpSession session=req.getSession();
				User user=(User) session.getAttribute("user");
				if(user==null)
				{
					//
					HttpServletResponse res=(HttpServletResponse)response;
					//System.out.println("/"+req.getContextPath()+"/login.html");
					res.sendRedirect(req.getContextPath()+"/index.html");
					return;
				}else
				{
					
				}
			}
		}
		*/
		chain.doFilter(request, response);
		
		

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
