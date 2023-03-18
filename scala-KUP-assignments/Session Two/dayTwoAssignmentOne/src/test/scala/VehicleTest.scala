package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class VehicleTest extends AnyFunSuite {
  test("calling class Car") {
    val carObject = new Car()
    assert(carObject.move == "Car can be driven.")
  }
  test("calling class Boat") {
    val boatObject = new Boat()
    assert(boatObject.move == "Boat can be sailed.")
  }
    test("calling class Aeroplane") {
      val aeroplaneObject = new Aeroplane
      assert(aeroplaneObject.move == "Aeroplane can be flown.")
    }
    test ("calling class FlyingCar") {
      val flyingCarObject = new FlyingCars()
      assert(flyingCarObject.move == "FlyingCars can be flown as well as driven.")
    }
    test ("calling class HoverCraft") {
      val hoverCraft = new HoverCraft
      assert(hoverCraft.move == "HoverCraft can be sailed as well as driven.")
    }

}

