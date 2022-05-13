package Gabriel.Kenji.Utiyama;

public class Produto {
	
	private Integer id;
	private String nome;
	private Integer unidadeCompra;
	private String descricao;
	private Double qtdPrevistoMes;
	private Double preMaxComprado;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreMaxComprado() {
		return preMaxComprado;
	}
	
	public void setPreMaxComprado(Double preMaxComprado) {
		this.preMaxComprado = preMaxComprado;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getQtdPrevistoMes() {
		return qtdPrevistoMes;
	}
	
	public void setQtdPrevistoMes(Double qtdPrevistoMes) {
		this.qtdPrevistoMes = qtdPrevistoMes;
	}
	
	public Integer getUnidadeCompra() {
		return unidadeCompra;
	}
	
	public void setUnidadeCompra(Integer unidadeCompra) {
		this.unidadeCompra = unidadeCompra;
	}

	
	
	
}
