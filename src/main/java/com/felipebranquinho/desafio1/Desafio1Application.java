package com.felipebranquinho.desafio1;

import com.felipebranquinho.desafio1.entities.Order;
import com.felipebranquinho.desafio1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	Scanner scanner = new Scanner(System.in);

	@Override
	public void run(String... args) throws Exception {

		// Para digitar as informações de um pedido por teclado
//		System.out.print("\nDigite o código do pedido: ");
//		int codigo = scanner.nextInt();
//
//		scanner.nextLine(); // para limpar o buffer do scanner
//
//		System.out.print("\nInforme o preço base do pedido: ");
//		double precoBase = scanner.nextDouble();
//
//		scanner.nextLine(); // para limpar o buffer do scanner
//
//		System.out.print("\nInsira a porcentagem de desconto do pedido: ");
//		double porcentagemDeDesconto = scanner.nextDouble();
//
//		scanner.close();
//
//		Order order	= new Order(codigo, precoBase, porcentagemDeDesconto);
//
//		System.out.println("\nPedido código " + order.getCode());
//		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));

		Order order = new Order(1034, 150.00, 20.0);
		System.out.println("\nPedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));

		Order order2 = new Order(2282, 800.00, 10.0);
		System.out.println("\nPedido código " + order2.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order2));

		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("\nPedido código " + order3.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order3));

		Order order4 = new Order(3250, 100.00, 50.0);
		System.out.println("\nPedido código " + order4.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order4));
	}
}
