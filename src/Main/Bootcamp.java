package Main;

import java.util.Date;

public class Bootcamp {
	Developer developer;
	Mentoria mentoria;
	Curso curso;
	
	
	
	private String nome;
	private String descricao;
	private Date dataFinal;
	private Date dataInicial;
	
	public Bootcamp(String nome, String descricao, Date dataFinal, Date dataInicial) {
		this.nome = nome;
		this.descricao = descricao;
		this.dataFinal = dataFinal;
		this.dataInicial = dataInicial;
	}

 
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}




	 
	

}
