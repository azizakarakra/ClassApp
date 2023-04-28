package edu.bzu.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Add=findViewById(R.id.button2);
        TextView invisible = findViewById(R.id.textView2);
        LinearLayout innerLayout = findViewById(R.id.src);
        EditText hoppyInput = findViewById(R.id.txt);



        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                invisible.setTextSize(28);
                final String s =hoppyInput.getText().toString();
                if(s.isEmpty()){
                    invisible.setText("Error");
                }
                else{
                    invisible.setText(s);
                    invisible.setHeight(180);
                    hoppyInput.setText("");
                    addHoppy(innerLayout,s);
                }
                invisible.setVisibility(View.VISIBLE);
            }
        });
    }
    public void addHoppy(LinearLayout l,String s){
        TextView result = new TextView(this);
        result.setText(s);
        result.setTextSize(28);
        l.addView(result);
    }
}