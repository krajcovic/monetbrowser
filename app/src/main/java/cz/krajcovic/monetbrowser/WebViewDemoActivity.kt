package cz.krajcovic.monetbrowser

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.Toast

class WebViewDemoActivity : AppCompatActivity() {
    val TAG = WebViewDemoActivity::class.simpleName


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_demo)

        val mainWebView: WebView = findViewById (R.id.mainWebView);
        mainWebView.loadUrl("http://www.google.com")

        val mainWebSettings = mainWebView.settings
        mainWebSettings.javaScriptEnabled = true

        mainWebView.addJavascriptInterface(WebAppInterface(this), "Android")

    }

    fun showToast(message: String) {
        this.runOnUiThread({
            Log.i(TAG, "showToast: " + message);

            Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
        })
    }
}
