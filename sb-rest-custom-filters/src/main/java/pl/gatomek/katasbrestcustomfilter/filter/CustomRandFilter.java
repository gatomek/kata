package pl.gatomek.katasbrestcustomfilter.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class CustomRandFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info( "rand filter - in");
        chain.doFilter( request, response);
        log.info( "rand filter - out");
    }
}
