package app.vega.patricio.com.maqueta2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Emergencia2Activity extends AppCompatActivity  implements View.OnClickListener{


    Button evolver;
    Button casa_vulnerada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencia2);

        evolver = (Button) findViewById(R.id.evolver);

        evolver.setOnClickListener(this);

        casa_vulnerada=(Button)findViewById(R.id.casa_vulnerada);

        casa_vulnerada.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

      switch (v.getId()) {

          case R.id.evolver:

              Intent intent = new Intent(Emergencia2Activity.this,MainActivity.class);

              startActivity(intent);

              break;

          case  R.id.casa_vulnerada:
              Toast.makeText(getApplicationContext(),"Mensaje enviado",Toast.LENGTH_LONG).show();




              break;

    }

    }
}
