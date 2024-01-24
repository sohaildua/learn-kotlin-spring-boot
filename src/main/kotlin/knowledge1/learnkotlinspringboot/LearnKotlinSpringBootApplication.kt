package knowledge1.learnkotlinspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["knowledge1.learnkotlinspringboot"])
class LearnKotlinSpringBootApplication

fun main(args: Array<String>) {
    runApplication<LearnKotlinSpringBootApplication>(*args)
}
