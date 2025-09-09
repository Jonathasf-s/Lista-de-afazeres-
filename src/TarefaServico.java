    // Importando o array list para guardar os objetos e um contador para os ID's

    import java.util.ArrayList;

    public class TarefaServico {

        private ArrayList<Tarefa> tarefas = new ArrayList<>();

        // (O contador de IDs automáticos já está na classe Tarefa)


        //Método create

        public void adicionarTarefa(String titulo, String descricao) {
            Tarefa novaTarefa = new Tarefa(titulo, descricao);
            tarefas.add(novaTarefa);
            System.out.println("Tarefa '" + titulo + "' adicionada com sucesso!");
        }

        //Método read

        public void listarTarefas() {
            if (tarefas.isEmpty()) {
                System.out.println("Nenhuma tarefa registrada.");
                return;
            }

            System.out.println("\n===== Lista de Tarefas =====");
            for (Tarefa tarefa : tarefas) {
                String status = tarefa.getSituacao() ? "Concluída" : "Pendente";
                System.out.println("ID: " + tarefa.getId());
                System.out.println("Título: " + tarefa.getTitulo());
                System.out.println("Descrição: " + tarefa.getDescricao());
                System.out.println("Status: " + status);
                System.out.println("Data de Criação: " + tarefa.getDataCriacao());
                System.out.println("---------------------------------");
            }
        }

        //Método update

        public void atualizarTarefa(int id, String novoTitulo, String novaDescricao) {
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getId() == id) {
                    tarefa.setTitulo(novoTitulo);
                    tarefa.setDescricao(novaDescricao);
                    System.out.println("Tarefa com ID " + id + " atualizada com sucesso!");
                    return;
                }
            }
            System.out.println("Tarefa com ID " + id + " não encontrada.");
        }

        //Método delete

        public void removerTarefa(int id) {
            for (int i = 0; i < tarefas.size(); i++) {
                if (tarefas.get(i).getId() == id) {
                    tarefas.remove(i);
                    System.out.println("Tarefa com ID " + id + " removida com sucesso!");
                    return;
                }
            }
            System.out.println("Tarefa com ID " + id + " não encontrada.");
        }
    }