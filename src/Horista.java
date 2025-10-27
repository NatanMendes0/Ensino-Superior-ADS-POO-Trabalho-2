/**
 * Representa um funcionário horista que é pago por hora trabalhada.
 * O salário é calculado multiplicando as horas trabalhadas pelo valor da hora.
 * 
 * @author Sistema de Gestão de Funcionários
 * @version 1.0
 */
public class Horista extends Funcionario {
    /** Quantidade de horas trabalhadas no período */
    private double horasTrabalhadas;
    
    /** Valor pago por cada hora trabalhada */
    private double valorHora;

    /**
     * Construtor da classe Horista.
     * 
     * @param horasTrabalhadas Quantidade de horas trabalhadas
     * @param valorHora Valor pago por hora
     * @param nome Nome completo do funcionário
     * @param cpf CPF do funcionário
     */
    public Horista(double horasTrabalhadas, double valorHora, String nome, String cpf) {
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    /**
     * Define a quantidade de horas trabalhadas.
     * 
     * @param horasTrabalhadas Nova quantidade de horas trabalhadas
     */
    public void setHorasTrabalhadas(double horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas; }
    
    /**
     * Retorna a quantidade de horas trabalhadas.
     * 
     * @return Horas trabalhadas
     */
    public double getHorasTrabalhadas() { return horasTrabalhadas; }

    /**
     * Define o valor pago por hora.
     * 
     * @param valorHora Novo valor por hora
     */
    public void setValorHora(double valorHora) { this.valorHora = valorHora; }
    
    /**
     * Retorna o valor pago por hora.
     * 
     * @return Valor por hora
     */
    public double getValorHora() { return valorHora; }

    /**
     * Calcula o salário do funcionário horista.
     * O salário é calculado multiplicando as horas trabalhadas pelo valor da hora.
     * 
     * @return Valor do salário (horasTrabalhadas × valorHora)
     */
    @Override
    public double calculaSalario() {
        return horasTrabalhadas * valorHora;
    }

    /**
     * Retorna uma representação em String do funcionário horista.
     * 
     * @return String formatada com informações do funcionário
     */
    @Override
    public String toString() {
        return super.toString();
    }
}