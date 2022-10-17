package br.com.farmacia.bean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.DataModel;
import javax.annotation.PostConstruct;
import br.com.farmacia.dao.FornecedorDao;
import br.com.farmacia.domain.Fornecedor;
//import br.com.farmacia.util.JSFUtil;

@ManagedBean(name = "MBFornecedor")
@ViewScoped
public class FornecedorBean {

	private Fornecedor fornecedor;
	private ArrayList<Fornecedor> itens;
	private ArrayList<Fornecedor> itensFiltrados;

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}

	public ArrayList<Fornecedor> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Fornecedor> itens) {
		this.itens = itens;
	}

	@PostConstruct
	public void prepararListaFornecedor() {
		try {

			FornecedorDao fDao = new FornecedorDao();
			itens = fDao.listar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void prepararNovoFornecedor() {
		fornecedor = new Fornecedor();
	}

	public void novoFornecedor() {
		try {
			FornecedorDao fDao = new FornecedorDao();
			fDao.salvarFonecedor(fornecedor);
			ArrayList<Fornecedor> lista = fDao.listar();
			itens = new ArrayList<Fornecedor>(lista);
			
		} catch (Exception e) {

		}
	}
}
