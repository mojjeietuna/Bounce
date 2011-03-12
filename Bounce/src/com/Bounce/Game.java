package com.Bounce;

import android.os.Handler;
import android.os.SystemClock;

public class Game {
	public int TICK_SIZE = 100;
	
	private Handler mHandler = new Handler();
	
	public void Start(){
		 mHandler.postDelayed(mUpdateTimeTask, TICK_SIZE);
	}
	public void Stop(){
		 mHandler.removeCallbacks(mUpdateTimeTask);
	}
	private Runnable mUpdateTimeTask = new Runnable() {
		   public void run() {
		       long time = SystemClock.uptimeMillis();
		       Tick();
		       mHandler.postAtTime(this, time + TICK_SIZE);
		   }
		};
	
	public void Tick(){
		
	}

	

		
}
