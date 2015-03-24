package com.dnn.zapbuild.designpatterns;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.dnn.zapbuild.designpatterns.decorator.CustomColorShape;
import com.dnn.zapbuild.designpatterns.decorator.models.Circle;
import com.dnn.zapbuild.designpatterns.decorator.models.Shape;
import com.dnn.zapbuild.designpatterns.decorator.factory.ShapeFactory;


public class MainActivity extends ActionBarActivity {

    Shape mShape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Polymorphism
        mShape=new Circle();
        mShape.draw();

        //Factory method usage
        mShape=ShapeFactory.getShape(ShapeFactory.ShapeType.RECTANGLE);
        mShape.draw();

        //Decorator
        mShape=new CustomColorShape(ShapeFactory.getShape(ShapeFactory.ShapeType.RECTANGLE),"Black");
        mShape.draw();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
