package GFG;

public class GCD {
    public static void main(String[] args) {
        System.out.println(GCD(7,13));
        System.out.println(gcdRecursive(7,13));
    }

    public static int GCD(int num1,int num2) {
        int small = (num1<num2) ? num1: num2;
        int gcd = 0;
        for(int i=1;i<=small;i++){
            if(num1%i==0 && num2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static int gcdRecursive(int a,int b){
        if(b==0){
            return a;
        }
        else {return gcdRecursive(b,a%b);}
    }
}
