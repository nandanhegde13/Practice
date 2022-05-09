package GFG;

public class TrailingZeroInFact {
    public static void main(String[] args) {
        System.out.println(fact(251));
    }

    public static int fact(int number){
        int fact = 1;
        for(int i=2; i<= number;i++){
            fact = fact*i;
            }
           int count = countZeros(fact);
           return count;
    }

    public static int countZeros(int number){
        int res =0;
        for(int i=5;i<=number;i=i*5){
            res = res+(number/i);
        }
        return res;
    }
}
