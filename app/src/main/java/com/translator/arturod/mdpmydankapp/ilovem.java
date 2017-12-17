package com.translator.arturod.mdpmydankapp;


import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class
        ilovem extends android.app.Fragment implements View.OnClickListener{
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_ilovem    , container, false);
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
        String cP = getString(R.string.ilove );
        switch (v.getId()) {
            case R.id.copyf :
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("label", cP );
                clipboard.setPrimaryClip(clip);
                Toast toast= Toast.makeText(getActivity().getApplicationContext(), "copied to clipboard", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CLIP_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
                break;
            case R.id.sharef:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, cP);
                sendIntent.setType("text/plain");
                startActivity(sendIntent.createChooser(sendIntent, "Share Using:"));
                Toast stoast1= Toast.makeText(getActivity().getApplicationContext(), "share opening", Toast.LENGTH_SHORT);
                stoast1.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 0);
                stoast1.show();
                break;
        }}}
