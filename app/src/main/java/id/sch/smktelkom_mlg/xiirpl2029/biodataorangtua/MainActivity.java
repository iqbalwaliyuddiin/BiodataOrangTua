package id.sch.smktelkom_mlg.xiirpl2029.biodataorangtua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Button btOk;
    TextView tvHasil;
    RadioGroup rgStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        btOk = (Button) findViewById(R.id.button);
        tvHasil = (TextView) findViewById(R.id.tvHasil);
        rgStatus = (RadioGroup) findViewById(R.id.rgStatus);



    }
}