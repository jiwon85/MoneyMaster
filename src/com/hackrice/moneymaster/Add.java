package com.HackRice.moneymaster;

import android.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Add extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    	
    	RelativeLayout currentLayout = (RelativeLayout) inflater.inflate(R.layout.add_view, container, false);
    	
    	Button testB = (Button) currentLayout.findViewById(R.id.button1);
    	testB.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

				Toast pieceToast= Toast.makeText(getActivity().getApplicationContext(), "It Works lolz", Toast.LENGTH_SHORT);
				pieceToast.show();		

			}
		});
    	
        return currentLayout;
    }
}