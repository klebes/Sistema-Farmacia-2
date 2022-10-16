package br.com.farmacia.domain;

public class Fornecedor {
private Long codigo;
private String descricao;
// getters e setters
public Long getCodigo() {
	return  this.codigo;
}
public void setCodigo(Long codigo) {
	this.codigo = codigo;
}

public String getDescricao() {
	return this.descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}
@Override
public String toString() {
	String saida = codigo + " - " +  descricao ;
	return saida;
	
}


}
