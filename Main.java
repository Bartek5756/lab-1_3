import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner Wczytywanie = new Scanner(System.in);
    int a;
    int b;
    int suma;
    System.out.println("a");
    a=Wczytywanie.nextInt();
    System.out.println("b");
    b=Wczytywanie.nextInt();
    suma=a+b;
    double potega=Math.pow(a,b);
    System.out.println("a+b to:"+suma);
     System.out.println("a*b to:"+potega);
  }
}