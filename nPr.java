class Solution {

    static long nPr(long n, long r) {

        return factorial(n) / factorial(n - r);

    }

    

    // Function to calculate factorial of a number

    static long factorial(long n) {

        long fact = 1;

        for (long i = 2; i <= n; i++) {

            fact *= i;

        }

        return fact;

    }

}
