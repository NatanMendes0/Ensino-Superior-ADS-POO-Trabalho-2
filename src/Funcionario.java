public abstract class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void setCPF(String cpf) { this.cpf = cpf; }
    public String getCPF() { return cpf; }

    public abstract double calculaSalario();

    @Override
    public String toString() {
        return String.format("%s [nome=%s, cpf=%s, salario=%.2f]",
                this.getClass().getSimpleName(), nome, cpf, calculaSalario());
    }
}