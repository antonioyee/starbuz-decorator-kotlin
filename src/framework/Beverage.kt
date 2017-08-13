package framework

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 13/08/17.
 */

abstract class Beverage {

	open var description = "Unknow Beverage"

	abstract fun cost(): Double

}