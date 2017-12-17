package com.translator.arturod.mdpmydankapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class
        websecond extends android.app.Fragment implements View.OnClickListener {
    View myView;
    WebView webview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_browsertabbed1 , container, false);
        webview = (WebView) myView.findViewById(R.id.webView);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://www.youtube.com/");
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        FloatingActionButton site1 = (FloatingActionButton) myView.findViewById(R.id.site1 );
        site1.setOnClickListener(this);

        return myView;
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.site1:

                Toast toast= Toast.makeText(getActivity().getApplicationContext(), "opening reddit copy pasta", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CLIP_VERTICAL  | Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
                break;

        }
    }
}
