import java.util.Scanner;

public class Main {
    static Scanner leitorDeTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcaoDoUsuario = 0;
        System.out.println("Bem-vindo à sua Lista de Tarefas Pessoal!");

        while (opcaoDoUsuario != 5) {
            System.out.println("\n--- ToDoList - Menu Principal ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Todas as Tarefas");
            System.out.println("3. Atualizar Tarefa");
            System.out.println("4. Deletar Tarefa");
            System.out.println("5. Marcar Tarefa como Concluída");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcaoDoUsuario = leitorDeTeclado.nextInt();
            leitorDeTeclado.nextLine();

            switch (opcaoDoUsuario) {
                case 1:
                    // Função de adição de tarefa
                    break;
                case 2:
                    // Função de listar tarefas
                    break;
                case 3:
                    // Função de marcar como concluída
                    break;
                case 4:
                    // Função de remover tarefa
                    break;
                case 5:
                    System.out.println("Até a próxima! Mantenha a organização!");
                    break;
                default:
                    System.out.println("Opção inválida, por favor, escolha um número do menu.");
                    break;
            }
        }
    }
}