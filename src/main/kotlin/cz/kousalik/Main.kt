package cz.kousalik

import cz.kousalik.app.SpringDiApp
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import kotlin.random.Random

fun main() {
    // load the whole application context based on the configuration provided, here scanning all classes in cz.kousalik package
    val appContext: ApplicationContext = AnnotationConfigApplicationContext(AppConfig::class.java)

    // get the main app entry point class
    val springApp = appContext.getBean(SpringDiApp::class.java)

    // and run it, everything is wired and ready to go
    springApp.runSomethingCool()
}

@Configuration
@ComponentScan("cz.kousalik")
open class AppConfig {

    @Bean // defining a bean using a factory method (might be more complex)
    @Primary
    open fun randomNumberGenerator() = Random(42)

    @Bean // defining a bean using a factory method (might be more complex)
    open fun otherRandom() = Random(42)
}

