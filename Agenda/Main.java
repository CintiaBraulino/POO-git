
public class Main {
	public static void main(String []args) {
		Agenda agenda = new Agenda();
		Telefone tel = new Telefone();
		Telefone tel2 = new Telefone();
		Telefone tel3 = new Telefone();

		
		tel.setDdd(85);
		tel.setNumero(997366222);
		
		Contato con1 = new Contato("Meu","cintiabraulino@gmail.com", tel);
		agenda.adicionarContato(con1);
		
		tel2.setDdd(85);
		tel2.setNumero(99936107);
		Contato con2 = new Contato("Pai", "joseosmar@gmail.com", tel2);
		agenda.adicionarContato(con2);
		
		tel3.setDdd(85);
		tel3.setNumero(997018359);
		Contato con3 = new Contato("Mae","mariajose@gmail.com", tel3);
		agenda.adicionarContato(con3);
		
	
		
		System.out.println(agenda.toString());
		
		/*Altera o nome e o email do Contato*/
		agenda.alterarContato(con3, "sinara", "sinarabraulino@gmail.com");
		System.out.println(con3.toString());
		
		/*Remove o Contato*/
		agenda.removerContato(con3);
		System.out.println("\n"+agenda.toString());
		
		/*Buscar o Contato pelo nome*/
		System.out.println("\n"+agenda.buscarContato("Pai").toString());
		
	}

}
