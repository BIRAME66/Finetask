import java.util.Scanner;

public class Calculatrice {
public int a,b;
public int sum(int x,int y){
int r=x+y;
return r;
}
public int multiply(int x,int y){
    int r=x*y;
return r;
}
public int divide(int x,int y){
    int r=x/y;
    return r;
}
public int soutraction(int x,int y){
    int r=x-y;
    return r;
}
public static void main(String args[]){
    System.out.println(" bienvenue");
    System.out.println("Saisie la valeur de a");
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Saisie la valeur de b");
        b=sc.nextInt();
        Calculatrice c=new Calculatrice();
        int somme=c.sum(a,b);
        int produit=c.multiply(a,b);
        int soustraction=c.soutraction(a,b);
        int division=c.divide(a,b);
        System.out.println("La somme des valeurs = " + somme);
        System.out.println("La Soustraction des valeurs= " + soustraction);
        System.out.println("La multiplication des valeurs=" + produit);
        System.out.println("La division des valeurs = " + division);




    }




}
