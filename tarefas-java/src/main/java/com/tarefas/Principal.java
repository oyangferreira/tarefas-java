package main.java.com.tarefas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) { 
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            mostrarMenu();
            int escolha = obterEntradaInt(scanner, "Escolha uma opção: ");

            switch (escolha) {
                case 1:
                    String titulo = obterEntradaString(scanner, "Digite o título da tarefa: ");
                    String descricao = obterEntradaString(scanner, "Digite a descrição da tarefa: ");
                    gerenciador.adicionarTarefa(new Tarefa(titulo, descricao));
                    break;
                case 2:
                    int idParaRemover = obterEntradaInt(scanner, "Digite o ID da tarefa para remover: ");
                    gerenciador.removerTarefa(idParaRemover);
                    break;
                case 3:
                    int idParaCompletar = obterEntradaInt(scanner, "Digite o ID da tarefa para marcar como concluída: ");
                    gerenciador.concluirTarefa(idParaCompletar);
                    break;
                case 4:
                    gerenciador.listarTarefas();
                    break;
                case 0:
                    rodando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("Aplicação Gerenciador de Tarefas");
        System.out.println("1. Adicionar Tarefa");
        System.out.println("2. Remover Tarefa");
        System.out.println("3. Concluir Tarefa");
        System.out.println("4. Listar Tarefas");
        System.out.println("0. Sair");
    }

    private static int obterEntradaInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. " + prompt);
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static String obterEntradaString(Scanner scanner, String prompt) {
        System.out.print(prompt);
        scanner.nextLine(); // consumir nova linha
        return scanner.nextLine();
    }
}
