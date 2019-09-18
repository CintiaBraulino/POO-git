package biblioteca;

public class Livro {
	String titulo;
	String autor;
	String editora;
	int anoPublicacao;
	
	Livro(){
		
	}
	Livro(String titulo, String autor, String editora,int anoPublicacao){
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		
	}
	public void setTitulo(String Titulo) {
		this.titulo = titulo;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String Autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public static void main(String []args) {
		Livro livro1, livro2;
		livro1 = new Livro();
		livro2 = new Livro("use a cabeça-JAVA", "Kathy Sierra", "Alta Books", 2010);
		
		System.out.println("item c :   "+livro1.titulo);
		System.out.println("item d:   "+livro2.titulo);
		System.out.println("item e:   "+livro2.titulo +" " + livro2.autor +" "+ livro2.editora + " "+ livro2.anoPublicacao);
		
		Livro livro3 = new Livro();
		livro2 = livro2;
		System.out.println("item g:   "+livro3.titulo +" " + livro3.autor +" "+ livro3.editora + " "+ livro3.anoPublicacao);
		System.out.println("item g:   "+livro2.titulo +" " +livro2.autor +" "+ livro2.editora + " "+ livro2.anoPublicacao);
		
		livro2 = livro1;
		System.out.println("item h:   "+livro2.titulo +" " + livro2.autor +" "+ livro2.editora + " "+ livro2.anoPublicacao);
	}

}
