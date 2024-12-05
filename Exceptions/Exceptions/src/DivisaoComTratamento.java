import java.util.Scanner;

public class DivisaoComTratamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Insira o primeiro número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Insira o segundo número: ");
            int numero2 = scanner.nextInt();

            int resultado = numero1 / numero2;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida. Por favor, insira um divisor diferente de zero.");
        } catch (Exception e) {
            System.out.println("Erro: Ocorreu um erro inesperado. " + e.getMessage());
        } finally {
            System.out.println("Execução encerrada.");
            scanner.close();
        }
    }
}