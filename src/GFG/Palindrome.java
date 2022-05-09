package GFG;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println( palindrome(121) );
    }

    public static boolean palindrome(int number){
        int temp=number;
        int reverse=0;
        while(number>0)
        {

            int digit = number%10;

            number = number/10;
            reverse = reverse*10+digit;
        }


        if(temp==reverse){
            return true;
        }
        else{
            return false;
        }

    }
}
