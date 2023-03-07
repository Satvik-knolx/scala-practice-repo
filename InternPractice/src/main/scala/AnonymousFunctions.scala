import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation.ANONYMOUS

object AnonymousFunctions extends App {
  private val doublingValues: Int => Int = (doubledNumber:Int) => doubledNumber * 2

  println(doublingValues(2))
}

