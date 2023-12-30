package programa;

public class pessoa {
	
	private static int counter = 1;
	
	private String nome; 
	private String cpf; 
	private String email;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public pessoa(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		counter += 1;
	}
	public String getcpf() {
		return cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	
	//método da string
	
	public String toString() {
		return "\nNome: " + this.getNome();
				"\nCPF: " + this.getCPF(); 
				 "\nEMAIL: " + this.getEmail();
	}
	

}
