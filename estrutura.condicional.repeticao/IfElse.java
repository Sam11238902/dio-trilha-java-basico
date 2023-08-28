
public class IfElse {
	public static void main(String[] args) {
		double saldo = 25.0;
		double valorSolicitado = 17.0;
		if (valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
			System.out.println("Saque efetuado !");
		} else {
			
			System.out.println("Sem saldo suficiente !");

		}
	}
}
