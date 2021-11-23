package com.program.endtermburgerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class view_product extends AppCompatActivity {
    private ConstraintLayout constraintLayout_ProductInfo;

    TextView tv_itemName;
    TextView tv_itemPrice;
    TextView tv_itemIngredients;
    ImageView image_itemImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);
        Init_Components();
        LoadItemDetails();
    }
    private void Init_Components(){
        constraintLayout_ProductInfo = findViewById(R.id.constraintLayout_ProductInfo);
        tv_itemName = findViewById(R.id.textView_nameValue);
        tv_itemPrice = findViewById(R.id.textView_priceValue);
        tv_itemIngredients = findViewById(R.id.textView_Ingredients);
        image_itemImage = findViewById(R.id.image_itemImage);
    }
    public void HideDescription(View v){
        constraintLayout_ProductInfo.setVisibility(View.GONE);
    }
    public void ShowDescription(View v){
        constraintLayout_ProductInfo.setVisibility(View.VISIBLE);
    }

    private void LoadItemDetails(){
        tv_itemName.setText(getIntent().getStringExtra("ITEM NAME"));
        tv_itemPrice.setText(getIntent().getStringExtra("ITEM PRICE"));
        tv_itemIngredients.setText(getIntent().getStringExtra("ITEM INGREDIENTS"));
        image_itemImage.setImageResource(getResources().getIdentifier(getIntent().getStringExtra("ITEM IMAGE"), "drawable", getPackageName()));
    }
    public void Goback(View v){
        finish();
    }
}