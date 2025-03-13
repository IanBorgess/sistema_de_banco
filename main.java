package sistema_de_banco;


public class main {

	public static void main(String[] args) {
		
		conta Conta = new conta("69876", "6789", "conta-corrente", 1000.00 , 4000.00 );
		
        System.out.println("Conta criada com sucesso!");
        System.out.println("Número da conta: " + Conta.getNumero());
        System.out.println("Agência: " + Conta.getAgencia());
        System.out.println("Tipo: " + Conta.getTipo());
        System.out.println("Saldo inicial: R$ " + Conta.getSaldo());
        System.out.println("Limite: R$ " + Conta.getLimite());

        System.out.println("\nRealizando operações...");

        // Depósito de R$ 500
        Conta.depositar(500.50);
        Conta.consultarSaldo();

        // Saque de R$ 200
        Conta.sacar(200.00);
        Conta.consultarSaldo();

        // Tentativa de saque além do limite
        Conta.sacar(5000.00); // Isso deve falhar
        Conta.consultarSaldo();

        // Consultando o limite
        Conta.consultarLimite();
	}

}
