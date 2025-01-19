package org.jtgm.sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Application {
    public static void main(String[] args){
        try {
            SpringApplication.run(Application.class, args);
        }catch(Throwable ex){
            ex.printStackTrace();
        }
    }
}