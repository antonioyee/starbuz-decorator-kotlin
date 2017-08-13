package decorators

import framework.Beverage

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 13/08/17.
 */

class Whip(beverage: Beverage) : CondimentDecorator() {

	internal var beverage: Beverage

	init {
		this.beverage = beverage
	}

	override var description: String = ""
		get() {
			return "${beverage.description}, Whip"
		}

	override fun cost(): Double {
		return .10 + beverage.cost()
	}

}