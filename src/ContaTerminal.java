import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta:");
        int numConta = Integer.parseInt(scanner.next());

        System.out.println("Agora, digite o número da agência:");
        String numAgencia = scanner.next();

        System.out.println("Digite seu nome, por favor:");
        String nomeUsuario = scanner.next();

        System.out.println("Por favor, agora digite o saldo da conta");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + ", conta " + numConta + " 1021e seu saldo de R$" + saldoConta + " já está disponível para saque");
        
        scanner.close();
    }
}
