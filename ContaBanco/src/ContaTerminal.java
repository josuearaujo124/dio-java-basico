import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Olá Seja Bem-Vindo ao Nosso banco,vamos criar uma conta! ");

        System.out.println("Para  iniciarmos digite o numero para sua conta:");
        int numeroDaConta = scanner.nextInt();    
        
        System.out.println("Por favor,digite o número da Agência!");
        String numeroDaAgencia = scanner.next();

        System.out.println("Qual o seu Nome Completo?");
        String nomeCliente = scanner.nextLine();
        String nomeCliente1 = scanner.nextLine();

        System.out.println("Deposite um Valor Inicial");
        Double Saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente1 +",obrigado por criar uma conta em nosso banco,sua agência é "+numeroDaAgencia+" sua conta "+numeroDaConta+" e seu saldo é "+Saldo+ " já está disponível para saque.");
        scanner.close();
    }


}
