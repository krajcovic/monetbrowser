package cz.krajcovic.monetbrowser.tut

class MyFactory {
    companion object : Factory<MyFactory> {
        override fun create(): MyFactory {
            return MyFactory()
        }

    }
}