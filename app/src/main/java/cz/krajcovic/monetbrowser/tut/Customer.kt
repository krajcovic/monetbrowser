package cz.krajcovic.monetbrowser.tut

import kotlin.properties.Delegates

data class Customer(val name: String, val email: String) {
    val p: String by lazy {
        System.out.println("Prave pocitam promenou p")
        "OK"
    }

    var secondName: String by Delegates.observable("Not filled") {
        property, oldValue, newValue -> println("$property: $oldValue -> $newValue")
    }
}