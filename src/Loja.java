import java.util.ArrayList;
import java.util.List;

/**
 * Classe que gerencia os funcionários de uma loja.
 * Permite cadastrar, listar e calcular a folha de pagamento dos funcionários.
 * 
 * @author Sistema de Gestão de Funcionários
 * @version 1.0
 */
public class Loja {
    /** Lista de todos os funcionários da loja */
    private final List<Funcionario> funcionarios = new ArrayList<>();

    /**
     * Cadastra um funcionário assalariado na loja.
     * 
     * @param a Funcionário assalariado a ser cadastrado
     */
    // 1. Cadastrar Assalariado
    public void cadastrarAssalariado(Assalariado a) {
        funcionarios.add(a);
    }

    /**
     * Cadastra um funcionário horista na loja.
     * 
     * @param h Funcionário horista a ser cadastrado
     */
    // 2. Cadastrar Horista
    public void cadastrarHorista(Horista h) {
        funcionarios.add(h);
    }

    /**
     * Cadastra um funcionário comissionado na loja.
     * 
     * @param c Funcionário comissionado a ser cadastrado
     */
    // 3. Cadastrar Comissionado
    public void cadastrarComissionado(Comissionado c) {
        funcionarios.add(c);
    }

    /**
     * Lista todos os funcionários cadastrados na loja.
     * 
     * @return Lista contendo todos os funcionários
     */
    // 4. Listar todos Funcionários
    public List<Funcionario> listarTodos() {
        return new ArrayList<>(funcionarios);
    }

    /**
     * Lista apenas os funcionários assalariados.
     * 
     * @return Lista contendo apenas funcionários assalariados
     */
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

    /**
     * Lista apenas os funcionários horistas.
     * 
     * @return Lista contendo apenas funcionários horistas
     */
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

    /**
     * Lista apenas os funcionários comissionados.
     * 
     * @return Lista contendo apenas funcionários comissionados
     */
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

    /**
     * Calcula o valor total da folha de pagamento.
     * Soma os salários de todos os funcionários cadastrados.
     * 
     * @return Valor total da folha de pagamento
     */
    // 8. Calcular o valor total da folha de pagamento
    public double calcularFolha() {
        double total = 0.0;
        for (Funcionario f : funcionarios) {
            total += f.calculaSalario();
        }
        return total;
    }
}