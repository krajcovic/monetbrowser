package cz.krajcovic.monetbrowser.tut

class ReturnsJumps {

    fun labelExample() {
        loop@ for (i in 1..100) {
            for (j in 1..100) {
                if(j == 80) break@loop
            }
        }
    }

    fun anonymousExample() {
        listOf(1,2,3,4,5).forEach(fun(value: Int) {
            if(value == 3) return
            print(value)
        })

        print(" done with annonymous function")
    }

    fun nestedExample() {
        run loop@ {
            listOf(1,2,3,4,5).forEach({
                if(it == 3) return@loop
                print(it)
            })
        }

        print(" done with nested function")
    }
}