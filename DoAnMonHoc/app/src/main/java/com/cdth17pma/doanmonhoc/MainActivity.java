package com.cdth17pma.doanmonhoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showFgPass(View view) {
        Intent intent = new Intent(this, activity_FgPass.class);
        this.startActivity(intent);
    }

    public void showRegister(View view) {
        Intent intent = new Intent(this, Activiti_register.class);
        this.startActivity(intent);
    }

    public void Login(View view) {
        Intent intent = new Intent(this, ActivityM.class);
        this.startActivity(intent);
    }
}
