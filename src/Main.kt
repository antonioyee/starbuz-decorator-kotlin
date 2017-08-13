import decorators.Mocha
import decorators.Soy
import decorators.Whip
import framework.Beverage
import framework.DarkRoast
import framework.Expresso
import framework.HouseBlend

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 13/08/17.
 */
fun main(args: Array<String>) {

	val beverage:Beverage = Expresso()

	println("${beverage.description} $ ${beverage.cost()}")

	var beverage2:Beverage = DarkRoast()

	beverage2 = Mocha(beverage2)
	beverage2 = Mocha(beverage2)
	beverage2 = Whip(beverage2)

	println("${beverage2.description} $ ${beverage2.cost()}")

	var beverage3: Beverage = HouseBlend()

	beverage3 = Soy(beverage3)
	beverage3 = Mocha(beverage3)
	beverage3 = Whip(beverage3)

	println("${beverage3.description} $ ${beverage3.cost()}")

}