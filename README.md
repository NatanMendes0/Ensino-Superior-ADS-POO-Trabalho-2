# Sistema de Gestão de Funcionários - POO Trabalho 2

## Descrição do Projeto

Este projeto implementa um sistema de gestão de funcionários para uma loja, desenvolvido em Java utilizando conceitos de Programação Orientada a Objetos (POO), incluindo herança, polimorfismo e abstração.

O sistema permite o cadastro e gerenciamento de três tipos diferentes de funcionários:
- **Assalariados**: Funcionários com salário fixo
- **Horistas**: Funcionários pagos por hora trabalhada
- **Comissionados**: Funcionários que recebem comissão sobre vendas

## Estrutura do Projeto

```
.
├── src/                    # Código-fonte Java
│   ├── Funcionario.java    # Classe abstrata base
│   ├── Assalariado.java    # Funcionário com salário fixo
│   ├── Horista.java        # Funcionário pago por hora
│   ├── Comissionado.java   # Funcionário com comissão
│   ├── Loja.java          # Gerenciamento da loja
│   └── Principal.java     # Classe principal (main)
├── bin/                    # Arquivos compilados (.class)
├── Trabalho 2.pdf         # Especificação do trabalho
└── README.md              # Este arquivo
```

## Arquitetura do Sistema

### Hierarquia de Classes

```
Funcionario (abstrata)
├── Assalariado
├── Horista
└── Comissionado
```

### Classes Principais

#### 1. Funcionario (Classe Abstrata)
Classe base para todos os tipos de funcionários.

**Atributos:**
- `nome`: String - Nome do funcionário
- `cpf`: String - CPF do funcionário

**Métodos:**
- `calculaSalario()`: Método abstrato para cálculo do salário
- `toString()`: Retorna representação textual do funcionário

#### 2. Assalariado
Funcionário com salário fixo mensal.

**Atributos:**
- `salario`: double - Salário fixo mensal

**Cálculo do Salário:**
- Retorna o valor do salário fixo

#### 3. Horista
Funcionário pago por horas trabalhadas.

**Atributos:**
- `horasTrabalhadas`: double - Quantidade de horas trabalhadas
- `valorHora`: double - Valor pago por hora

**Cálculo do Salário:**
- Salário = horasTrabalhadas × valorHora

#### 4. Comissionado
Funcionário que recebe comissão sobre vendas.

**Atributos:**
- `valorVendas`: double - Valor total de vendas
- `percentualComissao`: int - Percentual de comissão (em %)

**Cálculo do Salário:**
- Salário = valorVendas × (percentualComissao / 100)

#### 5. Loja
Gerencia a coleção de funcionários e operações relacionadas.

**Funcionalidades:**
- Cadastrar funcionários (Assalariado, Horista, Comissionado)
- Listar todos os funcionários
- Listar funcionários por tipo
- Calcular folha de pagamento total

## Como Compilar

### Requisitos
- Java Development Kit (JDK) 8 ou superior

### Compilação via Linha de Comando

```bash
# Compilar todos os arquivos Java
javac -d bin src/*.java
```

### Compilação via VS Code
O projeto está configurado para usar o VS Code com extensões Java. Basta abrir o projeto no VS Code e a compilação será automática.

## Como Executar

### Via Linha de Comando

```bash
# Execute após compilar
java -cp bin Principal
```

### Via VS Code
1. Abra o arquivo `Principal.java`
2. Clique em "Run" acima do método `main`
3. Ou pressione F5 para executar com debug

## Exemplo de Uso

O arquivo `Principal.java` contém um exemplo completo de uso do sistema:

```java
// Criar instância da loja
Loja loja = new Loja();

// Cadastrar funcionários
loja.cadastrarAssalariado(new Assalariado(3500.00, "Ana", "111.111.111-11"));
loja.cadastrarHorista(new Horista(160, 25.0, "Carla", "333.333.333-33"));
loja.cadastrarComissionado(new Comissionado(50000.0, 5, "Eva", "555.555.555-55"));

// Listar funcionários
loja.listarTodos().forEach(System.out::println);

// Calcular folha de pagamento
double total = loja.calcularFolha();
System.out.printf("Total da folha: R$ %.2f%n", total);
```

## Saída Esperada

```
— Todos —
Assalariado [nome=Ana, cpf=111.111.111-11, salario=3500.00]
Assalariado [nome=Bruno, cpf=222.222.222-22, salario=4200.00]
Horista [nome=Carla, cpf=333.333.333-33, salario=4000.00]
Horista [nome=Diego, cpf=444.444.444-44, salario=3500.00]
Comissionado [nome=Eva, cpf=555.555.555-55, salario=2500.00]
Comissionado [nome=Felipe, cpf=666.666.666-66, salario=3000.00]

— Assalariados —
Assalariado [nome=Ana, cpf=111.111.111-11, salario=3500.00]
Assalariado [nome=Bruno, cpf=222.222.222-22, salario=4200.00]

— Horistas —
Horista [nome=Carla, cpf=333.333.333-33, salario=4000.00]
Horista [nome=Diego, cpf=444.444.444-44, salario=3500.00]

— Comissionados —
Comissionado [nome=Eva, cpf=555.555.555-55, salario=2500.00]
Comissionado [nome=Felipe, cpf=666.666.666-66, salario=3000.00]

Total da folha: R$ 20700.00
```

## Conceitos de POO Implementados

### 1. Abstração
- Classe `Funcionario` é abstrata, definindo o contrato para todas as subclasses
- Método abstrato `calculaSalario()` que deve ser implementado por cada tipo específico

### 2. Herança
- `Assalariado`, `Horista` e `Comissionado` herdam de `Funcionario`
- Reutilização de código (atributos `nome` e `cpf`, métodos getters/setters)

### 3. Polimorfismo
- Método `calculaSalario()` implementado de forma diferente em cada subclasse
- Lista de `Funcionario` na classe `Loja` pode armazenar objetos de qualquer subtipo
- Uso de `instanceof` para verificação de tipos em tempo de execução

### 4. Encapsulamento
- Atributos privados em todas as classes
- Acesso controlado via métodos getters e setters públicos

## Estrutura de Dados

O sistema utiliza `ArrayList<Funcionario>` para armazenar a coleção de funcionários, permitindo:
- Adição dinâmica de funcionários
- Iteração sobre todos os funcionários
- Filtragem por tipo usando `instanceof`

## Autor

Desenvolvido como trabalho acadêmico para a disciplina de Programação Orientada a Objetos (POO) do curso de Análise e Desenvolvimento de Sistemas (ADS).

## Licença

Este projeto é de uso acadêmico.
