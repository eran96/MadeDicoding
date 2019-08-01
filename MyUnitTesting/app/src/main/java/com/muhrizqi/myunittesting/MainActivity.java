package com.muhrizqi.myunittesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements MainView {

    EditText edtwidth, edtlenght, edtheight;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtwidth = findViewById(R.id.edt_width);
        edtlenght = findViewById(R.id.edt_hieght);
        edtheight = findViewById(R.id.edt_hieght);
        Button btncalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);

        final MainPresenter presenter = new MainPresenter(this);
        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String length = edtlenght.getText().toString().trim();
                String width = edtwidth.getText().toString().trim();
                String height = edtheight.getText().toString().trim();

                boolean isEmptyFields = false;

                if (TextUtils.isEmpty(length)){
                    isEmptyFields = true;
                    edtlenght.setError("Field ini tidak boleh kososng");
                }
                if (TextUtils.isEmpty(width)){
                    isEmptyFields = true;
                    edtwidth.setError("Field ini tidak boleh kososng");
                }
                if (TextUtils.isEmpty(height)){
                    isEmptyFields = true;
                    edtheight.setError("Field ini tidak boleh kososng");
                }
                if (!isEmptyFields){
                    double l = Double.parseDouble(length);
                    double w = Double.parseDouble(width);
                    double h = Double.parseDouble(height);

                    presenter.calculateVolume(l,w,h);
                }
            }
        });
    }

    @Override
    public void showVolume(MainModel model) {
        tvResult.setText(String.valueOf(model.getValume()));

    }

    public static class  MainModel{
        private double valume;

        public MainModel(double volume){
            this.valume = volume;
        }

        public double getValume() {
            return valume;
        }
    }
}
