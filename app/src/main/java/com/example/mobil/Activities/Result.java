package com.example.mobil.Activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.mobil.Fragments.Sewa;
import com.example.mobil.R;
import androidx.fragment.app.FragmentTransaction;

public class Result extends AppCompatActivity {
   private TextView ViewNama1;
    private TextView ViewMobil1;
    private TextView ViewDurasi1;
    private TextView ViewMulai1;
    private TextView ViewAkhir1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction t = getSupportFragmentManager().beginTransaction();
        Sewa s=new Sewa();
        t.add(R.id.linear,s);
        t.commit();
    }
    public void f1(String s1, String s2, int s3, int s4, int s5){
        ViewNama1=(TextView) findViewById(R.id.ViewNama);
        ViewMobil1=(TextView) findViewById(R.id.ViewMobil);
        ViewDurasi1=(TextView) findViewById(R.id.ViewDurasi);
        ViewMulai1=(TextView) findViewById(R.id.ViewMulai);
        ViewAkhir1=(TextView) findViewById(R.id.ViewAkhir);
        ViewNama1.setText(s1);
        ViewMobil1.setText(s2);
        ViewDurasi1.setText(s3);
        ViewMulai1.setText(s4);
        ViewAkhir1.setText(s5);

    }
}
