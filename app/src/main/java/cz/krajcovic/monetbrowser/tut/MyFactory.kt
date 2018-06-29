package cz.krajcovic.monetbrowser.tut

class MyFactory {
    companion object : Factory<MyFactory> {
        override val prop: Int
            get() = 29

        override fun bar() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun create(): MyFactory {
            return MyFactory()
        }
    }
}