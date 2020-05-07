package br.com.automacao;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login = new Login();
		ConnectCAM connect = new ConnectCAM();
		AccessOrderControl acessarOrdens = new AccessOrderControl();
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe seu login");
		login.setLogin(sc.next());

		System.out.println("Informe seu senha");
		login.setSenha(sc.next());

		connect.logar(login);
		acessarOrdens.acessar();

		sc.close();

	}

}
