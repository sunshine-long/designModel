package com.marlon.example.designmodel.factory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.marlon.example.designmodel.R;
import com.marlon.example.designmodel.factory.sample.AbstractHumanFactory;
import com.marlon.example.designmodel.factory.sample.BlackHuman;
import com.marlon.example.designmodel.factory.sample.Human;
import com.marlon.example.designmodel.factory.sample.HumanFacory;
import com.marlon.example.designmodel.factory.sample.WhiteHuman;
import com.marlon.example.designmodel.factory.sample.YellowHuman;
import com.marlon.example.designmodel.factory.test.ComputerFactory;
import com.marlon.example.designmodel.factory.test.MacBook;
import com.marlon.example.designmodel.factory.test.Windows;

public class FactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
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
