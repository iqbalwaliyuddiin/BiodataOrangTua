package id.sch.smktelkom_mlg.xiirpl2029.biodataorangtua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Button btOk;
    TextView tvHasil;
    RadioGroup rgStatus;
    CheckBox pns, w, pt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        btOk = (Button) findViewById(R.id.button);
        tvHasil = (TextView) findViewById(R.id.tvHasil);
        rgStatus = (RadioGroup) findViewById(R.id.rgStatus);
        pns = (CheckBox) findViewById(R.id.checkBoxPNS);
        w = (CheckBox) findViewById(R.id.checkBoxW);
        pt = (CheckBox) findViewById(R.id.checkBoxPT);

        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHasil();
            }
        });

    }

    private void goHasil() {
        if (isValid()) {
        String nama = etNama.getText().toString();

            String hasil = null;
            if (rgStatus.getCheckedRadioButtonId()!=-1)
            {
                RadioButton rb = (RadioButton)
                        findViewById(rgStatus.getCheckedRadioButtonId());
                hasil = rb.getText().toString();
            }
            if (hasil == null)
            {
                tvHasil.setText("Belum memilih");
            }

            String hsl = "\n";
            int startlen = hsl.length();
            if(pns.isChecked()) hsl+=pns.getText()+"\n";
            if(w.isChecked()) hsl+=w.getText()+"\n";
            if(pt.isChecked()) hsl+=pt.getText()+"\n";

            if(hsl.length()==startlen) hsl+="Tidak ada masukan";
        tvHasil.setText("Orang Tua yang bernama " + nama + " Berpenghasilan : \n" + hasil +
                " \nBerprofesi sebagai : " + hsl);
    }
}

    private boolean isValid() {
        boolean valid = true;

        String nama = etNama.getText().toString();

        if (nama.isEmpty()){
            etNama.setError("kolom belum diisi");
            valid = false;
        }
        else {
            etNama.setError(null);
        }
        return valid;
    }
}