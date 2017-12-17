package com.translator.arturod.mdpmydankapp;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class
        MainFragment extends android.app.Fragment implements View.OnClickListener{
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentManager fragmentManager = getFragmentManager();
        myView = inflater.inflate(R.layout.fragment_main2    , container, false);
        FloatingActionButton copyf = (FloatingActionButton) myView.findViewById(R.id.copyf);
        copyf.setOnClickListener(this);
        FloatingActionButton sharef = (FloatingActionButton) myView.findViewById(R.id.sharef);
        sharef.setOnClickListener(this);


        return myView;
    }
    public FloatingActionButton  copyf;
    public FloatingActionButton  sharef;
    @Override
    public void onClick(View v) {
        String sharetheapp = getString(R.string.shareapp   );
        switch (v.getId()) {
            case R.id.copyf :
                Toast toast= Toast.makeText(getActivity().getApplicationContext(), "opening browser", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CLIP_VERTICAL  | Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
                webview   fragment = new webview();
                FragmentTransaction fragmentTransaction  = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.sharef:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, sharetheapp );
                sendIntent.setType("text/plain");
                startActivity(sendIntent.createChooser(sendIntent, "Share this dank ass app:"));
                Toast stoast1= Toast.makeText(getActivity().getApplicationContext(), "share opening", Toast.LENGTH_SHORT);
                stoast1.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 0);
                stoast1.show();
                break;

        }}}
