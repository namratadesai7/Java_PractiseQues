package array2;

public class hcf {
    public static void main(String[] args) {
        //eucledians formulae

        int num1=48;
        int num2=18;

        int hcf = findHcf(num1,num2);
        System.out.println("HCF of "+num1+" and "+ num2+" is " +hcf);
    }
    public static int findHcf(int a ,int b){
        while(b!=0){
            int temp=b;
             b=a%b;
             a =temp;
        }
        return a;
    }
}
