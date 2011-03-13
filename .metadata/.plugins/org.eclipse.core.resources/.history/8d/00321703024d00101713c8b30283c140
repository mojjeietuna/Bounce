package com.Bounce;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.Bounce.PaintableObjects.IPaintObject;
import com.Bounce.PaintableObjects.TestCircle;
import com.Bounce.PaintableObjects.VisualObjectBase;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;

public class Game {
	

	
	public List<IPaintObject> Objects = new ArrayList<IPaintObject>();
	public int TICK_SIZE = 100;
	
	private Handler mHandler = new Handler();
	private final Timer mTimer = new Timer();
	private FrameLayout mView;
	private Context mContext;
	
	
	private Runnable mUpdateTimeTask = new Runnable() {
		   public void run() {
			   		     
			   Tick();
			   mView.invalidate();
		       mHandler.postDelayed(mUpdateTimeTask, 50);
		   }
		};
	
	public Game(Context context)
	{
		mContext = context;
	}	
		
	public void Start(){

		 mHandler.postDelayed(mUpdateTimeTask, 100);

	}
	public void Stop(){
		
	}

	
	public void Tick(){

			List<IPaintObject> ObjectsToDelete = new ArrayList<IPaintObject>();
			for (IPaintObject obj : Objects) {
				if (!obj.Tick()) {
					ObjectsToDelete.add(obj);
				}
			}
			Objects.removeAll(ObjectsToDelete);
	}
	
	public void CreateObjects(FrameLayout view)
	{
		mView = view;
		// Add objects here
		AddObject(new TestCircle(mContext, 200, 50));

	}	
	private void AddObject(IPaintObject object)
	{
		Objects.add(object);
		mView.addView((View)object);
	}
}
