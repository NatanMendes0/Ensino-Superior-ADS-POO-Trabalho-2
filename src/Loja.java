import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        return funcionarios.stream()
                .filter(f -> f instanceof Assalariado)
                .map(f -> (Assalariado) f)
                .collect(Collectors.toList());
    }

    // 6. Listar Horistas
    public List<Horista> listarHoristas() {
        return funcionarios.stream()
                .filter(f -> f instanceof Horista)
                .map(f -> (Horista) f)
                .collect(Collectors.toList());
    }

    // 7. Listar Comissionados
    public List<Comissionado> listarComissionados() {
        return funcionarios.stream()
                .filter(f -> f instanceof Comissionado)
                .map(f -> (Comissionado) f)
                .collect(Collectors.toList());
    }

    // 8. Calcular o valor total da folha de pagamento
    public double calcularFolha() {
        return funcionarios.stream()
                .mapToDouble(Funcionario::calculaSalario)
                .sum();
    }
}