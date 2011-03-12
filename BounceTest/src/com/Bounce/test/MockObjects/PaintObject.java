package com.Bounce.test.MockObjects;

import com.Bounce.PaintableObjects.IPaintObject;

public class PaintObject implements IPaintObject {

	public boolean TickResult = false;
	public int NumberOfTicks = 0;
	
	public boolean Tick() {
	
		NumberOfTicks++;
		return TickResult;
	}

}
