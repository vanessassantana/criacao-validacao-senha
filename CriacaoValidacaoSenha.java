import java.util.Scanner;

public class CriacaoValidacaoSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Crie sua senha: ");
        String senha = scanner.nextLine();

        int tentativas = 0;
        int quantTentativas = 3;

        System.out.println("\nOlá, " + nome + "! Digite sua senha:");

        while (tentativas < quantTentativas) {
            String tentativa = scanner.nextLine();

            if (tentativa.equals(senha)) {
                System.out.println("Senha correta. Acesso liberado! 🔑");
                break;
            } else {
                tentativas++;
                int restantes = quantTentativas - tentativas;

                if (restantes == 0) {
                    System.out.println("Senha incorreta! Acesso bloqueado. 🔒");
                } else {
                    System.out.println("Senha incorreta! Você ainda tem " + restantes + " tentativa" + (restantes > 1 ? "s." : "."));
                }
            }
        }

        scanner.close();
    }
}