package com.example.remed4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class FreshBuy extends AppCompatActivity {

    Button btn;
    ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresh_buy);

        btn = (Button) findViewById(R.id.see_moreBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more_medicine = new Intent(FreshBuy.this,FirstActivity.class);
                startActivity(more_medicine);
            }
        });
        imageSlider= findViewById(R.id.imageSlider);

        //now we will create a list for images

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://i.postimg.cc/76FYB80C/de-med2.png", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i.postimg.cc/h43ZJ4gb/do-med.png", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i.postimg.cc/BnCVnTvt/NDD.jpg", ScaleTypes.FIT));


        imageSlider.setImageList(slideModels , ScaleTypes.FIT);

    }

    public void dolo_func(View view) {
        Toast.makeText(this,"Dolo", Toast.LENGTH_LONG).show();
        Intent dolo = new Intent(FreshBuy.this, Dolo.class);
        startActivity(dolo);
    }

    public void ecosprin_func(View view) {
        Toast.makeText(this,"Ecosprin", Toast.LENGTH_LONG).show();
        Intent eco_sprin = new Intent(FreshBuy.this, Ecosprin.class);
        startActivity(eco_sprin);
    }

    public void tamsulosin_func(View view) {
        Toast.makeText(this,"Tamsulosin", Toast.LENGTH_LONG).show();
        Intent tam = new Intent(FreshBuy.this, Tamsulosin.class);
        startActivity(tam);
    }

    public void corbis_func(View view) {
        Toast.makeText(this,"Corbis", Toast.LENGTH_LONG).show();
        Intent cor = new Intent(FreshBuy.this, Corbis.class);
        startActivity(cor);
    }

    public void cardicheck_func(View view) {
        Toast.makeText(this,"Cardicheck", Toast.LENGTH_LONG).show();
        Intent car_check = new Intent(FreshBuy.this, Cardicheck.class);
        startActivity(car_check);
    }

    public void canagliflozin_func(View view) {
        Toast.makeText(this,"Canagliflozin", Toast.LENGTH_LONG).show();
        Intent car_check = new Intent(FreshBuy.this, Canagliflozin.class);
        startActivity(car_check);
    }
}