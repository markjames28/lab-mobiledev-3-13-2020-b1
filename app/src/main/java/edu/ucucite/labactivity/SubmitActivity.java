package edu.ucucite.labactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SubmitActivity extends AppCompatActivity {
    EditText st_menu_num_et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        st_menu_num_et = findViewById(R.id.et_validation);
    }

    public void onclicksubmit(View view) {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String st_menu_num = bundle.get("menu_num").toString();
        String st_menu_data = bundle.get("menu_data").toString();
        String et_menu_num_inp = st_menu_num_et.getText().toString();
        if (st_menu_num.equals(et_menu_num_inp)){
            Intent intent_display = new Intent(SubmitActivity.this, DisplayActivity.class);
            intent_display.putExtra("menu_data", st_menu_data.toString());
            startActivity(intent_display);
        }else {
            Toast.makeText(this, "Invalid menu number", Toast.LENGTH_SHORT).show();
        }

    }
}
