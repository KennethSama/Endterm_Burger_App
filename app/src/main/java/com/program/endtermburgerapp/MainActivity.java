package com.program.endtermburgerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.FocusFinder;
import android.view.Menu;
import android.view.View;

import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    MenuItem ultimeatBurger = new MenuItem();
    MenuItem kingSize = new MenuItem();
    MenuItem biteSize = new MenuItem();
    MenuItem classic = new MenuItem();
    MenuItem chicken = new MenuItem();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Start();
    }

    void Start(){

        ultimeatBurger.MenuItem("Ultimeat Burger", 139, "Double beef patties with bacon, lettuce, tomato, onions and cheese.", "pikpng_com_burger_png_images_2761101__1_");
        kingSize.MenuItem("King Size", 169, "A large burger that offers triple beef patties with lettuce, tomato, onion and double cheese", "kingsize_enlarge");
        biteSize.MenuItem("Bite Size", 99, "Beef patty with lettuce tomato and onion", "bitesize_enlarge");
        classic.MenuItem("Classic", 119, "Beef patty with lettuce, tomato, pickles, onion, bacon and cheese", "classic_enlarge");
        chicken.MenuItem("Chicken", 99, "A chicken burger with lettuce, tomato and special sauce", "chicken_enlarge");


    }

    public void onMenuItemClicked(View v){
        if(v.getId() == R.id.menuItem1){
            LoadDetailedMenuItem(ultimeatBurger);
        }
        else if(v.getId() == R.id.menuItem2){
            LoadDetailedMenuItem(kingSize);
        }
        else if(v.getId() == R.id.menuItem3){
            LoadDetailedMenuItem(biteSize);
        }
        else if(v.getId() == R.id.menuItem4){
            LoadDetailedMenuItem(classic);
        }
        else if(v.getId() == R.id.menuItem5){
            LoadDetailedMenuItem(chicken);
        }
    }

    void LoadDetailedMenuItem(MenuItem menuItem){
        Intent loadMenuItem = new Intent(MainActivity.this, view_product.class);

        Formatter formatter = new Formatter();
        formatter.format("%.2f", menuItem.price);

        loadMenuItem.putExtra("ITEM NAME", menuItem.name);
        loadMenuItem.putExtra("ITEM PRICE", formatter.toString());
        loadMenuItem.putExtra("ITEM INGREDIENTS", menuItem.ingredients);
        loadMenuItem.putExtra("ITEM IMAGE", menuItem.imageName);
        startActivity(loadMenuItem);
    }

    public class MenuItem{
        String name = "";
        double price = 0;
        String ingredients = "";
        String imageName = "";

        public void MenuItem(String _name, double _price, String _ingredients, String _imageName){
            name = _name;
            price = _price;
            ingredients = _ingredients;
            imageName = _imageName;
        }
    }
}