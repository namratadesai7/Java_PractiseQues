package array2;

public class palindrome {
    
    public static void main(String[] args) {
        int num=12021; 
        int reverse=0, rem,temp;

        temp=num;
        //loop to find reverse number
        while(temp!=0){

            rem=temp%10;
            reverse=reverse*10+rem;
            temp /=10;
        };

        //palindrome if num and reverse are equal
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
        if(num==reverse){
            System.out.println("It is Plandrom");
        }else{
            System.out.println("not palindrome");
        }
    }
}
