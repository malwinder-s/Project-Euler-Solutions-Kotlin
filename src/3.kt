class `3` : Solution() {
    companion object {
        //We create compile time constant "NUM"
        const val NUM = 600851475143
    }

    override fun solve() {
        //Now, we need not to create loop for more than
        // half of the number. Also, we start with 3
        // since NUM is odd number and take step as 2 since
        //it will never be divisible by 2.
        for (i in 3..NUM / 2 step 2) {
            //We skip for basic numbers 3, 5 and 7
            if (i % 3 == 0L || i % 5 == 0L || i % 7 == 0L) {
                continue
            }
            if (NUM % i == 0L) {
                if (isPrime(i)) {
                    println("\n$i is prime and divides that no.")
                }
            }
        }
    }

    /**
     * If [num] is prime then return true. Return
     * false otherwise.
     */
    private fun isPrime(num: Long): Boolean {
        for (i in 2..num / 2) {
            if (num % i == 0L) {
                return false
            }
        }
        return true
    }
}