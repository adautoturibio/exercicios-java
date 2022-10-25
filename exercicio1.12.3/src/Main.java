import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int aux = 0;
        int c = 0;
        int f = 0;

        System.out.print("====================================================");
        for (f = 50; f<151;){
            
            aux = (f-32)*5/9;
            c = aux;
            System.out.print("\n||  "+f+"° em Farenheit é igual a "+c+"° graus Celsius. ||");
            f++;

        }
        System.out.print("\n====================================================");
    }
}