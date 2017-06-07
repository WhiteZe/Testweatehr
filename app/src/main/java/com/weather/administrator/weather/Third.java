package com.weather.administrator.weather;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Third extends AppCompatActivity implements View.OnClickListener{

    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        Button button = (Button) findViewById(R.id.button_4);
        editText = (EditText) findViewById(R.id.edit_text);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button_4:
                String inputText = editText.getText().toString();
                Toast.makeText(Third.this,inputText,
                        Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
