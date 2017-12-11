package xyz.rty813.autobackground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import pictureremind.rty813.xyz.autobackground.AutoBackground;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        new AutoBackground(this, toolbar).setUpdateTime(AutoBackground.EVERY_DAY).setDefaultBgEnable(true).start();
    }
}
