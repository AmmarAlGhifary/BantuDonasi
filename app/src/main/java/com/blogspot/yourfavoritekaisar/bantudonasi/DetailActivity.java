package com.blogspot.yourfavoritekaisar.bantudonasi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.imgPulau)
    ImageView imgPulau;
    @BindView(R.id.txtDetail)
    TextView txtDetail;
    @BindView(R.id.txt_Bio)
    TextView txtBio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        txtDetail.setText(getIntent().getStringExtra("np"));
        txtBio.setText(getIntent().getStringExtra("dp"));
        Glide.with(this).load(getIntent().getIntExtra("gp", 0)).into(imgPulau);
    }
}
