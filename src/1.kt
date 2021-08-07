class `1` : Solution() {
    override fun solve() {
        //We first initialise variable sum
        var sum = 0
        //We run a loop from 1 to one less than 1000 (999)
        for(i in 1..999) {
            //If i is divisible by 3 or 5 then we add it to variable sum
            if (i%3 == 0 || i%5== 0) {
                println(i)
                sum+=i
            }
        }
        //We print the sum variable
        println(sum)
    }
}