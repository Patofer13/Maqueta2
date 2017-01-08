package app.vega.patricio.com.maqueta2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Aviso2Activity extends AppCompatActivity  implements View.OnClickListener{


    Button aviso_volver;

    Button avisocasa_vulnerable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviso2);

        aviso_volver= (Button)findViewById(R.id.aviso_volver);

        aviso_volver.setOnClickListener(this);

        avisocasa_vulnerable=(Button) findViewById(R.id.avisocasa_vulnerable);

        avisocasa_vulnerable.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.aviso_volver:

                Intent intent =new Intent(Aviso2Activity.this,MainActivity.class);
                startActivity(intent);
                break;

            case  R.id.avisocasa_vulnerable:

                Toast.makeText(getApplicationContext(),"Mensaje enviado",Toast.LENGTH_LONG).show();


        }

    }
}
