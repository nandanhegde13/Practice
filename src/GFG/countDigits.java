package GFG;

public class countDigits {
    public static void main(String[] args) {
        System.out.println(countNormal(45678));
        System.out.println(countRecursive(45678));
        System.out.println(countLog(45678));
    }

    public static int countNormal(int number){
        int count = 0;
        while(number!=0){
            int digit = number%10;
            count++;
            number = number/10;
        }
        return count;
    }

   public static int countRecursive(int number){
        int count = 0;
        if(number == 0){
            return 0;
        }

        return(1+countRecursive(number/10));
   }

    public static int countLog(int number){
        int count = (int)Math.floor(1+Math.log10(number));
        return count;
    }
}
