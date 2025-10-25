public class Assalariado extends Funcionario {
    private double salario;

    public Assalariado(double salario, String nome, String cpf) {
        super(nome, cpf);
        this.salario = salario;
    }

    public void setSalario(double salario) { this.salario = salario; }
    public double getSalario() { return salario; }

    @Override
    public double calculaSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}