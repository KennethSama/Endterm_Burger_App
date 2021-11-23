package com.program.endtermburgerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

public class view_product extends AppCompatActivity {
    private ConstraintLayout constraintLayout_ProductInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);
        Init_Components();
    }
    private void Init_Components(){
        constraintLayout_ProductInfo = findViewById(R.id.constraintLayout_ProductInfo);
    }
    public void HideDescription(View v){
        constraintLayout_ProductInfo.setVisibility(View.GONE);
    }
    public void ShowDescription(View v){
        constraintLayout_ProductInfo.setVisibility(View.VISIBLE);
    }
}