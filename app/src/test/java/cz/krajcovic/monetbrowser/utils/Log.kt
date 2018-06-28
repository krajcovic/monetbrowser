package cz.krajcovic.monetbrowser.utils

class Log {
    companion object {
        fun d(tag:String, msg:String) :Int {
            System.out.println("DEBUG: $tag: $msg")
            return 0
        }

        fun i(tag:String, msg:String) :Int {
            System.out.println("INFO: $tag: $msg")
            return 0
        }

        fun w(tag:String, msg:String) :Int {
            System.out.println("WARN: $tag: $msg")
            return 0
        }

        fun e(tag:String, msg:String) :Int {
            System.out.println("ERROR: $tag: $msg")
            return 0
        }
    }
}