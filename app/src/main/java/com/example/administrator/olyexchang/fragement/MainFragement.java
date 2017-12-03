package com.example.administrator.olyexchang.fragement;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;//.support.v4.app.Fragment จะต้องใช้ใหม่ๆเสมอ
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.administrator.olyexchang.R;


/**
 * Created by Administrator on 3/12/2560.
 */

public class MainFragement extends Fragment{

    //    Explicit หรือการประกาศตัวแปร
    private RadioGroup radioGroup;
    private RadioButton usdRadioButton, thbRadioButton;
    private EditText editText;
    private Button button;

    //    สร้างเมทอดหลัก ที่ใช้ในการจัดการ การทำงาน
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initialView();


    }// Main Method

    private void initialView() {
        //        Initial View
        radioGroup = getView().findViewById(R.id.ragMoney);
        thbRadioButton = getView().findViewById(R.id.radTHB);
        usdRadioButton = getView().findViewById(R.id.radUSD);
        editText = getView().findViewById(R.id.edtMoney);
        button = getView().findViewById(R.id.btnExchange);

//        Click USD to THB First
        clickUSDToTHBFirst();


    }

    private void clickUSDToTHBFirst() {
        usdRadioButton.setChecked(true);
    }

    //    สร้างหน้ากาก Fragement
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
