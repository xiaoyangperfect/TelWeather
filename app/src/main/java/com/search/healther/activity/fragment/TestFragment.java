package com.search.healther.activity.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.search.healther.R;
import com.search.healther.config.UrlConfig;

/**
 * Created by user on 2015/9/17.
 */
public class TestFragment extends Fragment {
    private WebView webView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test, null);
        webView = (WebView) view.findViewById(R.id.test_webview);
        webView.setWebChromeClient(new WebChromeClient());
        WebSettings settings = webView.getSettings();
        webView.setDrawingCacheEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        webView.loadUrl(UrlConfig.TESTURL);
        return view;
    }
}
