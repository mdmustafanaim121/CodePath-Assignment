package com.mufti.codepathassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button button;
    Button viewButton;
    Button button3;
    EditText editText;
    RelativeLayout relativeLayout;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.heading);
        editText = (EditText) findViewById(R.id.text1);
        button = (Button) findViewById(R.id.button1);
        button3 = (Button) findViewById(R.id.button3);
        viewButton = (Button) findViewById(R.id.button2);
        button4 = (Button) findViewById(R.id.but4);

        relativeLayout = (RelativeLayout) findViewById(R.id.mainActivity);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("")) {
                    txt.setText(getResources().getText(R.string.default_string));
                } else
                    txt.setText(editText.getText());
            }
        });

        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            }
        });

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(getResources().getText(R.string.default_string));
                relativeLayout.setBackgroundResource(R.color.backgroundColour);
                txt.setTextColor(getResources().getColor(R.color.textColor));

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("Android is Awesome");
            }
        });
    }

}
