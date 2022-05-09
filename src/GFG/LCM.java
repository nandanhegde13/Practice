package GFG;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(4,6));
        System.out.println(lcmoptimized(4,6));
    }

    public static int lcm(int a,int b){
        int res = Math.max(a,b);
        while(true){
            if(res %a == 0 && res%b==0){
                return res;

            }
            else{
                res++;
            }

        }

    }


    public static int lcmoptimized(int a, int b){
        int lcm = (a*b)/GCD.gcdRecursive(a,b);
        return lcm;
    }
}
