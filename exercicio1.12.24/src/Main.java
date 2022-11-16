public class Main {
    public static void main(String[] args) {
        
        double n, s=0, q=2.04;
        
        for (int i=1; i<51; i++){
            n=i;
            double aux = Math.pow(2, n)/50;
            s = aux*q;
        }
        System.out.print(s);
    }   
}      

          
    