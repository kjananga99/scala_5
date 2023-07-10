object Q1{
    def main(args: Array[String]) = {
        println("Enter an Integer : ")
        val num: Int = scala.io.StdIn.readInt()
        println("is prime : " + prime(num))
    }
    def prime(n: Int, i: Int=2): Boolean = {
        if( n<=1 )
            false
        else if( n == i )
            true
        else if( n%i == 0 )
            false
        else prime(n, i+1);
    }
}