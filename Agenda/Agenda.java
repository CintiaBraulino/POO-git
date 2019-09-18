import java.util.*;

public class Agenda {
	List<Contato> contatos;
	
	Agenda(){
		this.contatos = new ArrayList<Contato>();
	}
	
	Agenda(Contato contato){
		this.contatos = new ArrayList<Contato>();
		this.contatos.add(contato);
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	@Override
	public String toString(){
		String aux ="";
		for(int i=0; i < this.contatos.size();i++) {
			aux = aux + this.contatos.get(i).toString()+"\n";
		}
		return aux;	
	}
	boolean adicionarContato (Contato contato) {
		if(contato.getNome() != null && !contato.telefones.isEmpty()) {
			this.contatos.add(contato);
			return true;
		}
	return false;
	}
	boolean removerContato (Contato contato) {
		if(contato.getNome() != null && !contato.telefones.isEmpty()) {
			if(contato!=null) {
				this.contatos.remove(contato);
				return true;
			}
		}
	return false;
	}
	
	Contato buscarContato(String nome) {
		for(int i=0; i < this.contatos.size();i++) {
			if (this.contatos.get(i).getNome().equals(nome)) {
				return this.contatos.get(i);
			}
		}
		Contato aux = new Contato(null,null);
		return aux;
	}
	boolean alterarContato(Contato contato, String nome, String email) {
		if(contato.getNome() !=null && contato.getEmail() != null) {
			if(nome != null)
				contato.setNome(nome);
			if (email != null)
				contato.setEmail(email);
			return true;
		}
	return false;
	}

}
