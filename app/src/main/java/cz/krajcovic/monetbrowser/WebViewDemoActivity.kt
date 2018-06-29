package cz.krajcovic.monetbrowser

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// Using Kotlin Android Extensions
// Using R.layout.activity_main from the 'main' source set
import kotlinx.android.synthetic.main.activity_web_view_demo.*

class WebViewDemoActivity : AppCompatActivity() {
    val TAG = WebViewDemoActivity::class.simpleName

    lateinit var mainWebSettings: WebSettings

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_demo)

//        mainWebView = findViewById(R.id.mainWebView);
        //mainWebView.loadUrl("http://www.google.com")

        mainWebSettings = mainWebView.settings
        mainWebSettings.javaScriptEnabled = true
        mainWebSettings.setSupportMultipleWindows(true)

        mainWebView.addJavascriptInterface(WebAppInterface(this), "Android")

//        etUrl = findViewById(R.id.etUrl)

//        val btn: Button = findViewById(R.id.btnGo)
        btnGo.setOnClickListener(
                {
                    mainWebView.loadUrl(etUrl.text.toString())
                }
        )

    }

    fun showToast(message: String) {
        val validMessage = message ?: return

        this.runOnUiThread({
            Log.i(TAG, "showToast: " + validMessage);

            Toast.makeText(this, validMessage, Toast.LENGTH_SHORT).show()
        })
    }
}
