import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	private List<Cliente> listaClientes;

	public Banco() {
		contas = new ArrayList<>();
		listaClientes = new ArrayList<>();
	}

	public void addConta(Conta conta){
		contas.add(conta);
	}

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void getContas() {
		for(Conta c: contas){
			c.imprimirExtrato();
		}

	}

	public void getClientes(){
		for(Conta c: contas){
			System.out.println(c.getCliente().getNome());

		}
	}


}
