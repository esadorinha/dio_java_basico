package pack1;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("\n------ REGISTRO DE CONTA BANCÁRIA ------\n");
		
		System.out.println("Por favor, digite o número da sua conta:");
        int Numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da agência:");
        String Agencia = scanner.next();
        
        System.out.println("Informe seu nome e último sobrenome:");
        String NomeCliente = scanner.next();
        NomeCliente =  NomeCliente + " " + scanner.next();
        
        System.out.println("Informe o saldo atual da conta:");
        double Saldo = scanner.nextDouble();
        String SaldoFormat = String.format("%.2f", Saldo);
        
        String mensagem = "\nOlá " + NomeCliente + 
        				  ", obrigado por criar uma conta em nosso banco, sua agência é " +
        				  Agencia + ", conta " + Numero + " e seu saldo R$" + SaldoFormat + 
        				  " já está disponível para saque!";
        System.out.println(mensagem);
	}
}


