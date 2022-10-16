package br.com.farmacia.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import br.com.farmacia.dao.FornecedorDao;
import br.com.farmacia.domain.Fornecedor;

public class Teste {
	public static void main(String[] args) throws SQLException {
Fornecedor f1 = new Fornecedor();
FornecedorDao fdao = new FornecedorDao();
System.out.println();
try {
	ArrayList<Fornecedor>  lista = fdao.listar();
	for(Fornecedor f : lista) {
		System.out.println("Resultado: " + f);
	}
	
} catch (Exception e) {
	// TODO: handle exception
}
/*
 * f1.setDescricao("X"); try{ ArrayList<Fornecedor> lista =
 * fdao.buscarPorDescricao(f1); for(Fornecedor f : lista) {
 * System.out.println("Resultado " + f.getCodigo() + " "+ f.getDescricao()); }
 * }catch (Exception e) { System.out.println("erro ao buscar"); }
 */


	}

}