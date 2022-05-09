package GFG;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factIter(3));
        System.out.println((factRecursive(3)));
    }

    public static int factIter(int number){
        int fact=1;
        for(int i=2;i<=number;i++){
            fact=fact*i;

        }
        return fact;
    }

    public static int factRecursive(int number){
        if(number==0)
            return 1;

        return number*factRecursive(number-1);

    }
}
