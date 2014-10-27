package controllers.common;

import java.io.IOException;
import java.util.logging.LogRecord;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = "/*")
public class AuthenticationFilter implements Filter {

	static String[] allowed = {
		"^/$", "^/login$", "^/user_new$", "^/event$", "^/subscribe$", "^/assets/*$"
	};
	
	private boolean isAllowed(String path) {
		for (String url : allowed) {
			Pattern p = Pattern.compile(url);
			Matcher m = p.matcher(path);
			if (m.matches())
				return true;
		}
		return false;
	}
	
    public AuthenticationFilter() { }

	public void init(FilterConfig fConfig) throws ServletException { }
	
	public void destroy() {	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest  httpRequest  = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse)response;
		
		HttpSession session = httpRequest.getSession(false);
		if (isAllowed(httpRequest.getServletPath()) || (session != null && session.getAttribute("token") != null))
			chain.doFilter(request, response);
		else
			httpResponse.sendRedirect(httpRequest.getContextPath().toString() + "/login?error=authentication");
		
	}
}
