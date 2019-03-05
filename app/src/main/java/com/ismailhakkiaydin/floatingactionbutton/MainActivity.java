package com.ismailhakkiaydin.floatingactionbutton;

import android.graphics.Color;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab);
        coordinatorLayout= findViewById(R.id.coordinatorLayout);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Fab", Toast.LENGTH_LONG).show();
            }
        });

    }

    public void snackButtonclick(View view){
        Snackbar.make(coordinatorLayout, "Snackbar Örneği", Snackbar.LENGTH_LONG).show();
    }

    public void snackBarActionClick(View view){

        Snackbar snackbar = Snackbar.make(coordinatorLayout, "YENİDEN DENEYİNİZ", Snackbar.LENGTH_LONG);
        snackbar.setAction("TEKRAR DENE", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(coordinatorLayout,"TAMAM, OLDU.", Snackbar.LENGTH_SHORT).show();
            }
        });

        snackbar.show();

    }

    public void snackBarKisisel(View view){
        Snackbar snackbar = Snackbar.make(coordinatorLayout,"Kişiselleştirilmiş Örnek", Snackbar.LENGTH_LONG);

        View snackBarLayout = snackbar.getView();
            snackBarLayout.setBackgroundColor(Color.BLUE);

            TextView textView = snackBarLayout.findViewById(android.support.design.R.id.snackbar_text);
            textView.setTextColor(Color.WHITE);

            snackbar.show();
    }

}
