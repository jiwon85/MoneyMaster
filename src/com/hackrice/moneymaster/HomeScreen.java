package com.hackrice.moneymaster;

import android.view.MotionEvent;
import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData;
import android.graphics.Color;
import android.view.DragEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class HomeScreen extends Activity implements OnDragListener{
	
	ImageButton draggedView;
	ImageButton droppedViewGas;
	ImageButton droppedViewPersonal;
	ImageButton droppedViewLiving;
	ImageButton droppedViewBills;
	ImageButton droppedViewFood;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_screen);
		draggedView = (ImageButton) findViewById(R.id.bigButton);
		draggedView.setBackgroundColor(Color.TRANSPARENT);
		draggedView.setOnDragListener(this);
		draggedView.setOnLongClickListener(new View.OnLongClickListener(){

			@Override
			public boolean onLongClick(View v) {
				ClipData clip = ClipData.newPlainText("text", draggedView.getContentDescription());
				v.startDrag(clip, new DragShadowBuilder(draggedView), null, 0);
				
				return false;
			}
			
		});
		
		
		
		droppedViewFood = (ImageButton) findViewById(R.id.foodButton);
		droppedViewFood.setOnDragListener(new OnDragListener(){

			@Override
			public boolean onDrag(View v, DragEvent event) {
				int actionPerformed = event.getAction();
				if(actionPerformed == DragEvent.ACTION_DRAG_STARTED || actionPerformed == DragEvent.ACTION_DRAG_LOCATION)
					return true;
				else if(actionPerformed == DragEvent.ACTION_DROP){
					//put intent here!! switch views to proper thing
					ClipData.Item clip = event.getClipData().getItemAt(0);
					if(clip == null)
						return false;
					Toast toast = Toast.makeText(getApplicationContext(), "hi", Toast.LENGTH_SHORT);
					toast.show();
					return true;
				}
				return false;	
			}
		});
		
		
		droppedViewGas = (ImageButton) findViewById(R.id.gasButton);
		droppedViewGas.setOnDragListener(new OnDragListener(){

			@Override
			public boolean onDrag(View v, DragEvent event) {
				int actionPerformed = event.getAction();
				if(actionPerformed == DragEvent.ACTION_DRAG_STARTED || actionPerformed == DragEvent.ACTION_DRAG_LOCATION)
					return true;
				else if(actionPerformed == DragEvent.ACTION_DROP){
					//put intent here!! switch views to proper thing
					ClipData.Item clip = event.getClipData().getItemAt(0);
					if(clip == null)
						return false;
					Toast toast = Toast.makeText(getApplicationContext(), "hi", Toast.LENGTH_SHORT);
					toast.show();
					return true;
				}
				return false;	
			}
		});
		
		droppedViewBills = (ImageButton) findViewById(R.id.billsButton);
		droppedViewBills.setOnDragListener(new OnDragListener(){

			@Override
			public boolean onDrag(View v, DragEvent event) {
				int actionPerformed = event.getAction();
				if(actionPerformed == DragEvent.ACTION_DRAG_STARTED || actionPerformed == DragEvent.ACTION_DRAG_LOCATION)
					return true;
				else if(actionPerformed == DragEvent.ACTION_DROP){
					//put intent here!! switch views to proper thing
					ClipData.Item clip = event.getClipData().getItemAt(0);
					if(clip == null)
						return false;
					Toast toast = Toast.makeText(getApplicationContext(), "hi", Toast.LENGTH_SHORT);
					toast.show();
					return true;
				}
				return false;	
			}
		});
		
		droppedViewLiving = (ImageButton) findViewById(R.id.livingButton);
		droppedViewLiving.setOnDragListener(new OnDragListener(){

			@Override
			public boolean onDrag(View v, DragEvent event) {
				int actionPerformed = event.getAction();
				if(actionPerformed == DragEvent.ACTION_DRAG_STARTED || actionPerformed == DragEvent.ACTION_DRAG_LOCATION)
					return true;
				else if(actionPerformed == DragEvent.ACTION_DROP){
					//put intent here!! switch views to proper thing
					ClipData.Item clip = event.getClipData().getItemAt(0);
					if(clip == null)
						return false;
					Toast toast = Toast.makeText(getApplicationContext(), "hi", Toast.LENGTH_SHORT);
					toast.show();
					return true;
				}
				return false;	
			}
		});
		
		droppedViewPersonal = (ImageButton) findViewById(R.id.personalButton);
		droppedViewPersonal.setOnDragListener(new OnDragListener(){

			@Override
			public boolean onDrag(View v, DragEvent event) {
				int actionPerformed = event.getAction();
				if(actionPerformed == DragEvent.ACTION_DRAG_STARTED || actionPerformed == DragEvent.ACTION_DRAG_LOCATION)
					return true;
				else if(actionPerformed == DragEvent.ACTION_DROP){
					//put intent here!! switch views to proper thing
					ClipData.Item clip = event.getClipData().getItemAt(0);
					if(clip == null)
						return false;
					Toast toast = Toast.makeText(getApplicationContext(), "hi", Toast.LENGTH_SHORT);
					toast.show();
					return true;
				}
				return false;	
			}
		});
		
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_screen, menu);
		return true;
	}

	@Override
	public boolean onDrag(View v, DragEvent event) {
		int actionPerformed = event.getAction();
		if(actionPerformed == DragEvent.ACTION_DRAG_STARTED){
			draggedView.setVisibility(View.INVISIBLE);
			return true;
		}
			
		else if(actionPerformed == DragEvent.ACTION_DRAG_LOCATION || actionPerformed == DragEvent.ACTION_DRAG_ENTERED)
			return true;
		else if(actionPerformed == DragEvent.ACTION_DROP){
			v.invalidate();
			return true;	
		}
		draggedView.setVisibility(View.VISIBLE);
		return false;	
	}

}
