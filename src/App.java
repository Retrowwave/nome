// Chamando a biblioteca java.util.Scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    // 1) Escreva um algoritmo para ler um valor (do teclado) e escrever na tela.

    // Cria um objeto da classe Scanner
    Scanner scanner = new Scanner(System.in);
    // Pedir ao usuário que insira o nome
    System.out.println("Digite algo:");
    // O nome vai ser guardado na variável: palavra
    var palavra = scanner.nextLine();
    
    // Imprimir o nome completo
    System.out.println(palavra);

    }
}