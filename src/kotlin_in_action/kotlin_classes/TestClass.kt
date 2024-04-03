package kotlin_in_action.kotlin_classes

class TestClass(val name: String) {
     private lateinit var crossedOut: BooleanArray
     private lateinit var result: IntArray


     fun main(args: Array<String>) {
         val pw= PersonWoman("Lily", 23);
         pw.isMan
     }
     fun generatePrimes(maxValue: Int): IntArray? {
         return if (maxValue < 2) IntArray(0) else {
             uncrossIntegersUpTo(maxValue)
             crossOutMultiples()
             putUncrossedIntegersIntoResult()
             result
         }
     }

     private fun uncrossIntegersUpTo(maxValue: Int) {
         crossedOut = BooleanArray(maxValue + 1)
         for (i in 2 until crossedOut.size) crossedOut[i] = false
     }

     private fun crossOutMultiples() {
         val limit = determineIterationLimit()
         for (i in 2..limit) if (notCrossed(i)) crossOutMultiplesOf(i)

     }

     private fun determineIterationLimit(): Int {
         // Каждое кратное в массиве имеет простой множитель, больший либо равный
         // квадратному корню из размера массива. Следовательно, вычеркивать элементы,
         // кратные числам, превышающих квадратный корень, не нужно.
         val iterationLimit = Math.sqrt(crossedOut.size.toDouble())
         return iterationLimit.toInt()
     }

     private fun crossOutMultiplesOf(i: Int) {
         var multiple = 2 * i
         while (multiple < crossedOut.size) {
             crossedOut[multiple] = true
             multiple += i
         }
     }

     private fun notCrossed(i: Int): Boolean {
         return crossedOut[i] == false
     }

     private fun putUncrossedIntegersIntoResult() {
         result = IntArray(numberOfUncrossedIntegers())
         var j = 0
         var i = 2
         while (i < crossedOut.size) {
             if (notCrossed(i)) result[j++] = i
             i++
         }
     }

     private fun numberOfUncrossedIntegers(): Int {
         var count = 0
         for (i in 2 until crossedOut.size) if (notCrossed(i)) count++
         return count
     }
}