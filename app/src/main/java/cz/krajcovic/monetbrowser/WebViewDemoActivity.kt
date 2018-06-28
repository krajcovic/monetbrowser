package cz.krajcovic.monetbrowser

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class WebViewDemoActivity : AppCompatActivity() {
    val TAG = WebViewDemoActivity::class.simpleName

    lateinit var mainWebView: WebView
    lateinit var mainWebSettings: WebSettings
    lateinit var etUrl: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_demo)

        mainWebView = findViewById(R.id.mainWebView);
        //mainWebView.loadUrl("http://www.google.com")

        mainWebSettings = mainWebView.settings
        mainWebSettings.javaScriptEnabled = true
        mainWebSettings.setSupportMultipleWindows(true)

        mainWebView.addJavascriptInterface(WebAppInterface(this), "Android")

        etUrl = findViewById(R.id.etUrl)

        val btn: Button = findViewById(R.id.btnGo)
        btn.setOnClickListener(
                {
                    mainWebView.loadUrl(etUrl.text.toString())
                }
        )

    }

    fun showToast(message: String) {
        this.runOnUiThread({
            Log.i(TAG, "showToast: " + message);

            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        })
    }
}
