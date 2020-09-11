
public class apresentar {

	public static void main(String[] args) {
		Empregado e1,e2,e3;
		
		e1 = new Empregado();
		e2 = new Empregado();
		e3 = new Empregado();
		
		e1.nome = "Jão";
		e1.cargo = "Diretor";
		e1.salario = 50000.01;
		
		e2.nome = "Mary";
		e2.cargo = "Supervisora";
		e2.salario = 60000.99;
		
		e3.nome = "Viktor";
		e3.cargo = "CFO";
		e3.salario = 100000.00;
		
		e1.imprimir();
		e2.imprimir();
		e3.imprimir();	

	}

}
