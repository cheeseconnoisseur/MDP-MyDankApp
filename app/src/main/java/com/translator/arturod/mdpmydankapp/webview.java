package com.translator.arturod.mdpmydankapp;import android.os.Bundle;import android.view.LayoutInflater;import android.view.View;import android.view.ViewGroup;import android.webkit.WebSettings;import android.webkit.WebView;import android.content.ClipData;import android.content.ClipboardManager;import android.content.Context;import android.content.Intent;import android.os.Bundle;import android.support.annotation.Nullable;import android.support.design.widget.FloatingActionButton;import android.support.v4.app.Fragment;import android.view.Gravity;import android.view.LayoutInflater;import android.view.View;import android.view.ViewGroup;import android.webkit.WebViewClient;import android.widget.Toast;import com.translator.arturod.mdpmydankapp.R;import android.app.Activity;import android.os.Bundle;import android.webkit.WebView;/** * A simple {@link Fragment} subclass. */public class        webview extends android.app.Fragment implements View.OnClickListener {    View myView;    WebView webview;    @Nullable    @Override    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {        myView = inflater.inflate(R.layout.fragment_webview, container, false);        webview = (WebView) myView.findViewById(R.id.webView);        webview.setWebViewClient(new WebViewClient());        webview.loadUrl("https://www.youtube.com/");        WebSettings webSettings = webview.getSettings();        webSettings.setJavaScriptEnabled(true);        FloatingActionButton site1 = (FloatingActionButton) myView.findViewById(R.id.site1 );        site1.setOnClickListener(this);        FloatingActionButton site2 = (FloatingActionButton) myView.findViewById(R.id.site2 );        site2.setOnClickListener(this);        return myView;    }    public FloatingActionButton copyf;    public FloatingActionButton sharef;    @Override    public void onClick(View v) {        switch (v.getId()) {            case R.id.site1:                webview = (WebView) myView.findViewById(R.id.webView);                webview .loadUrl("https://www.reddit.com/r/copypasta/");                Toast toast= Toast.makeText(getActivity().getApplicationContext(), "opening reddit copy pasta", Toast.LENGTH_SHORT);                toast.setGravity(Gravity.CLIP_VERTICAL  | Gravity.CENTER_HORIZONTAL, 0, 0);                toast.show();                break;            case R.id.site2 :                webview = (WebView) myView.findViewById(R.id.webView);                webview .loadUrl("http://google.com");                Toast toast1= Toast.makeText(getActivity().getApplicationContext(), "opening google.com", Toast.LENGTH_SHORT);                toast1.setGravity(Gravity.CLIP_VERTICAL  | Gravity.CENTER_HORIZONTAL, 0, 0);                toast1.show();                break;        }    }}