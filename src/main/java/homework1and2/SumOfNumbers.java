package homework1and2;


//1. Calculate the sum of the first 100 numbers higher than 0. Name the class (and java file) SumOfNumbers.

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i ++){
            sum += i ;
        }
        System.out.println("Sum of the first 100 numbers higher than 0 is: "+ sum);
    }
}
