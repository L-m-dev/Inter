package Main;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		
		//test
		@SuppressWarnings("deprecation")
		Date dateStart = new Date(2023,01,12);
		@SuppressWarnings("deprecation")
		Date dateEnd = new Date(2023,01,20);
		
		Bootcamp bancoInter = new Bootcamp("Banco Inter",
				"Moeda, crédito, capitais e câmbio",
				dateStart, dateEnd);
		
 		
		Developer developer1 = new Developer("Juliana");
		Developer developer2 = new Developer("David");
		
		Curso curso1 = new Curso("Algebra Linear", "Aprenda sobre equações lineares.", 80);
		Curso curso2 = new Curso("Matemática Discreta", "Aprenda sobre conjuntos.", 60);
		
		developer1.inscreverBootcamp(curso1);
		developer2.inscreverBootcamp(curso2);
		
		System.out.println("XP registrado: ");
		System.out.println(developer1.nomeXP());
		System.out.println(developer2.nomeXP());
		
		System.out.println("Registro de cursos: ");
		System.out.println(Developer.cursoMap.entrySet());
		
		developer1.progredir();
		developer1.progredir();
		developer1.progredir();
		
		developer2.progredir();
		
		System.out.println(developer1.nomeXP());
		System.out.println(developer2.nomeXP());


	}
}
