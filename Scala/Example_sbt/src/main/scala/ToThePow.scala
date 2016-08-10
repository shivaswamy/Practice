import scala.language.{implicitConversions, reflectiveCalls}

//implicit def bigIntPow(a: Int) = new {
//  private def toThePow(a: Int, b: Int) : BigInt =
//    b match {
//      case 0 => BigInt(0)
//      case 1 => BigInt(a)
//      case _ =>
//        a match {
//          case 0 => 0
//          case 1 => 1
//          case _ =>
//            var evenPart: BigInt = if((b % 2) == 0) b else b-1
//            var exponent: BigInt = 1
//            var powRes: BigInt = a;
//            while(exponent != evenPart){
//              powRes = powRes * powRes
//              exponent += exponent
//            }
//            if((b % 2) == 0)
//              powRes
//            else
//              powRes * a
//        }
//    }
//  def toThePow(b: Int) : BigInt = { require(b >= 0, "Exponent must be a non-negative integer.")
//    toThePow(a, b)
//  }
//  def ^^(b: Int) : BigInt = toThePow(b)
//}
