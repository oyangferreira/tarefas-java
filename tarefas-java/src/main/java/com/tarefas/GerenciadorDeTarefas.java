package main.java.com.tarefas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciadorDeTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso.");
    }

    public void removerTarefa(int id) {
        Iterator<Tarefa> iterator = this.tarefas.iterator();
        while (iterator.hasNext()) {
            Tarefa tarefa = iterator.next();
            if (tarefa.getId() == id) {
                iterator.remove();
                System.out.println("Tarefa removida com sucesso.");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

    public void concluirTarefa(int id) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getId() == id) {
                tarefa.concluir();
                System.out.println("Tarefa marcada como concluída.");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

    public void listarTarefas() {
        if (this.tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa disponível.");
        } else {
            for (Tarefa tarefa : this.tarefas) {
                System.out.println(tarefa);
            }
        }
    }
}
