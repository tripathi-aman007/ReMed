package com.example.remed4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn,btn1,btn2, btn3;
    ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        imageSlider = findViewById(R.id.imageSlider);
        btn = (Button) findViewById(R.id.button2);
        btn1 = (Button) findViewById(R.id.donate);
        btn2 = (Button) findViewById(R.id.button3);

        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://i.postimg.cc/7L7mdSTK/med-pic.png", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i.postimg.cc/Qxy97PnT/Donor-Data.png", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i.postimg.cc/W1pV2b7m/quote.png", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels , ScaleTypes.FIT) ;

    }


    public void onClick(View view) {

        switch (view.getId()){
            case R.id.donate:
                Toast.makeText(this, "Donation Form", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(FirstActivity.this, Donate.class);
                startActivity(intent1);
                break;
            case R.id.button2:
                Toast.makeText(this, "Buy Fresh!", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(FirstActivity.this, FreshBuy.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Toast.makeText(this, "Re Buy!", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(FirstActivity.this, ReBuy.class);
                startActivity(intent3);
                break;
        }
    }
}