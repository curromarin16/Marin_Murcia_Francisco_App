package Vistas.Detalle;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.marin_murcia_francisco_app.R;

public class Detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        String nombre = getIntent().getStringExtra("nombre");
        String descripcion = getIntent().getStringExtra("descripcion");
        int imagenResId = getIntent().getIntExtra("imagen", 0);

        int imagenExtra1 = getIntent().getIntExtra("imagenExtra1", 0);
        int imagenExtra2 = getIntent().getIntExtra("imagenExtra2", 0);
        String descripcionLarga = getIntent().getStringExtra("descripcionLarga");



        ImageView imgPrincipal = findViewById(R.id.img_detalle_principal);
        TextView txtNombre = findViewById(R.id.txt_nombre_detalle);
        TextView txtDescripcion = findViewById(R.id.txt_descripcion_detalle);
        ImageView imgExtra1 = findViewById(R.id.img_detalle_extra1);
        ImageView imgExtra2 = findViewById(R.id.img_detalle_extra2);
        TextView txtDescripcionLarga = findViewById(R.id.txt_descripcion_larga);
        txtDescripcionLarga.setMovementMethod(new ScrollingMovementMethod());
        imgPrincipal.setImageResource(imagenResId);
        txtNombre.setText(nombre);
        txtDescripcion.setText(descripcion);

        imgExtra1.setImageResource(imagenExtra1);
        imgExtra2.setImageResource(imagenExtra2);
        txtDescripcionLarga.setText(descripcionLarga);

    }
}
