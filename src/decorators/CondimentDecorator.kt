package decorators

import framework.Beverage

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 13/08/17.
 */
 abstract class CondimentDecorator : Beverage() {

	abstract override var description: String

}