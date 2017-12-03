package com.example.administrator.olyexchang.fragement;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;//.support.v4.app.Fragment จะต้องใช้ใหม่ๆเสมอ
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.olyexchang.R;


/**
 * Created by Administrator on 3/12/2560.
 */

public class MainFragement extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_main,container,false);

        return view;
    }





}//MainFragement Class นี่คือคลาสหลัก
