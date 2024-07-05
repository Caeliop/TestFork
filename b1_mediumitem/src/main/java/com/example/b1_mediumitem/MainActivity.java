package com.example.b1_mediumitem;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        CheckBox check = findViewById(R.id.checkBox);
        CheckBox check2 = findViewById(R.id.checkBox2);
        check.setOnCheckedChangeListener(new CheckListener());
        check2.setOnCheckedChangeListener(new MyCheck());
        Switch swc = findViewById(R.id.switch1);
        swc.setOnCheckedChangeListener(new SwitchListener());
        RadioButton rdb = findViewById(R.id.radioButton);
        rdb.setOnClickListener(new RadioButtonListener());

    }

    private class CheckListener implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            Toast.makeText(MainActivity.this, "111111111" + isChecked, Toast.LENGTH_SHORT).show();
        }
    }
    private class MyCheck implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            Toast.makeText(MainActivity.this, "222222222" + isChecked, Toast.LENGTH_SHORT).show();
        }
    }
    public class SwitchListener implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            Toast.makeText(MainActivity.this, "333333333" + isChecked, Toast.LENGTH_SHORT).show();
        }
    }
    public class RadioButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Log.d("Radio", "onClick:666666666 ");
        }
    }
}