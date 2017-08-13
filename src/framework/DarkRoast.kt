package framework

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 13/08/17.
 */

class DarkRoast : Beverage() {

	init {
		description = "Dark Roast Coffeee"
	}
	override fun cost(): Double {
		return .99
	}

}