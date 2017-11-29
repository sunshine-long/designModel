package com.marlon.example.designmodel.builder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.marlon.example.designmodel.R;
import com.marlon.example.designmodel.builder.sample.BMWBuilder;
import com.marlon.example.designmodel.builder.sample.BMWModel;
import com.marlon.example.designmodel.builder.sample.BenzBuilder;
import com.marlon.example.designmodel.builder.sample.BenzModel;
import com.marlon.example.designmodel.builder.sample.Director;
import com.marlon.example.designmodel.builder.test.MacBook;
import com.marlon.example.designmodel.builder.test.MacBookBuilder;
import com.marlon.example.designmodel.builder.test.Windows;
import com.marlon.example.designmodel.builder.test.WindowsBuilder;

import java.util.ArrayList;

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("engine Boom");
        sequence.add("stop");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
        benzModel.run();


        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmwModel = (BMWModel) bmwBuilder.getCarModel();
        bmwModel.run();



        Director director = new Director();
        director.getBenzModel().run();
        director.getBmwBuilder().run();

        MacBookBuilder macBookBuilder = new MacBookBuilder();
        macBookBuilder.setmBosrd("8");
        macBookBuilder.setmDisplay("Apple_Display");
        macBookBuilder.setmOS();
        MacBook macBook = (MacBook) macBookBuilder.getComputer();
        Log.d("CarModel",macBook.toString());

        WindowsBuilder windowsBuilder = new WindowsBuilder();
        windowsBuilder.setmBosrd("4");
        windowsBuilder.setmDisplay("AUSU");
        windowsBuilder.setmOS();
        Windows windows = (Windows) windowsBuilder.getComputer();
        Log.d("CarModel",windows.toString());

        WindowsBuilder windowsBuilder1 = new WindowsBuilder();
        com.marlon.example.designmodel.builder.test.Director director1 = new com.marlon.example.designmodel.builder.test.Director(windowsBuilder1);
        director1.construct("8","lianxiang");
        Log.d("CarModel",windowsBuilder1.getComputer().toString());
    }
}
