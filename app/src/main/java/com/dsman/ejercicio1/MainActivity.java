package com.dsman.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextN;
    private EditText s1;
    private EditText s2;
    private  EditText etPC;
    private EditText etCity;
    private TextView txtDesc;
    private Button btnMostar;
    private Switch SwitchChanger;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextN = findViewById(R.id.editTextN);
        s1 = findViewById(R.id.editTextS1);
        editTextN = findViewById(R.id.editTextN);
        SwitchChanger = findViewById(R.id.switchShow);
       btnMostar = findViewById(R.id.btnMostrar);
        txtDesc = findViewById(R.id.txtDesc);
        SwitchChanger.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    txtDesc.setVisibility(View.VISIBLE);
                }
                else{
                    txtDesc.setVisibility(View.INVISIBLE);
                }

            }
        });
       onClickListener {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    txtDesc.setVisibility(View.VISIBLE);
                }
                else{
                    txtDesc.setVisibility(View.INVISIBLE);
                }
    }
}
