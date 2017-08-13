package framework

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 13/08/17.
 */

class HouseBlend : Beverage() {

	init {
		description = "House Blend Coffee"
	}

	override fun cost(): Double {
		return .89
	}

}