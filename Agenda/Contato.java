import java.util.*;
public class Contato {
	String nome;
	String email;
	List<Telefone> telefones;
	
	Contato(String nome, Telefone telefone){
		this.nome = nome;
		this.telefones = new ArrayList<Telefone>();
		this.telefones.add(telefone);
	}
	Contato(String nome, String email, Telefone telefone){
		this.nome = nome;
		this.email = email;
		this.telefones = new ArrayList<Telefone>();
		this.telefones.add(telefone);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	@Override
	public String toString(){
		return this.nome+" "+this.email+" "+this.telefones.toString();
		
	}
	
	boolean adicionarTelefone(Telefone telefone){
		if (telefone.getDdd()>0 && telefone.getDdd()<=999){
			if(telefone.getNumero()>0){
				this.telefones.add(telefone);
				return true;
			}
		}
		return false;
	}
	

}
