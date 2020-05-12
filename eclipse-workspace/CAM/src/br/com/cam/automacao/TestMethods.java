package br.com.cam.automacao;

import br.com.cam.dao.DBConnection;

public class TestMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnection conexao = new DBConnection();

		System.out.println(conexao.getConexaoSQL());

	}

}
