import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
		
		double area, pi, raio;
    System.out.println("Qual o valor do Raio?");
    raio = ler.nextFloat();
    
    pi= 3.1415;
    area= pi * (raio * raio);
    System.out.println ("A area é: " + area);
    

    

    
    
    
  }
}
