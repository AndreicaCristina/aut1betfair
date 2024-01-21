package homework1and2;

//2. Display all the prime numbers lower than 1 000 000. Name the class (and java file) PrimeNumbers
public class PrimeNumbers {
    public static void main(String[] args) {
        // Afisam numerele de la 2 la 1000 000
        for (int i = 2; i < 1000000; i ++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number) {
        // Aici verifica daca numarul este prim
        if (number < 2) {
            return false;
        }

        //Aici verifica daca numarul are 2 divizori
        for (int i = 2; i <= Math.sqrt(number); i++) {
    if (number % i == 0) {
        return false;
    }
        }
        return true;
    }
}
