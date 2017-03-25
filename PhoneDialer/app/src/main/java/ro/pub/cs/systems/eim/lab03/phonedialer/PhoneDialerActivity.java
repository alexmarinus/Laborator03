package ro.pub.cs.systems.eim.lab03.phonedialer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class PhoneDialerActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
        Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
        button0 = (Button) findViewById(R.id.button25);
        button0.setOnClickListener(this);
        button1 = (Button) findViewById(R.id.button26);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button27);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button28);
        button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button29);
        button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.button30);
        button5.setOnClickListener(this);
        button6 = (Button) findViewById(R.id.button31);
        button6.setOnClickListener(this);
        button7 = (Button) findViewById(R.id.button32);
        button7.setOnClickListener(this);
        button8 = (Button) findViewById(R.id.button33);
        button8.setOnClickListener(this);
        button9 = (Button) findViewById(R.id.button34);
        button9.setOnClickListener(this);

        ImageButton imageButtonBack, imageButtonDial, imageButtonDeny;
        imageButtonBack = (ImageButton) findViewById(R.id.imageButton);
        imageButtonDial = (ImageButton) findViewById(R.id.imageButton2);
        imageButtonDeny = (ImageButton) findViewById(R.id.imageButton3);
    }

    @Override
    public void onClick (View view) {
        int id = view.getId();

    }

}
