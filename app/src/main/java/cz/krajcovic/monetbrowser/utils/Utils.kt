package cz.krajcovic.monetbrowser.utils

class BaseUtils {
    companion object {
        private val TAG: String = BaseUtils::class.simpleName!!

        fun sum(a: Int, b: Int): Int? {
            if(a is Int && b is Int) {
                return a + b
            }

            return null
        }

        fun log(message: String): Unit {
//            Log.i(TAG, message)
//            System.out.println("DEBUG: $TAG: $message")
            println("DEBUG: $TAG: $message")
        }

        fun maxOf(a: Int, b: Int): Int {
            if (a > b) {
                log("$a > $b")
                return a
            } else {
                log("$a < $b")
                return b
            }
        }
    }
}