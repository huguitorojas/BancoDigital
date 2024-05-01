
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");



		Banco banco = new Banco();


		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		cc.depositar(100);
		cc.transferir(100, poupanca);

		banco.addConta(cc);
		banco.addConta(poupanca);

		banco.getContas();
		banco.getClientes();



//		cc.imprimirExtrato();
//		poupanca.imprimirExtrato();
	}

}
