package pl.gatomek.katasbrestcustomfilter.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.gatomek.katasbrestcustomfilter.filter.CustomRandFilter;

@Configuration
public class RestConfig {
    @Bean
    public FilterRegistrationBean<CustomRandFilter> randFilter() {
        FilterRegistrationBean<CustomRandFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter( new CustomRandFilter());
        bean.addUrlPatterns( "/rand");
        bean.setOrder( 2);

        return bean;
    }
}
