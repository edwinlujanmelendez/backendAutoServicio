package pe.movilbus.autoservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApirestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(ApirestApplication.class);
	}
	
	// CROS (access API-Rest)
	@Bean
	public WebMvcConfigurer corsConfigure() {
		return new WebMvcConfigurer() {			
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// TODO Auto-generated method stub -- https://movilbus.pe/autoservicio/v1/** to * 
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST", "DELETE", "PUT") ;
			}
		};
	}
	
}
