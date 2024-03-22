package array2;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            boolean isPrime= true;

            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                if(n==1){
                    System.out.println("the number is prime nor composite");
                }else{
                    System.out.println("The number is Prime");
                }

            }else{
                System.out.println("The number is composite");
            }
        }
    }

    
}
