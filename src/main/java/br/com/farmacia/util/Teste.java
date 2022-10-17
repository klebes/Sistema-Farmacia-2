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

f1.setDescricao("descricao2");
fdao.salvarFonecedor(f1);

	
	}

}