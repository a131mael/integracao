package br.com.aaf.integracao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
@EntityScan(basePackages = {"br.com.aaf.integracao.model"})
public class CartorioApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CartorioApplication.class, args);
	}

}
