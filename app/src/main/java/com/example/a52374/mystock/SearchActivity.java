package com.example.a52374.mystock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import java.text.BreakIterator;

public class SearchActivity extends AppCompatActivity {
   private EditText et;
    private Button bt;
    private String url="http://web.juhe.cn:8080/finance/stock/hs?gid=sh601009&key=886f9731bd108642504f3f3d9a3e7162";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
          initview();

    }

    private void initview() {
         et= (EditText) findViewById(R.id.set);
         et.setHint("请输入股票代码");
    }
      public  void click(View v){
          switch (v.getId()){
              case R.id.btnone:

                   break;
              case R.id.bts:
                  break;
          }
      }
}
