package framework

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 13/08/17.
 */

class Decaf : Beverage() {

	init {
		description = "Decaf Coffee"
	}
	override fun cost(): Double {
		return 1.05
	}

}