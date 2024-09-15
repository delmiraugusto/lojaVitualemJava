package com.loja.virtual;

import com.loja.virtual.modelos.menu.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.loja.virtual.modelos.menu.Menu.menu;
import static com.loja.virtual.modelos.menu.Menu.menu_principal;

@SpringBootApplication
public class VirtualApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualApplication.class, args);
		menu_principal();
	}
}
