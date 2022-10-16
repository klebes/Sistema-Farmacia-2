package br.com.farmacia.domain;

public class Produto {
private Long codigo;
private String descricao;
private Double valor;
private Long quantidade;
private Fornecedor fornecedor;
//getters e setters
public Long getCodigo() {
	return codigo;
}
public void setCodigo(Long codigo) {
	this.codigo = codigo;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Double getValor() {
	return valor;
}
public void setValor(Double valor) {
	this.valor = valor;
}
public Long getQuantidade() {
	return quantidade;
}
public void setQuantidade(Long quantidade) {
	this.quantidade = quantidade;
}
public Fornecedor getFornecedor() {
	return fornecedor;
}
public void setFornecedor(Fornecedor fornecedor) {
	this.fornecedor = fornecedor;
}

}
