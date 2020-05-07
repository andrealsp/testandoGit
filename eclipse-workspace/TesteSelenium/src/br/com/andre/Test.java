package br.com.andre;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		PesquisarGoogle p = new PesquisarGoogle();

		Scanner sc = new Scanner(System.in);
		String pesquisa;

		System.out.println("Insira sua busca...");
		pesquisa = sc.next();

		p.pesquisar(pesquisa);

		sc.close();

	}
}
