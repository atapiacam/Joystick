package com.example.atapiacam.joystick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements JoystickView.JoystickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JoystickView joystick = new JoystickView(this);
        setContentView(joystick);
    }


    @Override
    public void onJoystickMoved(float xPercent, float yPercent, int id) {
        Log.d("Main method","X percent: "+xPercent+" Y percent: "+yPercent);
    }
}
