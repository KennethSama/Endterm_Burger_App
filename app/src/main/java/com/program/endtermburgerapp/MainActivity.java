package com.program.endtermburgerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Start();
    }

    void Start(){


    }

    public void onMenuItemClicked(View v){
        if(v.getId() == R.id.menuItem1){
            LoadDetailedMenuItem(R.id.menuItem1);
        }
        else if(v.getId() == R.id.menuItem2){
            LoadDetailedMenuItem(R.id.menuItem2);

        }
        else if(v.getId() == R.id.menuItem3){

        }
        else if(v.getId() == R.id.menuItem4){

        }
        else if(v.getId() == R.id.menuItem5){

        }
    }

    void LoadDetailedMenuItem(int menuItem){

    }

    public class MenuItem{
        String name = "";
        double price = 0;
        String ingredients = "";

        public void MenuItem(String _name, double _price, String _ingredients){
            name = _name;
            price = _price;
            ingredients = _ingredients;
        }
    }
}