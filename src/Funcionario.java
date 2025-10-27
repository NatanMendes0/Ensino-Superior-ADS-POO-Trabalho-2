/**
 * Classe abstrata que representa um funcionário genérico.
 * Serve como classe base para todos os tipos de funcionários (Assalariado, Horista, Comissionado).
 * 
 * @author Sistema de Gestão de Funcionários
 * @version 1.0
 */
public abstract class Funcionario {
    /** Nome do funcionário */
    private String nome;
    
    /** CPF do funcionário no formato XXX.XXX.XXX-XX */
    private String cpf;

    /**
     * Construtor da classe Funcionario.
     * 
     * @param nome Nome completo do funcionário
     * @param cpf CPF do funcionário
     */
    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Define o nome do funcionário.
     * 
     * @param nome Novo nome do funcionário
     */
    public void setNome(String nome) { this.nome = nome; }
    
    /**
     * Retorna o nome do funcionário.
     * 
     * @return Nome do funcionário
     */
    public String getNome() { return nome; }

    /**
     * Define o CPF do funcionário.
     * 
     * @param cpf Novo CPF do funcionário
     */
    public void setCPF(String cpf) { this.cpf = cpf; }
    
    /**
     * Retorna o CPF do funcionário.
     * 
     * @return CPF do funcionário
     */
    public String getCPF() { return cpf; }

    /**
     * Método abstrato para calcular o salário do funcionário.
     * Deve ser implementado por cada tipo específico de funcionário.
     * 
     * @return Valor do salário calculado
     */
    public abstract double calculaSalario();

    /**
     * Retorna uma representação em String do funcionário.
     * Inclui o tipo da classe, nome, CPF e salário calculado.
     * 
     * @return String formatada com informações do funcionário
     */
    @Override
    public String toString() {
        return String.format("%s [nome=%s, cpf=%s, salario=%.2f]",
                this.getClass().getSimpleName(), nome, cpf, calculaSalario());
    }
}