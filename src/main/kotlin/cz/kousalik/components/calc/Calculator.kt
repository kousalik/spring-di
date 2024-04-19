package cz.kousalik.components.calc

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import kotlin.random.Random

@Component // defining a bean using annotation, there is only one constructor so no need to annotate for injection
class Calculator(
    private val random: Random, //bean name doesn't match, so primary bean will be injected
    @Qualifier("otherRandom") private val otherRandom: Random // qualifier matches the otherRandom factory method name thus the other random will be injected
) {

    fun calculate() = random.nextInt()

    fun calculateUsingOtherRandom() = otherRandom.nextInt()
}