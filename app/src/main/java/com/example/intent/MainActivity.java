package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button explicit;
    Button implicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicit = (Button)findViewById(R.id.explicit);
        explicit.setOnClickListener((View.OnClickListener) this);
        implicit = (Button)findViewById(R.id.implicit);
        implicit.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.explicit:
                Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(explicit);
                break;

            case R.id.implicit:
             Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3schools.com"));
                 startActivity(implicit);
                 break;
             default:
                 break;
        }
    }
}
