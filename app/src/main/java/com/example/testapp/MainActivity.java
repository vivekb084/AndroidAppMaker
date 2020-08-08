package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.os.Build;
import android.webkit.WebSettings.PluginState;


import android.os.Bundle;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebView = (WebView) findViewById(R.id.activity_main_webview);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("https://www.onlinemilega.com/");
        mWebView.setWebViewClient(new WebViewClient());

    }

//    private void initWebView() {
//        mWebView = (WebView) findViewById(R.id.webView);
//
//        // WebViewの設定
//        WebSettings settings = mWebView.getSettings();
//        settings.setJavaScriptEnabled(true);
//        settings.setAllowFileAccess(true);
//
//
//        String html = "";
//        html += "<html><body>";
//        html += "<iframe width=\"560\" height=\"315\" src=\"http://www.youtube.com/embed/MU9Srs04sFU?rel=0\" frameborder=\"0\" allowfullscreen></iframe>";
//        html += "</body></html>";
//
//        mWebView.loadData(html, "text/html", null);
//
//    }

}
