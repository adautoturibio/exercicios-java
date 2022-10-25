import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); //criação do objeto para ler teclado

        double altura;
        char sexo;
        double maior = 0;
        double menor = 99999999;
        double mediaM = 0;
        double somaM = 0;
        int numH = 0;
        int numM = 0;
        
        for(int i=0;i<5;){

            System.out.print("\nInforme o sexo: ");
            sexo = reader.next().charAt(0);

            System.out.print("Informe a altura: ");
            altura = reader.nextDouble();

            if ((sexo == 'm') || (sexo == 'M')){
                numH++;
            }
            if ((sexo == 'f') || (sexo == 'F')){
                numM++;
                somaM += altura;
            }
            
            if (altura > maior){
                maior = altura;
            }
            if (altura < menor){
                menor = altura;
            }
            i ++;
        }
        mediaM = somaM/numM;
        System.out.println("\nA menor altura do grupo é: "+menor);
        System.out.println("A maior altura do grupo é: "+maior);
        System.out.println("A média da altura das mulheres é: "+mediaM);
        System.out.println("O numero de homens nesse grupo é: "+numH);


    }
}