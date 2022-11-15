import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int pecas, pecasTotal=0;
        double salMin=1200, soma=0;
        ArrayList<Double> salario = new ArrayList<Double>();  
        ArrayList<Integer> num = new ArrayList<Integer>();  

        for (int i=0; i>-1; i++) {
            
            System.out.print("\nInforme o número do operário: ");
            int aux1 = reader.nextInt();
            if (aux1==0){
                break;
            } else{
                num.add(i, aux1);
            }

            System.out.print("Informe o sexo do opeário (m/f): ");
            char sexo = reader.next().charAt(0);

            System.out.print("Informe o número de peças fabricadas: ");
            pecas = reader.nextInt();
            pecasTotal += pecas;


            if (pecas<=30){
                salario.add(i, salMin);
                soma+= salMin;
                
            }
            else if(pecas>=31 && pecas<=35){
                int aux = pecas-30;
                salario.add(i, (((salMin/100)*3)*aux+salMin));
                soma+= ((salMin/100)*3)*aux+salMin;
            }   
            else if(pecas>35){
                int aux = pecas-30;
                salario.add(i, (((salMin/100)*5)*aux+salMin));
                soma+= ((salMin/100)*5)*aux+salMin;
            }  
        }
        System.out.println("\n------------- SALÁRIOS -------------");
        for (int i=0; i<salario.size(); i++){
            
            System.out.println("\nNúmero: "+num.get(i));
            System.out.println("Salário: "+salario.get(i));            
        }
        System.out.println("\n\n===== TOTAL A PAGAR: "+soma);
        System.out.println("===== PEÇAS FABRICADAS: "+pecasTotal);

        double numMaiorSal=0;
        for (int i=0; i<salario.size(); i++){
            if(salario.get(i)>numMaiorSal){
                numMaiorSal = num.get(i);
            }
        }
        System.out.println("===== Número do(a) operário(a) com maior salário: "+(int)numMaiorSal);

        
        
    

        reader.close(); 
        
    }   
}      

          
    