package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton resim1Radio;
    RadioButton resim2Radio;
    RadioButton resim3Radio;
    RadioButton resim4Radio;
    ImageView imageView;
    RadioGroup radioGroup;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        //islevVer();
        idAl();
    }
    private void tanimla(){
        resim1Radio = findViewById(R.id.resim1);
        resim2Radio = findViewById(R.id.resim2);
        resim3Radio = findViewById(R.id.resim3);
        resim4Radio = findViewById(R.id.resim4);
        imageView = findViewById(R.id.imgView);
        radioGroup = findViewById(R.id.rGroup);
        button = findViewById(R.id.btn);
     }
     private void idAl(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int gelenId = radioGroup.getCheckedRadioButtonId();
                resimDegis(gelenId);
            }
        });

     }

     private void islevVer(){
        resim1Radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.animal_post);
                Toast.makeText(MainActivity.this, resim1Radio.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        resim2Radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.animal_post_2);
                Toast.makeText(MainActivity.this, resim2Radio.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        resim3Radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.animal_post_3);
                Toast.makeText(MainActivity.this,resim3Radio.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        resim4Radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.animal_post_4);
                Toast.makeText(MainActivity.this,resim4Radio.getText(), Toast.LENGTH_SHORT).show();
            }
        });
     }
     private void resimDegis(int id){
        if (id == R.id.resim1){
            imageView.setImageResource(R.drawable.animal_post);
            Toast.makeText(MainActivity.this, resim1Radio.getText(), Toast.LENGTH_SHORT).show();
        } else if (id == R.id.resim2) {
            imageView.setImageResource(R.drawable.animal_post_2);
            Toast.makeText(MainActivity.this, resim2Radio.getText(), Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.resim3){
            imageView.setImageResource(R.drawable.animal_post_3);
            Toast.makeText(MainActivity.this,resim3Radio.getText(), Toast.LENGTH_SHORT).show();
        }else if (id == R.id.resim4){
            imageView.setImageResource(R.drawable.animal_post_4);
            Toast.makeText(MainActivity.this,resim4Radio.getText(), Toast.LENGTH_SHORT).show();
        }
     }
}