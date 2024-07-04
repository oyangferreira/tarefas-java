package main.java.com.tarefas;

public class Tarefa {
    private static int contadorDeId = 1;
    private int id;
    private String titulo;
    private String descricao;
    private boolean concluida;

    public Tarefa(String titulo, String descricao) {
        this.id = contadorDeId++;
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
    }

    public int getId() {
        return id;
    }

    public void concluir() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        return "ID da Tarefa: " + id + "\nTítulo: " + titulo + "\nDescrição: " + descricao + "\nConcluída: " + (concluida ? "Sim" : "Não") + "\n";
    }
}
