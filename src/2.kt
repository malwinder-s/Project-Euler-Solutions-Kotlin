class `2` : Solution() {
    override fun solve() {
        //We first create variables for Fibonacci series
        var first = 0
        var second = 1
        //We will store result here
        var sum = 0
        //We create a loop
        while (first + second < 4000000) {
            val third = first + second
            if (third % 2 == 0) {
                //If the value of variable third is even then we add it to sum
                sum += third
            }
            //We reassign first and second for next fibonacci number
            first = second
            second = third
        }
        println("Sum: $sum")
    }
}