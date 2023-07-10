object Q4{

    def main(args: Array[String]): Unit = {
        println(isEven(6))
        println(isEven(5))
        println(isOdd(11))
        println(isOdd(2))
    }

    def isEven(n:Int):Boolean = n match {
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n:Int):Boolean = {
        !(isEven(n))
    }
   
}