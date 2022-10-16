package br.com.farmacia.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {
private static final String  USUARIO = "root";
private static final String URL = "jdbc:mysql://localhost:3306/farmacia";
private static final String SENHA = "";

public static Connection conectar() throws SQLException, ClassNotFoundException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
	return conexao;
}
public static void main(String[] args){
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Conectado com sucesso!");
	} catch (ClassNotFoundException e) {
		System.out.println("Falha na conexao com o banco de dados!");
	}
}

}
