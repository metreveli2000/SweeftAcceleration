//N1

//fun isPalindrome(text: String): Boolean {
//
//    return text.equals(text.reversed(), ignoreCase = true)
//
//}

//N2
//
//fun minSplit(amount: Int) : Int {
//    var count = 0
//    var myAmount = amount
//    while(myAmount != 0) {
//        if (myAmount >=50) {
//            count += 1
//            myAmount -= 50
//        } else if (myAmount >= 20 && myAmount < 50) {
//            count += 1
//            myAmount += 20
//        } else if(myAmount >= 10 && myAmount < 20) {
//            count += 1
//            myAmount -= 10
//        } else if(myAmount >= 5 && myAmount < 10) {
//            count += 1
//            myAmount -= 5
//        } else if (myAmount >= 1 && myAmount < 5) {
//            count += 1
//            myAmount -= 1
//        }
//    }
//    return count
//}
//
//
//
//

//N3
//fun notContains(array: Array<Int>) : Int {
//    val myArray = array.sorted()
//    if(myArray[0] > 1) return myArray[0]-1
//    else return 0
//}

//N4
//fun isProperly(sequence: String): Boolean {
//    return when (sequence.length % 2) {
//        0 -> {
//            var resultSequence = sequence
//            while("()" in resultSequence) {
//                resultSequence = resultSequence.replace("()", "")
//            }
//            resultSequence.isEmpty()
//        }
//        else -> false
//    }
//}



//N5
//fun fibonacciNumber(n : Int) : Int {
//    if(n <= 1) {
//        return n
//    } else {
//        return fibonacciNumber(n-1) + fibonacciNumber(n-2)
//    }
//}
//
//fun countVariants(stearsCount: Int) : Int {
//    return fibonacciNumber(stearsCount+1)
//}