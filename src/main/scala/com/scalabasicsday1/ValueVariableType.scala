package com.scalabasicsday1

object ValueVariableType extends App {

  val x: Int = 155
  println(x)

  // x = 2 // This is illegal since val keyword tells the compiler that x is immutable meaning It's value cannot be changed after declared

  val y = 25

  //here we have not specified the type but the compiler can infer that on Its own, when It sees the value the type is assigned automatically.
  //For Eg.

  val aString = "this is a string"

  //Types definition is not necessary

  //STRING
  val aStringName: String="Shubham Bagrodia"

  //The String can be appended like shown below:
  val aStringExample= "Value" + "is: "

  println(aString + " " +aStringExample + " " +x)

  //Strings can be Interpolated: Here If we start the quote with an s we can embed another value inside with the $.

  val aInterpolatedString = s"This is an Interpolated String $aStringName"

  val aBoolean: Boolean= true // Boolean types has only two values that are keywords true and false

  val aChar: Char= 'a' //Character should be enclosed in the single quotes . There should be only one character or it will say to convert it into the symbol

  val SDouble: Double=3.2

  val aFloat: Float= 4.1f

  val aLong: Long= 234567890 // Long Int have double the bytes of normal int

  val aShort: Short=12 // Short Int have half the bytes of normal int

}
