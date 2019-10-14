package com.example.mobil.Fragments;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.mobil.Activities.Result;
import com.example.mobil.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Sewa extends Fragment {
    public static final String NAMA_KEY ="Nama";
    public static final String MOBIL_KEY ="Mobil";
    public static final String DURASI_KEY ="Durasi";
    public static final String Mulai_KEY ="Mulai";
    public static final String AKHIR_KEY ="Akhir";
    private EditText NamaInput;
    private EditText NamamobilInput;
    private EditText DurasiInput;
    private EditText MulaiInput;
    private EditText AkhirInput;
    private Button Proses;


    public Sewa() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sewa, container, false);
        NamaInput = (EditText) v.findViewById(R.id.editNama);
        NamamobilInput = (EditText) v.findViewById(R.id.editMobil);
        DurasiInput = (EditText) v.findViewById(R.id.editDurasi);
        MulaiInput = (EditText) v.findViewById(R.id.editMulai);
        AkhirInput = (EditText) v.findViewById(R.id.editAkhir);
        Proses= (Button) v.findViewById(R.id.buttonProses);
        Proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = NamaInput.getText().toString();
                String mobil =NamamobilInput.getText().toString();
                int durasi = Integer.parseInt(DurasiInput.getText().toString());
                int mulai = Integer.parseInt(MulaiInput.getText().toString());
                int akhir = Integer.parseInt(AkhirInput.getText().toString());
                Result m1=(Result) getActivity();
                m1.f1(name,mobil,durasi,mulai,akhir);

            }
        });
        return v;
    }

}
