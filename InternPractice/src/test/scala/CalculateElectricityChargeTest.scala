import org.scalatest.funsuite.AnyFunSuite
class CalculateElectricityChargeTest extends AnyFunSuite {
    test("CalculateElectricityCharge") {
      val testInputsOne = CalculateElectricityCharge(1001, "user1", "Delhi", 5062, 5904)
      assert(testInputsOne.calculateBillAfterGST() === 7073.51)
      val testInputTwo = CalculateElectricityCharge(1001, "user1", "Delhi", 5062, 5062)
      assert(testInputTwo.calculateBillAfterGST() === 0.00)
    }
}
