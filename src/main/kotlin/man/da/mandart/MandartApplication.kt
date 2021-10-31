package man.da.mandart

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MandartApplication

fun main(args: Array<String>) {
	runApplication<MandartApplication>(*args)
}
