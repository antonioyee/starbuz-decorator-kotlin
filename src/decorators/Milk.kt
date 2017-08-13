package decorators

import framework.Beverage

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 13/08/17.
 */

class Milk(beverage: Beverage) : CondimentDecorator() {

	var beverage: Beverage

	init {
		this.beverage = beverage
	}

	override fun getDescripton(): String {
		return "${beverage.description}, Milk"
	}

	override fun cost(): Double {
		return .10 + beverage.cost()
	}

}