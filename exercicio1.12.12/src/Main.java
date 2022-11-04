import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        int n = 100;
        int mat[] = new int[n];
        int n1[] = new int[n];
        int n2[] = new int[n];
        int n3[] = new int[n];
        int nf[] = new int[n];
        int freq[] = new int[n];

        for (int i=0; i<n1.length; i++) {

            System.out.print("\nInforme a matrícula do aluno: ");
            mat[i] = reader.nextInt();

            System.out.print("Informe a primeira nota: ");
            n1[i] = reader.nextInt();
            System.out.print("Informe a segunda nota: ");
            n2[i] = reader.nextInt();
            System.out.print("Informe a terceira nota: ");
            n3[i] = reader.nextInt();

            System.out.print("Informe a frequência do aluno: ");
            freq[i] = reader.nextInt();

            nf[i] = (n1[i]+n2[i]+n3[i])/3;
        
        }

        int arf = 0;
        int rep = 0;
        int media=0, total=0, maior=0, menor=1000;

        for (int i = 0; i < freq.length; i++) {
            System.out.println("\nMatrícula: "+mat[i]);
            System.out.println("Frequência: "+freq[i]);
            System.out.println("Nota Final: "+nf[i]);

            if ((nf[i]>=60) && (freq[i]>=40)){
                System.out.println("APROVADO");
            }
            else{
                System.out.println("REPROVADO");
                rep++;
                if (freq[i]<40){
                    arf++;
                }
            }
        }
        arf = (arf*100)/rep;
        for (int i=0; i<nf.length; i++) {
            total+= nf[i];
            if (nf[i]>maior){
                maior = nf[i];
            }
            if (nf[i]<menor){
                menor = nf[i];
            }
        }
        media = total/n;
        System.out.println("\n-------------------");
        System.out.println("Nota média da turma: "+media);
        System.out.println("A maior nota da turma: "+maior);
        System.out.println("A menor nota da turma: "+menor);
        System.out.println("Alunos reprovados por infrequência: "+arf+"%");

        reader.close();
    }
}