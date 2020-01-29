package com.popwoot.library.utils;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;


public class ShapeUtils {

    public static ShapeDrawable roundedRectWithColor(int color, float radius) {
        float[] cornerRadius = new float[] {
                radius, radius,
                radius, radius,
                radius, radius,
                radius, radius
        };

        RoundRectShape roundRectShape = new RoundRectShape(cornerRadius, null, null);
        ShapeDrawable shape = new ShapeDrawable();
        shape.getPaint().setColor(color);
        shape.setShape(roundRectShape);
        return shape;
    }
}
