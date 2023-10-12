   
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		double saldoConta = 10.00;		


		Scanner usuarioScanner = new Scanner (System.in); 
		System.out.println("Por favor, digite o número do usuario!:");		
		int numeroUsuario = usuarioScanner.nextInt();

		Scanner nomeUsuarioScanner = new Scanner (System.in); 
		System.out.println("Por favor, digite o nome do usuario:");		
		String nomeUsuario = nomeUsuarioScanner.next();

		
		Scanner agenciaScanner = new Scanner (System.in); 
		System.out.println("Por favor, digite o número da agencia!:");		
		String numeroAgencia = agenciaScanner.next();



		Scanner contaScanner = new Scanner (System.in); 
		System.out.println("Por favor, digite o número da Conta!: ");		
	    String numeroConta = contaScanner .next();
		

		System.out.println("Olá "+nomeUsuario+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo "+saldoConta+" já está disponível para saque");		

	}
		

}








