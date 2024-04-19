package cz.kousalik.app

import cz.kousalik.components.calc.Calculator
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class SpringDiApp(
    private val calculator: Calculator,
    private val random: Random // singleton instance, same as the one injected into the calculator
) {

    fun runSomethingCool() {
        while (true) {
            println("something cool, aye? here is your calculated result: ${calculator.calculate()}, random number is: ${random.nextInt()}, and using other random: ${calculator.calculateUsingOtherRandom()}")
            Thread.sleep(1000)
        }
    }
}