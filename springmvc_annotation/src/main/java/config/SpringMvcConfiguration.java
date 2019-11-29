package config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
/**
 * @Classname SpringMvcConfiguration
 * @Description TODO
 * @Date 2019/11/13 20:46
 * @Created by zjl
 */
@Configuration
@ComponentScan("com.oulong.web.controller")
public class SpringMvcConfiguration {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver( );
        viewResolver.setSuffix(".jsp");
        viewResolver.setPrefix("/WEB-INF/page/");
        return viewResolver;
    }
}
