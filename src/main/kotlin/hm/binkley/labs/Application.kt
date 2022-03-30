package hm.binkley.labs

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("hm.binkley.labs")
		.start()
}

