import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int codigo=0, vagas=0, candH=0, candM=0, candTotal=0, percM=0;
        int cod[] = new int[10];
        int cpv[] = new int[10];
        int perc[] = new int[10];

        
        for (int i=0; i<cod.length; i++) {
         
            System.out.print("\nInforme o código do curso: ");
            codigo = reader.nextInt();
            if (codigo==0){
                break;
            }
            cod[i] = codigo;

            System.out.print("Informe o número de vagas: ");
            vagas = reader.nextInt();

            System.out.print("informe a quantidade de candidatos homens: ");
            candH = reader.nextInt();

            System.out.print("Informe a quantidade de canditadas mulheres: ");
            candM = reader.nextInt();

            candTotal += candH + candM;

            perc[i] = (candM*100)/(candH+candM);
            cpv[i] = (candH+candM)/vagas;

        }
            
        for (int i = 0; i < cod.length; i++) {
            if (cod[i]!=0){
                System.out.print("\n-----------------");
                System.out.println("\nCurso: "+cod[i]);
                System.out.println("Candidatos por vagas: "+cpv[i]);
                System.out.println("Canditados do sexo feminino: "+perc[i]+"%");
            }else{}

        }

        int index = 0;
        int max = 0;

        for(int i=0; i<cpv.length; i++){
            if (cpv[i] > max){
                max = cpv[i];
                index = cod[i];
            }
        }

        System.out.println("\nTotal de candidatos: "+candTotal);
        System.out.println("Curso com maior quantidade de canditados por vaga: "+index);
        System.out.println("Canditados por vagas: "+max);
        

    }
}