package com.translator.arturod.mdpmydankapp;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
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
        mainbrowser2 extends android.app.Fragment implements View.OnClickListener {
    View myView;
    WebView webview;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_browsertabbed1 , container, false);
        webview = (WebView) myView.findViewById(R.id.webView);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://www.reddit.com/r/dankmemes/");
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        FloatingActionButton back = (FloatingActionButton) myView.findViewById(R.id.back );
        back.setOnClickListener(this);
        FloatingActionButton front = (FloatingActionButton) myView.findViewById(R.id.front );
        front.setOnClickListener(this);

        return myView;
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.front:
                mainbrowser3  fragment = new mainbrowser3() ;
                FragmentTransaction fragmentTransaction  = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.commit();

                Toast toast1= Toast.makeText(getActivity().getApplicationContext(), "opening meme feed", Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.CLIP_VERTICAL  | Gravity.CENTER_HORIZONTAL, 0, 0);
                toast1.show();
                break;
            case R.id.back :
                mainbrowser  fragment1 = new mainbrowser() ;
                FragmentTransaction fragmentTransaction2  = getFragmentManager().beginTransaction();
                fragmentTransaction2.replace(R.id.fragment_container, fragment1);
                fragmentTransaction2.commit();
                Toast toast2= Toast.makeText(getActivity().getApplicationContext(), "opening reddit dank memes", Toast.LENGTH_SHORT);
                toast2.setGravity(Gravity.CLIP_VERTICAL  | Gravity.CENTER_HORIZONTAL, 0, 0);
                toast2.show();
                break;

        }
    }
}

