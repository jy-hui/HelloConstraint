package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.graphics.Color;
import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button bZero;
    private Button bCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        bZero = findViewById(R.id.button_zero);
        bCount = findViewById(R.id.button_count);
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            bZero.setBackgroundColor(Color.MAGENTA);
            if(mCount%2==0)
                bCount.setBackgroundColor(Color.GREEN);
            else
                bCount.setBackgroundColor(Color.RED);
        }
    }
    public void returnZero(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        bZero.setBackgroundColor(0xffaaaaaa);
        bCount.setBackgroundColor(rgb(98,0,238));
    }
}