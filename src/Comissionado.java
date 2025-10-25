public class Comissionado extends Funcionario {
    private double valorVendas;
    private int percentualComissao; // em %

    public Comissionado(double valorVendas, int percentualComissao, String nome, String cpf) {
        super(nome, cpf);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }

    public void setValorVendas(double valorVendas) { this.valorVendas = valorVendas; }
    public double getValorVendas() { return valorVendas; }

    public void setPercentualComissao(int percentualComissao) { this.percentualComissao = percentualComissao; }
    public int getPercentualComissao() { return percentualComissao; }

    @Override
    public double calculaSalario() {
        return valorVendas * (percentualComissao / 100.0);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}