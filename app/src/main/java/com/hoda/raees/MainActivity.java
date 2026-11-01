package com.hoda.raees;
import android.app.Activity;import android.os.Bundle;import android.webkit.WebView;import android.webkit.WebSettings;import android.webkit.WebViewClient;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b){super.onCreate(b);getWindow().setStatusBarColor(0xff07111f);getWindow().setNavigationBarColor(0xff07111f);
 WebView w=new WebView(this);w.setBackgroundColor(0xff07111f);WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setAllowFileAccess(true);w.setWebViewClient(new WebViewClient());setContentView(w);w.loadUrl("file:///android_asset/index.html");}
 @Override public void onBackPressed(){super.onBackPressed();}
}