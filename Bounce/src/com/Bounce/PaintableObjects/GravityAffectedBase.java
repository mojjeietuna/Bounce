package com.Bounce.PaintableObjects;

import android.content.Context;

import com.Bounce.Constants;

public abstract class GravityAffectedBase extends VisualObjectBase implements IPaintObject{

	public GravityAffectedBase(Context context) {
		super(context);

	}

	public boolean Tick() {
		
		X += dX;
		Y += dY;
		
		dY += Constants.GRAVITY;
		return doTick();
	}
	
	protected abstract boolean doTick();

}
