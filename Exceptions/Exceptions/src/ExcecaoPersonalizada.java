import java.util.Scanner;

public class ExcecaoPersonalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Insira um número: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                throw new NegativeNumberException("Erro: O número não pode ser negativo.");
            }

            System.out.println("Você inseriu o número: " + numero);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: Ocorreu um erro inesperado. " + e.getMessage());
        } finally {
            System.out.println("Execução encerrada.");
            scanner.close();
        }
    }
}