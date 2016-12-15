package com.example.a52374.mystock.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.a52374.mystock.R;
import com.example.a52374.mystock.bean.Mylistview;
import com.example.a52374.mystock.bean.Stock;

import java.util.ArrayList;

/**
 * Created by 52374 on 2016/12/15.
 */
public class Stocks extends Fragment {
    private Context context;
    private LayoutInflater inflater;
    private ArrayList<Stock> list=new ArrayList<>();
    private Mylistview listview;
    private TextView tvsz,tvs,tvc;
    private ImageView iv;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
        inflater=LayoutInflater.from(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.stocks,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
         initview(view);
         initdata();

    }

    private void initdata() {

    }

    private void initview(View v) {
        listview= (Mylistview) v.findViewById(R.id.slv);
        tvsz= (TextView) v.findViewById(R.id.tvsz);
        tvs= (TextView) v.findViewById(R.id.tvs);
        tvc= (TextView) v.findViewById(R.id.tvc);
        iv= (ImageView) v.findViewById(R.id.siv);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
