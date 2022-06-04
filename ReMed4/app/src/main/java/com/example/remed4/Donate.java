package com.example.remed4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Donate extends AppCompatActivity {
    ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
        setTitle("Donation Form");

        imageSlider = findViewById(R.id.imageSlider);

        //now we will create a list for images

        ArrayList<SlideModel> slideModels = new ArrayList<>();
//        slideModels.add(new SlideModel("https://th.bing.com/th/id/OIP.JNX0Ys53jCzUtKq2_AmZAgHaE8?pid=ImgDet&rs=1", ScaleTypes.FIT));
//        slideModels.add(new SlideModel("https://i1.wp.com/www.emedicalpoint.in/wp-content/uploads/2020/02/dolo-500x500-1.jpg?fit=500%2C500&ssl=1", ScaleTypes.FIT));
//        slideModels.add(new SlideModel("https://th.bing.com/th/id/OIP.VxoRFzYqjCzbAanZIPzFMAHaFF?pid=ImgDet&w=600&h=412&rs=1", ScaleTypes.FIT));
//        slideModels.add(new SlideModel("https://cdn.shop-apotheke.com/images/3024x0/tamsulosin-aurobindo-0-4mg-retard-kapseln-D01129612-p10.jpg", ScaleTypes.FIT));

        slideModels.add(new SlideModel("https://tinypic.host/images/2022/05/08/1.png", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://tinypic.host/images/2022/05/08/2.png", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://tinypic.host/images/2022/05/08/donate1.png", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://tinypic.host/images/2022/05/08/donate2.png", ScaleTypes.FIT));
        imageSlider.setImageList(slideModels , ScaleTypes.FIT);
    }
}