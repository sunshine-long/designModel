package com.marlon.example.designmodel.factory.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.kanglong.factory_model.R;
import com.example.kanglong.factory_model.test.ComputerFactory;
import com.example.kanglong.factory_model.test.MacBook;
import com.example.kanglong.factory_model.test.Windows;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AbstractHumanFactory humanFactory = new HumanFacory();
        Human whiteHuman = humanFactory.creactHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        Human blackHuman = humanFactory.creactHuman(BlackHuman.class);
        blackHuman.talk();
        blackHuman.getColor();

        YellowHuman yellowHuman = humanFactory.creactHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

        ComputerFactory computerFactory = new ComputerFactory();
        MacBook macBook = computerFactory.creactComputer(MacBook.class);
        macBook.serashWeb();
        macBook.system();
        macBook.typing();
        Windows windows = computerFactory.creactComputer(Windows.class);
        windows.serashWeb();
        windows.typing();
        windows.system();

    }
}
