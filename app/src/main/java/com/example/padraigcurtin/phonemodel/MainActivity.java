package com.example.padraigcurtin.phonemodel;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Phone Model Info");

        String deviceModel = android.os.Build.MODEL; // returns model name
        String deviceManufacturer = Build.MANUFACTURER;
        String deviceBoard = Build.BOARD;
        String deviceBootloader = Build.BOOTLOADER;
        String deviceBrand = Build.BRAND;
        String deviceCpuAbi= Build.CPU_ABI;
        String deviceCpuAbi2 = Build.CPU_ABI2;
        String deviceDevice = Build.DEVICE;
        String deviceDisplay = Build.DISPLAY;
        String deviceFingerprint = Build.FINGERPRINT;
        String deviceHardware = Build.HARDWARE;
        String deviceHost = Build.HOST;
        String deviceId = Build.ID;
        String deviceProduct = Build.PRODUCT;
        String deviceRadio = Build.RADIO;
        String deviceSerial = Build.SERIAL;
        String deviceTags = Build.TAGS;
        String deviceType = Build.TYPE;
        String deviceUser = Build.USER;

        TextView model = (TextView)findViewById(R.id.model);
        model.setText("Model: "+ deviceModel);

        TextView manufacturer = (TextView)findViewById(R.id.manufacturer);
        manufacturer.setText("Manufacturer: "+ deviceManufacturer);

        TextView board = (TextView)findViewById(R.id.board);
        board.setText("Board: "+ deviceBoard);

        TextView bootloader = (TextView)findViewById(R.id.bootloader);
        bootloader.setText("Bootloader: "+ deviceBootloader);

        TextView brand = (TextView)findViewById(R.id.brand);
        brand.setText("Brand: "+ deviceBrand);

        TextView CpuAbi = (TextView)findViewById(R.id.cpuAbi);
        CpuAbi.setText("CpuAbi: "+ deviceCpuAbi);

        TextView CpuAbi2 = (TextView)findViewById(R.id.cpuAbi2);
        CpuAbi2.setText("CpuAbi2: "+ deviceCpuAbi2);

        TextView Device = (TextView)findViewById(R.id.device);
        Device.setText("Device: "+ deviceDevice);

        TextView Display = (TextView)findViewById(R.id.display);
        Display.setText("Display: "+ deviceDisplay);

        TextView Fingerprint = (TextView)findViewById(R.id.fingerprint);
        Fingerprint.setText("Fingerprint: "+ deviceFingerprint);

        TextView Hardware = (TextView)findViewById(R.id.hardware);
        Hardware.setText("Hardware: "+ deviceHardware);

        TextView Host = (TextView)findViewById(R.id.host);
        Host.setText("Host: "+ deviceHost);

        TextView Id = (TextView)findViewById(R.id.id);
        Id.setText("Id: "+ deviceId);

        TextView Product = (TextView)findViewById(R.id.product);
        Product.setText("Manufacturer: "+ deviceProduct);

        TextView Radio = (TextView)findViewById(R.id.radioView);
        Radio.setText("Radio: "+ deviceRadio);

        TextView Serial = (TextView)findViewById(R.id.serial);
        Serial.setText("Serial: "+ deviceSerial);

        TextView Tags = (TextView)findViewById(R.id.tags);
        Tags.setText("Tags: "+ deviceTags);

        TextView Type = (TextView)findViewById(R.id.type);
        Type.setText("Model: "+ deviceType);

        TextView User = (TextView)findViewById(R.id.user);
        User.setText("User: "+ deviceUser);
    }
}
