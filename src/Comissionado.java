/**
 * Representa um funcionário comissionado que recebe comissão sobre vendas.
 * O salário é calculado aplicando um percentual sobre o valor das vendas realizadas.
 * 
 * @author Sistema de Gestão de Funcionários
 * @version 1.0
 */
public class Comissionado extends Funcionario {
    /** Valor total das vendas realizadas pelo funcionário */
    private double valorVendas;
    
    /** Percentual de comissão sobre as vendas (em %) */
    private int percentualComissao; // em %

    /**
     * Construtor da classe Comissionado.
     * 
     * @param valorVendas Valor total das vendas realizadas
     * @param percentualComissao Percentual de comissão (0-100)
     * @param nome Nome completo do funcionário
     * @param cpf CPF do funcionário
     */
    public Comissionado(double valorVendas, int percentualComissao, String nome, String cpf) {
        super(nome, cpf);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }

    /**
     * Define o valor total das vendas.
     * 
     * @param valorVendas Novo valor das vendas
     */
    public void setValorVendas(double valorVendas) { this.valorVendas = valorVendas; }
    
    /**
     * Retorna o valor total das vendas.
     * 
     * @return Valor das vendas
     */
    public double getValorVendas() { return valorVendas; }

    /**
     * Define o percentual de comissão.
     * 
     * @param percentualComissao Novo percentual de comissão (0-100)
     */
    public void setPercentualComissao(int percentualComissao) { this.percentualComissao = percentualComissao; }
    
    /**
     * Retorna o percentual de comissão.
     * 
     * @return Percentual de comissão
     */
    public int getPercentualComissao() { return percentualComissao; }

    /**
     * Calcula o salário do funcionário comissionado.
     * O salário é calculado aplicando o percentual de comissão sobre o valor das vendas.
     * 
     * @return Valor do salário (valorVendas × percentualComissao / 100)
     */
    @Override
    public double calculaSalario() {
        return valorVendas * (percentualComissao / 100.0);
    }

    /**
     * Retorna uma representação em String do funcionário comissionado.
     * 
     * @return String formatada com informações do funcionário
     */
    @Override
    public String toString() {
        return super.toString();
    }
}