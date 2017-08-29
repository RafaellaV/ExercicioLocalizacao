package br.edu.iff.pooa20171.exerciciolocalizacao.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.edu.iff.pooa20171.exerciciolocalizacao.R;

public class MainActivity extends AppCompatActivity {

    Button Busca1 = (Button) findViewById(R.id.btBusca1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Busca1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Busca1Activity.class);
                startActivity(intent);
            }
        });
    }
}
