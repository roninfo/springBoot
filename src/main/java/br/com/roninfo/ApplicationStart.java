package br.com.roninfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//responsavel por startar o spring boot / tomcat
//@EnableAutoConfiguration
//@ComponentScan
//@Configuration
// as 3 anotacoes acima foram substituidas por SpringBootConfiguration
@SpringBootApplication
public class ApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}
