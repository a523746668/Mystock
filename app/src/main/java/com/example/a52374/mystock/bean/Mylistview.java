package com.example.a52374.mystock.bean;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by 52374 on 2016/12/15.
 */
public class Mylistview extends ListView {

    public Mylistview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Mylistview(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
