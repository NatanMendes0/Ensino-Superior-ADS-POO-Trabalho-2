import java.util.ArrayList;
import java.util.List;

public class Loja {
    private final List<Funcionario> funcionarios = new ArrayList<>();

    // 1. Cadastrar Assalariado
    public void cadastrarAssalariado(Assalariado a) {
        funcionarios.add(a);
    }

    // 2. Cadastrar Horista
    public void cadastrarHorista(Horista h) {
        funcionarios.add(h);
    }

    // 3. Cadastrar Comissionado
    public void cadastrarComissionado(Comissionado c) {
        funcionarios.add(c);
    }

    // 4. Listar todos Funcionários
    public List<Funcionario> listarTodos() {
        return new ArrayList<>(funcionarios);
    }

    // 5. Listar Assalariados
    public List<Assalariado> listarAssalariados() {
        List<Assalariado> assalariados = new ArrayList<>();
        for (Funcionario f : funcionarios) {
            if (f instanceof Assalariado) {
                assalariados.add((Assalariado) f);
            }
        }
        return assalariados;
    }

    // 6. Listar Horistas
    public List<Horista> listarHoristas() {
        List<Horista> horistas = new ArrayList<>();
        for (Funcionario f : funcionarios) {
            if (f instanceof Horista) {
                horistas.add((Horista) f);
            }
        }
        return horistas;
    }

    // 7. Listar Comissionados
    public List<Comissionado> listarComissionados() {
        List<Comissionado> comissionados = new ArrayList<>();
        for (Funcionario f : funcionarios) {
            if (f instanceof Comissionado) {
                comissionados.add((Comissionado) f);
            }
        }
        return comissionados;
    }

    // 8. Calcular o valor total da folha de pagamento
    public double calcularFolha() {
        double total = 0.0;
        for (Funcionario f : funcionarios) {
            total += f.calculaSalario();
        }
        return total;
    }
}