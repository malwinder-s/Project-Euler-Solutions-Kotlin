class `4` : Solution() {
    override fun solve() {
        var first = 999
        var second = 999
        var toggle = 1
        while (true) {
            val prod = first * second
            println("Checking for: $first and $second")
            if (isPalindrome(prod)) {
                println("$prod $first $second")
                return
            }
            toggle = if (toggle == 1) {
                first--
                2
            } else {
                second--
                1
            }
        }
    }

    private fun isPalindrome(num: Int) = num.toString() == num.toString().reversed()
}