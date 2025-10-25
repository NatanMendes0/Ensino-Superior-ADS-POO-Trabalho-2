public class Horista extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora;

    public Horista(double horasTrabalhadas, double valorHora, String nome, String cpf) {
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas; }
    public double getHorasTrabalhadas() { return horasTrabalhadas; }

    public void setValorHora(double valorHora) { this.valorHora = valorHora; }
    public double getValorHora() { return valorHora; }

    @Override
    public double calculaSalario() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}