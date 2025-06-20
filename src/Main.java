import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Simulador de Animal de Estimação Virtual!");
        System.out.println("Digite o Nome do seu Animal de Estimação:");
        String nomePet = scanner.nextLine();

        VirtualPet pet = new VirtualPet(nomePet);

        while (true) {
            System.out.println("\nEscolha uma Ação:");
            System.out.println("1. Alimentar " + nomePet);
            System.out.println("2. Brincar com " + nomePet);
            System.out.println("3. Verificar o Status de " + nomePet);
            System.out.println("4. Colocar " + nomePet + " para Dormir");
            System.out.println("5. Cuidar da Higiene de " + nomePet);
            System.out.println("6. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    pet.alimentar();
                    break;
                case 2:
                    pet.brincar();
                    break;
                case 3:
                    pet.verificarStatus();
                    break;
                case 4:
                    pet.descansar();
                    break;
                case 5:
                    pet.higiene();
                    break;
                case 6:
                    System.out.println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!");
                    return;
                default:
                    System.out.println("Escolha Inválida. Por Gentileza, Tente Outra Vez...");
            }

            pet.passarTempo(); // Simula o tempo que passa após cada ação

            if (pet.verificarSaude()) {
                System.out.println("Fim de Jogo!");
                return;
            }

            if (pet.verificarVitoria()) {
                System.out.println("Parabéns! Você Cuidou Muito Bem de Seu Pet e o Ajudou a Alcançar a Velhice Muito Feliz!~");
                return;
            }
        }
    }
}
