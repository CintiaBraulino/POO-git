
public class Main {
	public static void main(String [ ]args){
		Cliente cl = new Cliente(0, "Cintia");
		Conta c1 = new Conta(123, 100.00, cl);
		System.out.println("Conta: "+c1.getNumero()+"  Nome:"+c1.getCliente().getNome());
		System.out.println("Saldo: "+c1.getSaldo());
		Operacao op_dep = new Operacao("depositar", 0.0);
		Operacao op_sac = new Operacao("sacar", 0.0);
		op_dep.setValor(50.0);
		c1.depositar(op_dep);
		System.out.println("Deposito 1 ---> "+c1.saldo);
		op_dep.setValor(200.0);
		c1.depositar(op_dep);
		System.out.println("Deposito 2 ---> "+c1.saldo);
		op_dep.setValor(1.0);
		c1.depositar(op_dep);
		System.out.println("Deposito 3 ---> "+c1.saldo);
		op_sac.setValor(350.0);
		c1.sacar(op_sac);
		System.out.println("Saque 1 ---> "+c1.saldo);
		op_sac.setValor(10.0);
		c1.sacar(op_sac);
		System.out.println("Saque 2 ---> "+c1.saldo);
	}
}

