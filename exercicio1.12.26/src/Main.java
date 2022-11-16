public class Main {
    public static void main(String[] args) {
        
        double s=0, a1=37*38/1, a2= (36*37)/2, q=a2/a1;
        
        for (int i=1; i<38; i++){
            s += a1*q;
        }
        System.out.print(s);
    }   
}      

          
    