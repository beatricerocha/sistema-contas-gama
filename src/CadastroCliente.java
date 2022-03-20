
public class CadastroCliente {
	private String agencia, conta, nome, email, telefone;
	private float saldo;
	
	public CadastroCliente(String agencia, String conta, String nome, String email, String telefone, float saldo){
		this.agencia = agencia;
		this.conta = conta;
		this.nome = nome;
		this.email = email; 
		this.telefone = telefone;
		this.saldo = saldo;
	}


	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
