package Main;

import java.util.Date;

public class Mentoria {
	private String titulo;
	private String descricao;
	private Date data;
	private Developer developer;
	
	
	
	public Mentoria(String titulo, String descricao, Date data) {
 		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
	}

	public void addXP(Developer developer) {
		 double xp = this.developer.getTotalXP();
		this.developer.setTotalXP(xp + 100);
		System.out.println("variavel local" + xp );
	}
	
	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}





	public String getDescricao() {
		return descricao;
	}





	public void setDescricao(String descricao) {	this.descricao = descricao;	}


	public Date getData() {		return data;	}


	public void setData(Date data) {		this.data = data;	}





	
}
