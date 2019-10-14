package com.example.mobil.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mobil.R;

public class Result extends AppCompatActivity {
    private TextView textNama;
    private TextView textMobil;
    private TextView textDurasi;
    private TextView textMulai;
    private TextView textAkhir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textNama = findViewById(R.id.viewNama);
        textMobil = findViewById(R.id.viewMobil);
        textDurasi = findViewById(R.id.viewDurasi);
        textMulai = findViewById(R.id.viewMulai);
        textAkhir = findViewById(R.id.viewAkhir);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            // TODO: display value here
            String Nama = extras.getString(Input.NAMA_KEY);
            String Mobil = extras.getString(Input.MOBIL_KEY);
            int Durasi = extras.getInt(Input.DURASI_KEY);
            int Mulai = extras.getInt(Input.MULAI_KEY);
            int Akhir = extras.getInt(Input.AKHIR_KEY);

            textNama.setText(Nama);
            textMobil.setText(Mobil);
            textDurasi.setText(String.valueOf(Durasi));
            textMulai.setText(String.valueOf(Mulai));
            textAkhir.setText(String.valueOf(Akhir));

        }
    }
}
