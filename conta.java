package sistema_de_banco;


public class conta {
	String numero;
	String agencia;
	String tipo;
	double saldo;
	double limite;
	
	public conta(String numero, String agencia, String tipo, double saldoInicial, double limite) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.saldo = saldoInicial;
        this.limite = limite;
	}
	
	// Método get
    public String getNumero() {
        return numero;
    }


    public String getAgencia() {
        return agencia;
    }


    public String getTipo() {
        return tipo;
    }


    public double getSaldo() {
        return saldo;
    }


    public double getLimite() {
        return limite;
    }
    
	//função para depositar dinheiro na conta
	public void depositar(double valor) {
		if(valor > 0) {
			saldo = saldo + valor;
			System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
		}else {
			System.out.println("Valor de depósito inválido");
		}
	}
	
	// função para sacar dinheiro da conta
	public void sacar(double valor) {
		if(valor < saldo) {
			saldo = saldo - valor;
			System.out.println("Saque de R$ " + valor + " feito com sucesso.");
		}else if(valor > saldo){
			limite = limite - valor;
			System.out.println("Valor de saque acima do saldo disponível, utilizando limite da conta. Limite atual: " + limite);
		}
	}
	
	//função para consultar o saldo da conta
	public void consultarSaldo() {
		System.out.println("Saldo Atual: R$ " + saldo + ".");
	}
	
	//função para consultar o limite da conta
	public void consultarLimite() {
		System.out.println("Limite Atual: R$ " + limite + ".");
	}
}
