import java.util.Scanner;
class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double numero;
    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.print ("escolha um número: ");
    numero = teclado.nextDouble();
    // passo 3: exibir resposta
    System.out.println("o numero informado foi: " + numero);
  }
}