package lucas.dev.appestacaohack

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_web)

    loadWebpage()
  }

  fun loadWebpage() {
    webview.clearCache(true);
    webview.clearHistory();
    webview.getSettings().setJavaScriptEnabled(true);
    webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    try {
      val url = "https://frontend-dot-cyberoctools-292101.uc.r.appspot.com/"
      webview.loadUrl(url.toString())
    } catch(e: UnsupportedOperationException) {
      e.printStackTrace()
    }
  }
}