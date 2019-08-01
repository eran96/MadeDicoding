package com.muhrizqi.barvolume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

EditText edtwidth,edthieght,edtLenght;
Button btncalculate, btnMoveWithObject;
TextView tvresult;
    private static final String STATE_RESULT = "state_result";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtwidth = findViewById(R.id.edt_width);
        edthieght = findViewById(R.id.edt_height);
        edtLenght = findViewById(R.id.edit_lenght);
        btncalculate = findViewById(R.id.btn_calculate);
        tvresult =findViewById(R.id.tv_result);

        btncalculate.setOnClickListener(this);

        //modul POJO
        btnMoveWithObject = findViewById(R.id.btn_move_activity_object);
        btnMoveWithObject.setOnClickListener(this);

        //end module POJO

        if (savedInstanceState != null){
            String result = savedInstanceState.getString(STATE_RESULT);
            tvresult.setText(result);
        }

    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_RESULT, tvresult.getText().toString());
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_calculate:
                String inputlenght =edtLenght.getText().toString().trim();
                String inputwidth = edtwidth.getText().toString().trim();
                String inputheight = edthieght.getText().toString().trim();

                boolean isEmptyFields = false;
                boolean isInvalidDouble =false;

                if (TextUtils.isEmpty(inputwidth)){
                    isEmptyFields = true;
                    edtwidth.setError("Field ini tidak boleh kosong");
                }
                if (TextUtils.isEmpty(inputlenght)){
                    isEmptyFields = true;
                    edtLenght.setError("Field ini tidak boleh kosong");
                }
                if (TextUtils.isEmpty(inputheight)){
                    isEmptyFields = true;
                    edthieght.setError("Field ini tidak boleh kosong");
                }
                Double lenght = toDouble(inputlenght);
                Double weidth = toDouble(inputwidth);
                Double height = toDouble(inputheight);

                if (lenght == null){
                    isInvalidDouble =true;
                    edtLenght.setError("Field ini harus berupa nomor yang valid");
                }
                if (weidth == null){
                    isInvalidDouble =true;
                    edtwidth.setError("Field ini harus berupa nomor yang valid");
                }
                if (height == null){
                    isInvalidDouble =true;
                    edthieght.setError("Field ini harus berupa nomor yang valid");
                }
                if (!isEmptyFields && !isInvalidDouble){
                    double volume = lenght * weidth *height;
                    tvresult.setText(String.valueOf(volume));
                }
            case R.id.btn_move_activity_object:
                Person person = new Person();
                person.setName("DicodingAcademy");
                person.setAge(5);
                person.setEmail("rizky775@gmail.com");
                person.setCity("Pemalang");

                Intent moveWithObjectIntent = new Intent(MainActivity.this, MoveWithObjectActivity.class);
                moveWithObjectIntent.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person);
                startActivity(moveWithObjectIntent);
                break;
        }
    }




    Double toDouble(String str) {
        try {
            return Double.valueOf(str);
        }catch (NumberFormatException e){
            return null;
        }

    }


}
