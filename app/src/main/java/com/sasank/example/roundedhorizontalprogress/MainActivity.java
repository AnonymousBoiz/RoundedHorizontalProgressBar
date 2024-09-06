package com.sasank.example.roundedhorizontalprogress;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import com.sasank.roundedhorizontalprogress.RoundedHorizontalProgressBar;

import com.sasank.example.roundedhorizontalprogress.R;

public class MainActivity extends AppCompatActivity {

    private RoundedHorizontalProgressBar mRoundedHorizontalProgressBar1;
    private RoundedHorizontalProgressBar mRoundedHorizontalProgressBar2;

    private RoundedHorizontalProgressBar mRoundedHorizontalProgressBar4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRoundedHorizontalProgressBar1 = (RoundedHorizontalProgressBar) findViewById(R.id.progress_bar_1);
        mRoundedHorizontalProgressBar2 = (RoundedHorizontalProgressBar) findViewById(R.id.progress_bar_2);
        mRoundedHorizontalProgressBar4 = (RoundedHorizontalProgressBar) findViewById(R.id.progress_bar_4);

        mRoundedHorizontalProgressBar1.animateProgress(2000, 0, 80);

        mRoundedHorizontalProgressBar2.setProgressColors(ResourcesCompat.getColor(getResources(), R.color.blue_light, null), ResourcesCompat.getColor(getResources(), R.color.blue, null));
        mRoundedHorizontalProgressBar2.animateProgress(1000, 0, 60);

        mRoundedHorizontalProgressBar4.animateProgress(1000, 0 , 40);
    }
}
