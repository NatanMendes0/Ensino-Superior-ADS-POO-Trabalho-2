public class Principal {
    public static void main(String[] args) {
        Loja loja = new Loja();

        // adiciona dois funcionários de cada tipo
        loja.cadastrarAssalariado(new Assalariado(3500.00, "Ana", "111.111.111-11"));
        loja.cadastrarAssalariado(new Assalariado(4200.00, "Bruno", "222.222.222-22"));

        loja.cadastrarHorista(new Horista(160, 25.0, "Carla", "333.333.333-33")); // 160h * R$25
        loja.cadastrarHorista(new Horista(100, 35.0, "Diego", "444.444.444-44"));

        loja.cadastrarComissionado(new Comissionado(50000.0, 5, "Eva", "555.555.555-55"));  // 5% de 50k
        loja.cadastrarComissionado(new Comissionado(30000.0, 10, "Felipe", "666.666.666-66"));

        // exibe os funcionários cadastrados, por tipos
        System.out.println("— Todos —");
        loja.listarTodos().forEach(System.out::println);

        System.out.println("\n— Assalariados —");
        loja.listarAssalariados().forEach(System.out::println);

        System.out.println("\n— Horistas —");
        loja.listarHoristas().forEach(System.out::println);

        System.out.println("\n— Comissionados —");
        loja.listarComissionados().forEach(System.out::println);

        System.out.printf("%nTotal da folha: R$ %.2f%n", loja.calcularFolha());
    }
}