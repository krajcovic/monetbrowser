package cz.krajcovic.monetbrowser

import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

class WebAppInterface(context: Context) {
    /*
    Instantiate the interface and set the context
     */
    val context = context

    /*
    Show a toast from the web page
     */
    @JavascriptInterface
    public fun showToast(message : String) : Unit {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}
