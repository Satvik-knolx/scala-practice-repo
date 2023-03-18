package com.knoldus

trait Vehicle extends App {
  def move: String
}

trait Flyable extends Vehicle {
  def move: String
}

trait Drivable extends Vehicle {
  def move: String
}
trait Sailable extends Vehicle  {
  def move: String
}

 class Car extends Drivable {
  def move = "Car can be driven."
}

 class Boat extends Sailable {
  def move = "Boat can be sailed."
}

final class Aeroplane extends Flyable {
  def move = "Aeroplane can be flown."
}

final class FlyingCars extends Drivable with Flyable {
  def move = "FlyingCars can be flown as well as driven."
}

final class HoverCraft extends Sailable with Drivable {
  def move = "HoverCraft can be sailed as well as driven."
}
