package com.example.gridview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    static final String[] MOBILE_OS = new String[] {
            "Android", "iOS", "Windows", "Blackberry", "Linux", "Ubuntu", "MacOS", "Solaris", "Symbian", "Bada"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        ImageAdapter adapter = new ImageAdapter(this, MOBILE_OS);
        gridView.setAdapter(adapter);
    }
}
