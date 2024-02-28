import java.util.Scanner;

public class EquilibrandoSaldo {
	
	
	   public static void main(String[] args) {
		   
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite o saldo atual");

	        double saldoAtual = scanner.nextDouble();
	        System.out.println("Digite o valor de deposito");
	        double valorDeposito = scanner.nextDouble();
	        System.out.println("Digite o valor de retirada");
	        double valorRetirada = scanner.nextDouble();
	        
	        saldoAtual = saldoAtual + valorDeposito - valorRetirada;
	        
	        System.out.printf("%.1f%n", saldoAtual);
	        
	       
	        

	    
	}
}
