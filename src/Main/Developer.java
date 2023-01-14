package Main;

import java.util.HashMap;

public class Developer {

	private String nome;
	Mentoria mentoria;
	String curso = cursoMap.get(nome);
	private double totalXP;
	
	
	public static HashMap<String, String> cursoMap = new HashMap<>();
	
	
	public Developer(String nome) {
		this.nome = nome;
		this.totalXP = 0;
	}
	
	public Developer(String nome, double totalXP) {
		this.nome = nome;
		this.totalXP = totalXP;
	}

	public void inscreverBootcamp(Curso curso) {
		cursoMap.put(this.nome, curso.getTitulo());
		
	}
	
	public void progredir() {
		if(cursoMap.containsKey(this.getNome())) {
			this.setTotalXP(this.getTotalXP() + 100);
		}
			
 			
 		
	}
	
	public double calcularXPTotal() {
		return totalXP;
	}
	
	public HashMap verCursos() {
		return cursoMap;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTotalXP() {
		return totalXP;
	}

	public void setTotalXP(double totalXP) {
		this.totalXP = totalXP;
	}
	
	public String nomeXP() {
		return this.getNome()+" "+this.getTotalXP();
	}
	
		
		
}
