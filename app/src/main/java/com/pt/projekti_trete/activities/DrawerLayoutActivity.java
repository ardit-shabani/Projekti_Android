package com.pt.projekti_trete.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.pt.projekti_trete.R;

public class DrawerLayoutActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView ivOpenMenu;
    TextView tvWebView,tvSharedPreferences,tvPopup,tvApi,tvGetLocation,tvJsonParser,
            tvCanvas,tvCheckConnection,tvDynamicFragment,tvStaticFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_layout);

        getSupportActionBar().hide();

        drawerLayout = findViewById(R.id.drawer_layout);
        ivOpenMenu = findViewById(R.id.ivOpenMenu);
        tvWebView = findViewById(R.id.tvWebView);
        tvSharedPreferences = findViewById(R.id.tvSharedPreferences);
        tvPopup = findViewById(R.id.tvPopup);
        tvApi = findViewById(R.id.tvApi);
        tvGetLocation = findViewById(R.id.tvGetLocation);
        tvJsonParser = findViewById(R.id.tvJsonParser);
        tvCanvas = findViewById(R.id.tvCanvas);
        tvCheckConnection=findViewById(R.id.tvCheckConnection);
        tvDynamicFragment = findViewById(R.id.tvDynamicFragment);
        tvStaticFragment = findViewById(R.id.tvStaticFragment);


        ivOpenMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        tvApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, NewsListActivity.class);
                startActivity(intent);
            }
        });


        tvSharedPreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, SharedPreferences.class);
                startActivity(intent);

            }
        });

        tvWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, WebView.class);
                startActivity(intent);
            }
        });

        tvGetLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, GetCurrentLocation.class);
                startActivity(intent);
            }
        });

        tvJsonParser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, LocalParserJsonActivity.class);
                startActivity(intent);
            }
        });

        tvCanvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        tvCheckConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, CheckConnection.class);
                startActivity(intent);
            }
        });

        tvPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, Popup.class);
                startActivity(intent);
            }
        });

        tvDynamicFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, FragmentHolderActivity.class);
                startActivity(intent);
            }
        });

        tvStaticFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this,StaticFragmentActivity.class);
                startActivity(intent);
            }
        });


    }




    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        //fragment transaction, for add, replace, remove
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container, fragment);// replace whatever in rel_fragment_holder with fragment
        fragmentTransaction.commit(); // save the changes

    }
}
