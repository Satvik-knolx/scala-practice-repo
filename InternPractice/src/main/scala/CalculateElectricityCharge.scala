case class CalculateElectricityCharge(accountNumber: Int,
                                      accountUserName: String,
                                      address: String,
                                      previousUnit: Int,
                                      currentUnit: Int
                                     ) {

  def calculateBill(): Double = {
    val unitsOfElectricityConsumed: Int = currentUnit - previousUnit
    val slabOneUnit: Int = 250
    val slabTwoUnit: Int = 450
    val slabOneUnitCharge: Double = 5.25
    val slabTwoUnitCharge: Double = 6.75
    val slabThreeUnitCharge: Double = 8.50
    if (0 < unitsOfElectricityConsumed && unitsOfElectricityConsumed <= slabOneUnit)
      unitsOfElectricityConsumed * slabOneUnitCharge
    else if (slabOneUnit < unitsOfElectricityConsumed && unitsOfElectricityConsumed <= slabTwoUnit)
      ((unitsOfElectricityConsumed - slabOneUnit) * slabTwoUnitCharge) + (slabOneUnitCharge * slabOneUnit)
    else if (unitsOfElectricityConsumed > slabTwoUnit)
      ((unitsOfElectricityConsumed - slabTwoUnit) * slabThreeUnitCharge) + ((slabTwoUnit - slabOneUnit) * slabTwoUnitCharge) + (slabOneUnit * slabOneUnitCharge)
    else
      0
  }

  def calculateBillAfterGST(): Double = {
    try {
      val gstCharge: Double = 18.0/100.0
      val gstOnElectricityBill: Double = calculateBill() * gstCharge
      calculateBill() + gstOnElectricityBill
    } catch {
      case error: Exception =>
        println("Error occurred while calculating electricity bill: " + error.getMessage)
        0.0
    }
  }
}