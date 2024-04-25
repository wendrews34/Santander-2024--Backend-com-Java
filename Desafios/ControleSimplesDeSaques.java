import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();

        // Crie um loop 'for' para iterar sobre os saques:
        for (;;) {
            // Solicite ao usuário o valor do saque:
            double valorSaque = scanner.nextDouble();

            // Verifique se o valor do saque é zero, encerrando as transações:
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (valorSaque > limiteDiario) {
                // Se o valor do saque ultrapassar o limite diário
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                // Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
                limiteDiario -= valorSaque;

                // Informe que o saque foi realizado e mostre o limite restante:
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close(); 
    }
}