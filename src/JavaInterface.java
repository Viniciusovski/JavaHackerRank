import java.util.*;

interface commonDevison {
    int divisor(int n);


}

class calculator implements commonDevison{
    public int divisor(int n){
        int sum = 0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}

public class JavaInterface {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        commonDevison calculator = new calculator();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(calculator.divisor(n));
    }
}