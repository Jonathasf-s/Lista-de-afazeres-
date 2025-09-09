import java.time.LocalDateTime;

public class Tarefa {
    // Contador para IDs
    private static int contador = 0;

    // Atributos principais da entidade
    private final int id;   //Método final para se tornar imutável
    private String titulo;
    private String descricao;
    private boolean situacao;
    private LocalDateTime dataCriacao;

    // Construtor
    public Tarefa(String titulo, String descricao) {
        this.id = contador;
        contador++;
        this.titulo = titulo;
        this.descricao = descricao;
        this.situacao = false; // por padrão, inicia como não concluída
        this.dataCriacao = LocalDateTime.now();
    }


    // Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }


    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    // Método utilitário
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
}
