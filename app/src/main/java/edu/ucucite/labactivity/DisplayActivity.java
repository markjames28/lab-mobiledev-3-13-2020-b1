package edu.ucucite.labactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView menudatatxtdisp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String st_menu_data = bundle.get("menu_data").toString();
        menudatatxtdisp = findViewById(R.id.menudatatxt);
        menudatatxtdisp.setText(st_menu_data.toString());
    }
}
