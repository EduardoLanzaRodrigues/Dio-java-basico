import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroDaConta = 1021;
        String agencia = "067-8";
        String usuario = "1004";
        String nomeCliente ="Mario Andrade";
        double   saldo = 237.48;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da agência: ");
        scanner.next();
        System.out.println("Usuário: " + usuario);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência  é "+agencia+", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque");


    }
}

