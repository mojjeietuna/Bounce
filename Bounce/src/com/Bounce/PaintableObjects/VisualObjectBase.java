package com.Bounce.PaintableObjects;

import android.content.Context;
import android.view.View;

public class VisualObjectBase extends View {
	public VisualObjectBase(Context context) {
		super(context);

	}
	public float X;
	public float Y;

	public float dX=0;
	public float dY=0;
}
