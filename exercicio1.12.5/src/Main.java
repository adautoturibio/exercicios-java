public class Main {

    public static void main(String[] args) {
        
        int a = 90000000;
        int b = 200000000;
        int ano = 0;
        float tacA = a*3/100;
        float tacB = b*1.5F/100;

        while (a<b) {
            a += tacA;
            b += tacB;
            ano++;
        }

        System.out.println("Total de anos: "+ano);
        System.out.println("Cidade A: "+a);
        System.out.println("Cidade B: "+b);
       
    }
}