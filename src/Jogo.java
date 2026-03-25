import java.util.Scanner; // Importa classe para ler dados do teclado
import java.util.Random;  // Importa classe para gerar números aleatórios

public class Jogo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria leitor de entrada
        Random random = new Random(); // Cria gerador de números aleatórios

        boolean venceu = false; // Controla quando o jogador ganhar

        // Loop que roda até o jogador vencer
        while (!venceu) {

            System.out.println("\nEscolha:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");

            int jogador = scanner.nextInt(); // Lê a escolha do jogador

            int computador = random.nextInt(3) + 1; // Gera número de 1 a 3

            System.out.println("Computador escolheu: " + computador);

            // Verifica empate
            if (jogador == computador) {
                System.out.println("Empate!");

            // Verifica se o jogador ganhou
            } else if ((jogador == 1 && computador == 3)
                    || (jogador == 2 && computador == 1)
                    || (jogador == 3 && computador == 2)) {

                System.out.println("Voce venceu!");
                venceu = true; // Sai do loop quando ganhar

            // Caso contrário, perdeu
            } else {
                System.out.println("Você perdeu! Tente novamente...");
            }
        }

        System.out.println("\nFim do jogo! Parabens!");
    }
}