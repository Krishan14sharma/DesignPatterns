package com.dnn.zapbuild.designpatterns.decorator.models;

import android.util.Log;

/**
 * Created by zapbuild on 10/12/14.
 */
public class Circle implements Shape {


    @Override
    public void draw() {
        Log.v("SHAPE","CIRCLE");
    }

}
