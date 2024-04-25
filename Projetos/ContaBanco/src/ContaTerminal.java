import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // consome a nova linha

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        double saldo = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                System.out.println("Por favor, digite o saldo:");
                String saldoStr = scanner.nextLine();
                saldoStr = saldoStr.replace(',', '.'); // substitui a vírgula por um ponto
                NumberFormat format = NumberFormat.getInstance(Locale.US);
                Number number = format.parse(saldoStr);
                saldo = number.doubleValue();
                isValid = true;
            } catch (ParseException e) {
                System.out.println("Por favor, insira um número válido para o saldo.");
            }
        }

        DecimalFormat df = new DecimalFormat("#.00"); // formata o saldo como um número decimal
        String saldoFormatado = df.format(saldo);

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldoFormatado + " já está disponível para saque.";
        System.out.println(mensagem);
    }
}