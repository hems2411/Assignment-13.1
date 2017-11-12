object GCD
{
    def gcd(a: Int,b: Int): Int = {
       if(b ==0) a else gcd(b, a%b)
    }
     
    def main(args: Array[String]) {
        println("The gcd of a and b is" +gcd(24,48))
        println("The gcd of a and b is" +gcd(30,27))
        println("The gcd of a and b is" +gcd(2,3))
    }
}