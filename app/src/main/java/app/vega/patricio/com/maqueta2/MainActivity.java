package app.vega.patricio.com.maqueta2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button aviso;

    Button emergencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aviso = (Button)findViewById(R.id.aviso);

        aviso.setOnClickListener(this);

        emergencia = (Button)findViewById(R.id.emergencia);

        emergencia.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

      switch (v.getId()) {


case R.id.aviso:
    Intent intent = new Intent(MainActivity.this,Aviso2Activity.class);
    startActivity(intent);



    break;

          case R.id.emergencia:

      Intent intent1 = new Intent(MainActivity.this,Emergencia2Activity.class);

       startActivity(intent1);

    break;


      }

    }
}
