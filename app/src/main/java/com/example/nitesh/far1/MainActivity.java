package com.example.nitesh.far1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2;
    RecyclerView r1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     b1=(Button) findViewById(R.id.fetch);
             b2=(Button) findViewById(R.id.delete);
        r1= (RecyclerView) findViewById(R.id.rview);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"please save",Toast.LENGTH_LONG).show();
            }
        });

    }
    @Override
    public void onClick(View v) {

    }

}
