package com.example.a52374.mystock;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     private ArrayList<Fragment> list=new ArrayList<>();
     private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

         manager=getSupportFragmentManager();
        initview();
        initdata();
    }

    private void initdata() {

    }

    private void initview() {
        RadioGroup rg= (RadioGroup) findViewById(R.id.mainrg);

    }

    public void click(View view) {
    }
}
