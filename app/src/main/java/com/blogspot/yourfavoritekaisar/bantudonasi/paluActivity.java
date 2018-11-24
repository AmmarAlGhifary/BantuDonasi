package com.blogspot.yourfavoritekaisar.bantudonasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class paluActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palu);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://kitabisa.com/donasipalusulawesi");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
