package com.jamadeu.livros;

import org.springframework.boot.SpringApplication;

public class TestLivrosApplication {

	public static void main(String[] args) {
		SpringApplication.from(LivrosApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
