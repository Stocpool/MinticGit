package com.example;

import com.example.vista.Vista_Serie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class BasicApplication {
    
    public static void RunSpringServer(String[] args){
        SpringApplication.run(BasicApplication.class, args);
    }
    
    public static void main(String[] args) {
        Vista_Serie ventana = new Vista_Serie();
        ventana.setVisible(true);
		
    }
               
}
