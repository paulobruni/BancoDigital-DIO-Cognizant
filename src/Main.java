
public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Paulo");
		cliente1.setIdade(30);
		cliente1.setEndereco("Rua Teste, 123");

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Venilton");
		cliente2.setIdade(33);
		cliente2.setEndereco("Rua Teste, 456");

		
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente2);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		System.out.println(cc.toString());
		System.out.println(poupanca.toString());

	}

}
