package com.example.administrator.location;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.location.utils.LocationUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button  mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        mButton= (Button) findViewById(R.id.location_btn);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.location_btn:
                LocationUtils.getCNBylocation(MainActivity.this);
                Toast.makeText(MainActivity.this,LocationUtils.cityName,Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
