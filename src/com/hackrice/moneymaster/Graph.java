package com.HackRice.moneymaster;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Graph extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    	
    	RelativeLayout currentLayout = (RelativeLayout) inflater.inflate(R.layout.graph_view, container, false);
        return inflater.inflate(R.layout.graph_view, container, false);
    }
}