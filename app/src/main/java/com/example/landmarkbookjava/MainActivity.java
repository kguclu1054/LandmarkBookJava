package com.example.landmarkbookjava;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Lankmark> landmarkArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            landmarkArrayList = new ArrayList<>();

            Lankmark pisa = new Lankmark("Pisa" , "Italy", R.drawable.pisatower);
            Lankmark eiffel = new Lankmark("Eiffel", "France" ,R.drawable.eiffel);
            Lankmark colosseum = new Lankmark("Colosseum", "Italy", R.drawable.colosseum);
            Lankmark londonBridge = new Lankmark("London Bridge", "UK", R.drawable.londonbridge);

            landmarkArrayList.add(pisa);
            landmarkArrayList.add(eiffel);
            landmarkArrayList.add(colosseum);
            landmarkArrayList.add(londonBridge);

            return insets;
        });
    }
}