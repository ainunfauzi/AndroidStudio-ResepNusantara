package com.abc.resepnusantara;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_ayam, R.id.nav_bebek, R.id.nav_buah, R.id.nav_cumi, R.id.nav_daging, R.id.nav_ikan)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void AyamBakarKecap(View view) {
        Intent intent = new Intent(MainActivity.this, AyamBakarKecap.class);
        startActivity(intent);
    }

    public void AyamCabeIjo(View view) {
        Intent intent = new Intent(MainActivity.this, AyamCabeIjo.class);
        startActivity(intent);
    }

    public void BebekBacem(View view) {
        Intent intent = new Intent(MainActivity.this, BebekBacem.class);
        startActivity(intent);
    }

    public void BebekGorengCabeIjo(View view) {
        Intent intent = new Intent(MainActivity.this, BebekGorengCabeIjo.class);
        startActivity(intent);
    }

    public void BrowniesFruityMix(View view) {
        Intent intent = new Intent(MainActivity.this, BrowniesFruityMix.class);
        startActivity(intent);
    }

    public void FruitTerineSausStrawberry(View view) {
        Intent intent = new Intent(MainActivity.this, FruitTerineSausStrawberry.class);
        startActivity(intent);
    }

    public void CumiAsinCabeHijau(View view) {
        Intent intent = new Intent(MainActivity.this, CumiAsinCabeHijau.class);
        startActivity(intent);
    }

    public void CumiBakar(View view) {
        Intent intent = new Intent(MainActivity.this, CumiBakar.class);
        startActivity(intent);
    }

    public void Asam2Iga(View view) {
        Intent intent = new Intent(MainActivity.this, Asam2iga.class);
        startActivity(intent);
    }

    public void BeefTeriyaki(View view) {
        Intent intent = new Intent(MainActivity.this, BeefTeriyaki.class);
        startActivity(intent);
    }

    public void BalaTeriSayuran(View view) {
        Intent intent = new Intent(MainActivity.this, BalaTeriSayuran.class);
        startActivity(intent);
    }

    public void BaladoTeri(View view) {
        Intent intent = new Intent(MainActivity.this, BaladoTeri.class);
        startActivity(intent);
    }


}
