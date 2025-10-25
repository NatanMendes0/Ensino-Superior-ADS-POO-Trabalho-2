/**
 * Representa um funcionário assalariado que recebe um salário fixo mensal.
 * 
 * @author Sistema de Gestão de Funcionários
 * @version 1.0
 */
public class Assalariado extends Funcionario {
    /** Salário fixo mensal do funcionário */
    private double salario;

    /**
     * Construtor da classe Assalariado.
     * 
     * @param salario Valor do salário fixo mensal
     * @param nome Nome completo do funcionário
     * @param cpf CPF do funcionário
     */
    public Assalariado(double salario, String nome, String cpf) {
        super(nome, cpf);
        this.salario = salario;
    }

    /**
     * Define o salário do funcionário.
     * 
     * @param salario Novo valor do salário
     */
    public void setSalario(double salario) { this.salario = salario; }
    
    /**
     * Retorna o salário do funcionário.
     * 
     * @return Valor do salário
     */
    public double getSalario() { return salario; }

    /**
     * Calcula o salário do funcionário assalariado.
     * Para assalariados, o salário é o valor fixo definido.
     * 
     * @return Valor do salário fixo
     */
    @Override
    public double calculaSalario() {
        return salario;
    }

    /**
     * Retorna uma representação em String do funcionário assalariado.
     * 
     * @return String formatada com informações do funcionário
     */
    @Override
    public String toString() {
        return super.toString();
    }
}