package jp.techacademy.kentaro.nakanishi.aisatsuapp;


import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        showTimePickerDialog();
        }

    private void showTimePickerDialog(){
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener(){
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Log.d("UI_PARTS", String.valueOf(hourOfDay) + ":" + String.valueOf(minute));
                        String text;
                        if(hourOfDay >=2 && hourOfDay <10){
                            text="おはよう";
                        }else if (hourOfDay >=10 && hourOfDay <18){
                        text="こんにちは";}
                        else{
                            text="こんばんは";}

                       TextView textView = (TextView) findViewById(R.id.textView);
                        textView.setText(text);
                    }
                },
                13, //初期値（時間）
                0,//初期値（分）
                true);
        timePickerDialog.show();
    }

}