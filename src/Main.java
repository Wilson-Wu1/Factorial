import java.util.Scanner;

/*Algorithm used to find the largest size n in f(n!), assuming 1 problem takes 1ms to solve. (Ex.f(n) = 1000000 if t=1s*/

public class Main {
    public double calculate(double n) {
        double result = n;
        double i = 2;   // start diving from 2
        while(result>1){

            result = result/i;
            System.out.println(i);
            i++;
            System.out.println(result);

        }
        return i-2;     //We minus by 2, once for the extra i++ after the loop stops and once more to obtain max size of n < 1



    }

    public static void main(String[] args){
        Main number = new Main();
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double finalResult = number.calculate(n);
        System.out.println(finalResult);






    }
}
