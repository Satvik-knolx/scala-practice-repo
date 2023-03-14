package com.knoldus
case class CalculateElectricityCharge(accountNumber: Int,
                                      accountUserName: String,
                                      address: String,
                                      previousUnit: Int,
                                      currentUnit: Int
                                     ) {

  // Calculate the bill on the basis of number of units consumed considering different price slabs
  private def calculateBill(): Double = {
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

  // Total bill after adding GST to the bill
  def calculateBillAfterGST(): Double = {
    try {
      val gstCharge: Double = 18.0/100.0  //18% of GST Charge
      val gstOnElectricityBill: Double = calculateBill() * gstCharge  //GST charge on bill computation
      calculateBill() + gstOnElectricityBill
    } catch {
      case error: Exception =>
        println("Error occurred while calculating electricity bill: " + error.getMessage)
        0.0
    }
  }
}