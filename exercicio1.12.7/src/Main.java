import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int turmas=14, alunos, a=0, p=0, as5=0;
        char id;

        for (int i=0; i<turmas; i++) {

            System.out.print("Identificação da turma: ");
            id = reader.next().charAt(0);
            System.out.print("Quantidade de alunos matriculados: ");
            alunos = reader.nextInt();
            System.out.println("");
            
            for (int j=0; j<alunos; j++) {
                System.out.print("Matricula: ");
                int matricula = reader.nextInt();
                System.out.print("[a] Ausente -- [p] Presente   -->");   
                char ch = reader.next().charAt(0);
                
                if (ch=='a'){
                    a++;
                } else if(ch=='p'){
                    p++;
                }
            }

            int total = a+p;
            if (a>(5/100*total)){
                as5++;
            }
            double porcentagem = a*100/total;


            System.out.print("\n----------");
            System.out.println("Turma: "+id);
            System.out.println("Porcentagem de ausência: "+porcentagem);

            total=0;a=0;p=0;
        }

        System.out.println("Quantidade de turmas com >5% de ausência: "+as5);



        reader.close(); 
    }
}       
        
         
          
    