public class Cliente {

    private String nome;
    private String Cpf;
    private int idade;
    // vejamos se vai
    void Mensagem(){
        System.out.println("escreva seu objetivo");
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public int getIdade() {
        return idade;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public Cliente(String nome, String cpf, int idade) {
        this.nome = nome;
        Cpf = cpf;
        this.idade = idade;
    }
}
