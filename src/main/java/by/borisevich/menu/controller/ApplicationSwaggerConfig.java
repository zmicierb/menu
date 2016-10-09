package by.borisevich.menu.controller;

import com.fasterxml.classmate.TypeResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class ApplicationSwaggerConfig {

    @Autowired
    private TypeResolver typeResolver;


    @Bean
    public Docket documentation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
//                .genericModelSubstitutes(ResponseEntity.class)
//                .alternateTypeRules( new AlternateTypeRule(typeResolver.resolve(ResponseEntity.class,
//                        typeResolver.resolve(Response.class, WildcardType.class)),
//                        typeResolver.resolve(WildcardType.class)))
//                .useDefaultResponseMessages(false)
//                .globalResponseMessage(RequestMethod.GET, new ArrayList<ResponseMessage>())
//                .securitySchemes(apiKeys())
                .apiInfo(metadata()
                );
    }

    @Bean
    public UiConfiguration uiConfig() {
        return UiConfiguration.DEFAULT;
    }

//    private List<ResponseMessage> responseMessages(){
//        List<ResponseMessage> responseMessages = new ArrayList<ResponseMessage>();
//        responseMessages.add(new ResponseMessageBuilder().code(500));
//    }

//    private List<SecurityScheme>  apiKeys() {
//        List<SecurityScheme> schemes = new ArrayList<SecurityScheme>();
//        schemes.add(new ApiKey("b", "searchType", "header"));
//        schemes.add(new ApiKey("0", "debug", "header"));
//        return schemes;
//    }


    private ApiInfo metadata() {
        return new ApiInfoBuilder()
                .title("API")
                .description("")
                .version("1.0")
                .build();
    }
}
