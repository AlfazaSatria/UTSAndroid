package com.example.mobil.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.example.mobil.R;

public class Input extends AppCompatActivity {

    public static final String NAMA_KEY = "nama";
    public static final String MOBIL_KEY = "mobil";
    public static final String DURASI_KEY = "durasi";
    public static final String MULAI_KEY = "mulai";
    public static final String AKHIR_KEY = "akhir";

    private EditText EditNama;
    private EditText EditMobil;
    private EditText EditDurasi;
    private EditText EditMulai;
    private EditText EditAkhir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        EditNama = findViewById(R.id.editNama);
        EditMobil = findViewById(R.id.editMobil);
        EditDurasi = findViewById(R.id.editDurasi);
        EditMulai = findViewById(R.id.editMulai);
        EditAkhir = findViewById(R.id.editAkhir);
    }

    public void handlerClikSewa(View view) {
        String nama = EditNama.getText().toString();
        String mobil = EditMobil.getText().toString();
        int durasi = Integer.parseInt(EditDurasi.getText().toString());
        int mulai = Integer.parseInt(EditMulai.getText().toString());
        int akhir = Integer.parseInt(EditAkhir.getText().toString());

        Intent intent = new Intent(this, Result.class);
        intent.putExtra(NAMA_KEY, nama);
        intent.putExtra(MOBIL_KEY, mobil);
        intent.putExtra(DURASI_KEY, durasi);
        intent.putExtra(MULAI_KEY, mulai);
        intent.putExtra(AKHIR_KEY, akhir);

        startActivity(intent);


    }


}
