package config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.EnumSet;

/**
 * @Classname Config
 * @Description TODO
 * @Date 2019/11/13 22:00
 * @Created by zjl
 */
public class Config extends AbstractDispatcherServletInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter( );
        characterEncodingFilter.setEncoding("UTF-8");
        FilterRegistration.Dynamic registration = servletContext.addFilter("characterEncodingFilter", characterEncodingFilter);
        registration.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST,DispatcherType.INCLUDE,DispatcherType.ASYNC),false,"/*");
    }

    @Override
    protected WebApplicationContext createServletApplicationContext( ) {
        AnnotationConfigWebApplicationContext acm = new AnnotationConfigWebApplicationContext( );
        acm.register(SpringMvcConfiguration.class);
        return acm;
    }

    @Override
    protected String[] getServletMappings( ) {
        return new String[]{"/"};
    }

    @Override
    protected WebApplicationContext createRootApplicationContext( ) {
        AnnotationConfigWebApplicationContext acw = new AnnotationConfigWebApplicationContext( );
        acw.register(SpringConfiguration.class);
        return acw;
    }
}
