package com.ricardogwill.gesturesapp;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gesture();
    }

    private TextView useGestureTextView;
    private GestureDetectorCompat gestureDetect;

    public void gesture() {
        useGestureTextView = findViewById(R.id.use_gestures_textView);
        gestureDetect = new GestureDetectorCompat(this, this);
        gestureDetect.setOnDoubleTapListener(this);

    }

    // The "onTouchEvent" method outline is one of the built in Overridden methods (CTRL+O or under ALT+Insert). Just add "gestureDetect".
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetect.onTouchEvent(event);
        return super.onTouchEvent(event);
    }


    // The method outlines from "onSingleTapConfirmed" down are automatically generated from Alt+Enter after adding the Interfaces. Just add "useGestureTextView".
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        useGestureTextView.setText("onSingleTapConfirmed" +e.toString());
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        useGestureTextView.setText("onDoubleTap" +e.toString());
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        useGestureTextView.setText("onDoubleTapEvent" +e.toString());
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        useGestureTextView.setText("onDown" +e.toString());
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        useGestureTextView.setText("onShowPress" +e.toString());
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        useGestureTextView.setText("onSingleTapUp" +e.toString());
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        useGestureTextView.setText("onScroll" +e1.toString() +e2.toString());
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        useGestureTextView.setText("onLongPress" +e.toString());

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        useGestureTextView.setText("onFling" +e1.toString() +e2.toString());
        return false;
    }
}
