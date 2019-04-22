package cn.net.jalo.springcloud.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PreZuulFilter extends ZuulFilter {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PreZuulFilter.class);

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext requestContext = RequestContext.getCurrentContext();
		HttpServletRequest request = requestContext.getRequest();
		LOGGER.info(String.format("%s ==> %s", request.getMethod(), request.getRequestURL().toString()));
		Object token = request.getParameter("token");
		if (token == null) {
			LOGGER.warn("token is empty");
			requestContext.setSendZuulResponse(false);
			requestContext.setResponseStatusCode(401);
			try {
				requestContext.getResponse().getWriter().write("token is empty");
			} catch (Exception e) {
				
			}
			return null;
		}
		LOGGER.info("OK");
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}
