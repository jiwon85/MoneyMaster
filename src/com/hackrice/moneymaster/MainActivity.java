package com.HackRice.moneymaster;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.app.FragmentManager;
import android.app.LocalActivityManager;
import android.content.Intent;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;



public class MainActivity extends FragmentActivity implements OnClickListener{
	FragmentTabHost mTabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        
        //TAB 1
        
        TabSpec tabAdd= mTabHost.newTabSpec("ADD");
        //Add.setContent(R.id.tab1);
        //Add.setContent(toAdd);
        tabAdd.setIndicator("ADD");
        mTabHost.addTab(tabAdd, Add.class, null);
//        if(mTabHost.getCurrentTabTag().equals("ADD"))
//        	addStuff(mTabHost.getCurrentView());
        
        //TAB 2
        TabSpec List = mTabHost.newTabSpec("List");
        //List.setContent(R.id.tab2);
        List.setIndicator("LIST");
        mTabHost.addTab(List,List.class, null);
        
        
        
        //TAB 3
        TabSpec Graph = mTabHost.newTabSpec("Graph");
        //Graph.setContent(R.id.tab3);
        Graph.setIndicator("GRAPH");
        mTabHost.addTab(Graph,Graph.class, null);
    }
//    public void addStuff(View currentView) {
//    	
//    	
//    	Button newB= (Button) findViewById(R.layout.);
//    	newB.setOnClickListener(new OnClickListener() {
//
//			public void onClick(View v) {
//
//				Toast pieceToast= Toast.makeText(getApplicationContext(), "It Works lolz", Toast.LENGTH_SHORT);
//				pieceToast.show();		
//
//			}
//		});
//    	
//    	
//    	
//    }
                

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
    
    
    
    
    

    
    
    
}
