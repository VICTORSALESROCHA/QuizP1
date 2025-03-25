import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;
        String resposta;

        System.out.println(" Quiz de Algoritmos \n");

        // Questão 1
        System.out.println("1. O que é um algoritmo?");
        System.out.println("a) Um tipo de linguagem de programação");
        System.out.println("b) Um software de computador");
        System.out.println("c) Um conjunto finito de passos para resolver um problema");
        System.out.println("d) Um tipo de hardware usado em computadores");
        System.out.println("e) Um sistema operacional");
        System.out.print("Sua resposta: ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("c")){
            pontuacao++;
        }
        System.out.println();

        // Questão 2
        System.out.println("2. Qual estrutura de controle é usada para repetir um bloco de código até uma condição ser atendida?");
        System.out.println("a) Condicional IF");
        System.out.println("b) Comando PRINT");
        System.out.println("c) Laço de repetição WHILE");
        System.out.println("d) Declaração de variável");
        System.out.println("e) Função RETURN");
        System.out.print("Sua resposta: ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("c")){
            pontuacao++;
        }
        System.out.println();

        // Questão 3
        System.out.println("3. Em um algoritmo, o que significa \"variável\"?");
        System.out.println("a) Um valor que nunca muda");
        System.out.println("b) Um espaço na memória que armazena um dado");
        System.out.println("c) Um comando de repetição");
        System.out.println("d) Um operador matemático");
        System.out.println("e) Um tipo de erro no programa");
        System.out.print("Sua resposta: ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("b")){
            pontuacao++;
        }
        System.out.println();

        // Questão 4
        System.out.println("4. Qual das seguintes opções NÃO é um tipo de estrutura de dados?");
        System.out.println("a) Pilha");
        System.out.println("b) Fila");
        System.out.println("c) Lista");
        System.out.println("d) If-Else");
        System.out.println("e) Árvore");
        System.out.print("Sua resposta: ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("d")){
            pontuacao++;
        }
        System.out.println();

        // Questão 5
        System.out.println("5. Qual é a complexidade do algoritmo de busca binária?");
        System.out.println("a) O(n)");
        System.out.println("b) O(log n)");
        System.out.println("c) O(n²)");
        System.out.println("d) O(n log n)");
        System.out.println("e) O(1)");
        System.out.print("Sua resposta: ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("b")){
            pontuacao++;
        }
        System.out.println();

        // Questão 6
        System.out.println("6. O que significa a sigla \"P\" em programação estruturada?");
        System.out.println("a) Python");
        System.out.println("b) Processamento");
        System.out.println("c) Procedural");
        System.out.println("d) Pilha");
        System.out.println("e) Prioridade");
        System.out.print("Sua resposta: ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("c")){
            pontuacao++;
        }
        System.out.println();

        // Questão 7
        System.out.println("7. Qual das seguintes opções é um exemplo de estrutura de controle condicional?");
        System.out.println("a) While");
        System.out.println("b) If-Else");
        System.out.println("c) For");
        System.out.println("d) Array");
        System.out.println("e) Pilha");
        System.out.print("Sua resposta: ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("b")){
            pontuacao++;
        }
        System.out.println();

        // Questão 8
        System.out.println("8. Qual das seguintes opções NÃO é uma característica de um algoritmo eficiente?");
        System.out.println("a) Claridade");
        System.out.println("b) Eficiência");
        System.out.println("c) Redundância");
        System.out.println("d) Correção");
        System.out.println("e) Finitude");
        System.out.print("Sua resposta: ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("c")){
            pontuacao++;
        }
        System.out.println();

        // Questão 9
        System.out.println("9. Em um algoritmo de ordenação, qual das opções a seguir representa um algoritmo de ordenação por comparação?");
        System.out.println("a) Radix Sort");
        System.out.println("b) Bucket Sort");
        System.out.println("c) Quick Sort");
        System.out.println("d) Counting Sort");
        System.out.println("e) Algoritmo de Dijkstra");
        System.out.print("Sua resposta: ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("c")){
            pontuacao++;
        }
        System.out.println();

        // Questão 10
        System.out.println("10. Qual é a principal função da estrutura de repetição \"for\"?");
        System.out.println("a) Criar funções");
        System.out.println("b) Declarar variáveis");
        System.out.println("c) Executar um bloco de código um número fixo de vezes");
        System.out.println("d) Comparar dois valores");
        System.out.println("e) Interromper a execução do programa");
        System.out.print("Sua resposta: ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("c")){
            pontuacao++;
        }
        System.out.println();

        // Questão 11
        System.out.println("11. O que caracteriza um algoritmo guloso?");
        System.out.println("a) Resolve problemas dividindo-os em subproblemas");
        System.out.println("b) Sempre escolhe a melhor opção no momento");
        System.out.println("c) Precisa conhecer todas as respostas antes de decidir");
        System.out.println("d) Utiliza uma abordagem de tentativa e erro");
        System.out.println("e) Sempre retorna a solução ótima");
        System.out.print("Sua resposta: ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("b")){
            pontuacao++;
        }
        System.out.println();

        // Questão 12
        System.out.println("12. O que acontece quando um algoritmo entra em um loop infinito?");
        System.out.println("a) Ele termina rapidamente");
        System.out.println("b) Ele executa indefinidamente sem parar");
        System.out.println("c) Ele se torna mais eficiente");
        System.out.println("d) Ele melhora a velocidade de processamento");
        System.out.println("e) Ele economiza memória");
        System.out.print("Sua resposta: ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("b")){
            pontuacao++;
        }
        System.out.println();

        // Questão 13
        System.out.println("13. Qual das seguintes estruturas de dados segue o princípio FIFO (First In, First Out)?");
        System.out.println("a) Pilha");
        System.out.println("b) Lista encadeada");
        System.out.println("c) Fila");
        System.out.println("d) Árvore binária");
        System.out.println("e) Heap");
        System.out.print("Sua resposta: ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("c")){
            pontuacao++;
        }
        System.out.println();

        // Questão 14
        System.out.println("14. Em um algoritmo de busca linear, qual é o pior caso para encontrar um elemento?");
        System.out.println("a) O primeiro elemento da lista");
        System.out.println("b) O último elemento da lista");
        System.out.println("c) O elemento no meio da lista");
        System.out.println("d) O algoritmo sempre encontra no primeiro passo");
        System.out.println("e) O algoritmo nunca encontra o elemento");
        System.out.print("Sua resposta: ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("b")){
            pontuacao++;
        }
        System.out.println();

        // Questão 15
        System.out.println("15. Qual das alternativas representa um algoritmo de complexidade O(n²)?");
        System.out.println("a) Bubble Sort");
        System.out.println("b) Merge Sort");
        System.out.println("c) Quick Sort");
        System.out.println("d) Busca Binária");
        System.out.println("e) Heap Sort");
        System.out.print("Sua resposta: ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("a")){
            pontuacao++;
        }
        System.out.println();

        System.out.println("Fim do Quiz! Você acertou " + pontuacao + " de 15 questões.");

        scanner.close();
    }
}
