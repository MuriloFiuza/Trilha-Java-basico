import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência com o dígito!");
        String agencia = sc.next();
        sc.nextLine(); // como o sc.next não consome o ENTER (/n), é necessário adicionar esse passo para não pular o próximo step sem digitar nada.

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o valor do saldo!");
        Double saldo = sc.nextDouble();
        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e saldo " + saldo + " já está disponível para saque.");
    }
}
