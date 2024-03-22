package array2;

public class pattern {


    public static void main(String[] args) {
        int n=5;
        int m=5;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        int a=5;
        int b=5;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if(i==1 || i==a || j==1 || j==b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }

        int c=5;
       
        for(int i=1; i<=c; i++){
            for(int j=1; j<=i; j++){
               System.out.print("*");
               
            }
            System.out.println();
        }

        int e=5;
        int f=5;
        for(int i=1; i<=e; i++){
            for(int j=f; j>=i; j--){
               System.out.print("*");
               
            }
            System.out.println();
        }

        int p=5;
        for(int i=1; i<=p; i++){
            for(int j=5; j>i; j--){
              
               System.out.print(" ");
               
            }
            for(int j=1; j<=i; j++){
              
                System.out.print("*");
                
             }

            System.out.println();
        }

        int q=5;
        for(int i=1; i<=q; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        int r=5;
        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }


        int s=5;
        int k=1;
        for(int i=1; i<=s; i++){
            
            for(int j=1; j<=i; j++){
               
                System.out.print(k++);
            }
            System.out.println();
        }

        int t=5;
        int u=1;
        for(int i=1; i<=t; i++){
            
            for(int j=1; j<=i; j++){
               
                System.out.print(u);
            if(u==1){
                u=0;
            }else{
                u=1;
            }
            }
            System.out.println();
        }

        //rhombus
        int v=5;
        for(int i=1; i<=v; i++){
            for(int j=v;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=v;j>=1;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        //print a number pyramid
        

    }
    
    
}
