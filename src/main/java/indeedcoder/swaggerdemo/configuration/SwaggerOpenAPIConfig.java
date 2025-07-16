package indeedcoder.swaggerdemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerOpenAPIConfig {

	@Bean
	public OpenAPI apiInfo() {
		Contact contact = new Contact();
		contact.setName("Aman");
		contact.setEmail("amankumar.m99@gmail.com");
		contact.setUrl("www.google.com");
		License license = new License();
		license.setName("IndeedLic");
		license.setUrl("indeedcoderlic");
		return new OpenAPI().info(new Info().title("My API for Swagger demo")
				.description("API for IndeedCoder Swagger Demo").version("1.0").contact(contact).license(license));
	}
}

//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//@EnableSwagger2
//public class SwaggerConfiguration {
//
//	@Bean
//	public Docket createDocket() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("indeedcoder.swaggerdemo.controller"))
//				.paths(PathSelectors.regex("/api.*")).build();
//	}
//
//}
