package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.webkit.WebViewAssetLoader;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ASUSME103K extends AppCompatActivity {
    private static final String TAG = "zenpadz10";
    private WebView mWebView;
    //Embeded Youtube Video Address
    private final String VideoEmbededAdress = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/8daoMpdcSco\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>";
    private final String mimeType = "text/html";
    private final String encoding = "UTF-8";//"base64";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asusme103_k);
        mWebView = (WebView) findViewById(R.id.youtubeView);

        WebViewAssetLoader assetLoader = new WebViewAssetLoader.Builder()
                .addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(this))
                .build();

        mWebView.setWebViewClient(new WebViewClient() {
            private WebView view;
            private WebResourceRequest request;

            public WebResourceResponse shouldInterceptRequest(WebView view,
                                                              WebResourceRequest request) {
                Log.d(TAG, "shouldOverrideUrlLoading: Url = [" + request.getUrl()+"]");
                this.view = view;
                this.request = request;
                return assetLoader.shouldInterceptRequest(request.getUrl());
            }

        });

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setAllowContentAccess(true);
        mWebView.getSettings().setAllowFileAccess(true);
        mWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        mWebView.getSettings().setLoadsImagesAutomatically(true);
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl(VideoEmbededAdress);
        mWebView.loadDataWithBaseURL("", VideoEmbededAdress, mimeType, encoding, "");
    }

}
