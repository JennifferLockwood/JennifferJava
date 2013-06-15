// This program finds all of the prime numbers between 1 and 100.

class FindPrimes {
    public static void main(String args []) {
        int valueToCheck;

        for(valueToCheck = 2; valueToCheck <= 100; valueToCheck++) {

            boolean isprime = true;
            int counter;

            for(counter =2; counter < valueToCheck; counter++) {
                if(valueToCheck % counter == 0){
                    isprime = false;
                }
            }

            if(isprime) {
                System.out.println(valueToCheck + " is a prime number.");
            }
        }
    }
}
