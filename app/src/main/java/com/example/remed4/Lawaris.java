package com.example.remed4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Lawaris extends AppCompatActivity implements View.OnClickListener {

    Button fresh, donate, re;
    ImageSlider image_slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawaris);

        fresh = (Button) findViewById(R.id.fresh_buy);
        donate = (Button) findViewById(R.id.donate);
        re = (Button) findViewById(R.id.re_buy);
        image_slider = (ImageSlider) findViewById(R.id.image_slider);

        fresh.setOnClickListener(this);
        donate.setOnClickListener(this);
        re.setOnClickListener(this);

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://i.postimg.cc/7L7mdSTK/med-pic.png", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i.postimg.cc/Qxy97PnT/Donor-Data.png", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i.postimg.cc/W1pV2b7m/quote.png", ScaleTypes.FIT));

        image_slider.setImageList(slideModels , ScaleTypes.FIT) ;

    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.donate:
                Toast.makeText(this, "Donation Form", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Lawaris.this, Donate.class);
                startActivity(intent1);
                break;
            case R.id.fresh_buy:
                Toast.makeText(this, "Buy Fresh!", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Lawaris.this, FreshBuy.class);
                startActivity(intent2);
                break;
            case R.id.re_buy:
                Toast.makeText(this, "Re Buy!", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Lawaris.this, ReBuy.class);
                startActivity(intent3);
                break;
        }
    }
}