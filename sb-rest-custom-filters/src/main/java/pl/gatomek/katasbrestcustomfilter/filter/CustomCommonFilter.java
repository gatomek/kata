package pl.gatomek.katasbrestcustomfilter.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
@Order( 1)
public class CustomCommonFilter implements Filter{
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info( "common filter - in");

        final HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.addHeader( "ServerId", "11235813");

        chain.doFilter( request, response);
        log.info( "common filter - out");
    }
}
