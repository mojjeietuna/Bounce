package com.Bounce;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class BounceActivity extends Activity {

	private Game mGame = new Game(this);
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
       
        setContentView(R.layout.main);
        FrameLayout main = (FrameLayout) findViewById(R.id.main_view);
        mGame.CreateObjects(main); 
        mGame.Start();
    }
}