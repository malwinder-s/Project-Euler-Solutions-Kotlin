class Assignment : Solution() {
    override fun solve() {
        val arr = arrayOf(1, 5, 7, 2, 1, 5, 7, 1)

        for (i in 0 .. arr.lastIndex) {
            var repeatCount = 0
            for (j in 0 .. arr.lastIndex) {
                if (i != j && arr[i] == arr[j]) {
                    repeatCount++
                    continue
                }

                if (repeatCount == 0 && j == arr.lastIndex) {
                    println("${arr[i]}")
                }
            }
        }
    }
}