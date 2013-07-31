package com.hcsn.kidbook.framework;

//import com.phonegap.DroidGap;

import com.hcsn.kidbook.secondgrademath.R;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class BasicWebView2 extends Activity
{
    String launchURL = null;
    WebView mWebView = null;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mWebView = (WebView) findViewById(R.id.webview);
        mWebView.setWebViewClient(new BasicWebViewClient());
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.getSettings().setAppCacheMaxSize(1024*1024*5);
        mWebView.getSettings().setAppCacheEnabled(true);
        
        mWebView.getSettings().setAppCachePath("/data/data/com.hcsn.kidbook.secondgrademath/cache");
        mWebView.getSettings().setAllowFileAccess(true);
        
//        WebView myWebView = (WebView) findViewById(R.id.myWebView);
        mWebView.setBackgroundColor(Color.parseColor("#333333"));
        
        mWebView.loadUrl(launchURL);
    }

    public String getLaunchURL()
    {
        return launchURL;
    }

    public void setLaunchURL(String launchURL)
    {
        this.launchURL = launchURL;
    }
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
            mWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    
    private class BasicWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}


