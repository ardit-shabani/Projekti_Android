package com.pt.projekti_trete.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.pt.projekti_trete.R;
import com.squareup.picasso.Picasso;

public class ApiActivity extends AppCompatActivity {

    TextView tvTitle, tvURL;
    ImageView ivPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_api);
        getSupportActionBar().hide();
        tvTitle = findViewById(R.id.tvTitle);
        tvURL = findViewById(R.id.tvURL);
        ivPhoto = findViewById(R.id.ivPhoto);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String photo = extras.getString("photo");
            String title = extras.getString("title");
            String description = extras.getString("desc");
            Picasso.get().load(photo).into(ivPhoto);
            tvTitle.setText(title);
            tvURL.setText(description);

        }
        else{
            Toast.makeText(ApiActivity.this, "Something went wrong.", Toast.LENGTH_SHORT).show();
        }
    }
}