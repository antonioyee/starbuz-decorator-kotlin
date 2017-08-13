package framework

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 13/08/17.
 */

class Expresso : Beverage() {

	init {
		description = "Expresso"
	}

	override fun cost(): Double {
		return 1.99
	}

}