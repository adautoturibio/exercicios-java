public class Main {
    public static void main(String[] args) {
        
        double s, q=1.5, n=50, a1=1/1; 
        double potencia = Math.pow(q,n);
        
        s = (a1*(potencia-1))/q-1; // FORMULA DE SOMA DOS TERMOS DE UMA PG FINITA

        System.out.println("S = "+s);        
    }   
}      

          
    