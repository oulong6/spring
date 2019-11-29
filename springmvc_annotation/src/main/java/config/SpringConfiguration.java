package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Classname SpringMvcConfiguration
 * @Description TODO
 * @Date 2019/11/13 20:42
 * @Created by zjl
 */
@Configuration
@ComponentScan(value = "com.oulong",excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class))
public class SpringConfiguration {
}
