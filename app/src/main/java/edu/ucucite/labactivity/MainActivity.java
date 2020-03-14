package edu.ucucite.labactivity;

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

    public void onclickmenu1(View view) {
        String m_menunum = "1";
        String m_menudata = "PHP\nJava";
        Intent intent = new Intent(MainActivity.this, SubmitActivity.class);
        intent.putExtra("menu_num", m_menunum.toString());
        intent.putExtra("menu_data", m_menudata.toString());
        startActivity(intent);
    }

    public void onclickmenu2(View view) {
        String m_menunum = "2";
        String m_menudata = "C\nC++";
        Intent intent = new Intent(MainActivity.this, SubmitActivity.class);
        intent.putExtra("menu_num", m_menunum.toString());
        intent.putExtra("menu_data", m_menudata.toString());
        startActivity(intent);
    }

    public void onclickmenu3(View view) {
        String m_menunum = "3";
        String m_menudata = "Javascript\nHtml";
        Intent intent = new Intent(MainActivity.this, SubmitActivity.class);
        intent.putExtra("menu_num", m_menunum.toString());
        intent.putExtra("menu_data", m_menudata.toString());
        startActivity(intent);
    }

    public void onclickmenu4(View view) {
        String m_menunum = "4";
        String m_menudata = "Dart\nFlutter";
        Intent intent = new Intent(MainActivity.this, SubmitActivity.class);
        intent.putExtra("menu_num", m_menunum.toString());
        intent.putExtra("menu_data", m_menudata.toString());
        startActivity(intent);
    }
}
