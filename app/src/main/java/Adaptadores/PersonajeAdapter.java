package Adaptadores;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marin_murcia_francisco_app.R;

import java.util.List;

import Modelos.Personaje;
import Vistas.Detalle.Detalle;

public class PersonajeAdapter extends RecyclerView.Adapter<PersonajeAdapter.PersonajeViewHolder> {

    private List<Personaje> listapersonajes;
    private Context contexto;
    private ActionMode menuam;
    private int posicion = -1;

    public PersonajeAdapter(List<Personaje> listapersonajes) {
        this.listapersonajes = listapersonajes;
    }

    @NonNull
    @Override
    public PersonajeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personaje, parent, false);
        contexto = parent.getContext();
        return new PersonajeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonajeViewHolder holder, int position) {
        Personaje personaje = listapersonajes.get(position);
        holder.bind(personaje);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (personaje != null) {
                    Intent intent = new Intent(contexto, Detalle.class);
                    intent.putExtra("nombre", personaje.getNombre());
                    intent.putExtra("descripcion", personaje.getDescripcion());
                    intent.putExtra("imagen", personaje.getImagenResId());
                    intent.putExtra("imagenExtra1", personaje.getImagenExtra1());
                    intent.putExtra("imagenExtra2", personaje.getImagenExtra2());
                    intent.putExtra("descripcionLarga", personaje.getDescripcionExtra());
                    contexto.startActivity(intent);
                }
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (menuam == null) {
                    posicion = holder.getAdapterPosition();
                    menuam = ((AppCompatActivity) view.getContext()).startSupportActionMode(new ActionModeCallback());
                    return true;
                }
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return listapersonajes.size();
    }

    private void eliminarelementoseleccionado(Context contexto) {
        if (posicion != -1) {
            listapersonajes.remove(posicion);
            notifyItemRemoved(posicion);
            notifyItemRangeChanged(posicion, listapersonajes.size());
            Toast.makeText(contexto, "Personaje eliminado", Toast.LENGTH_SHORT).show();
            posicion = -1;
        }
    }

    private class ActionModeCallback implements ActionMode.Callback {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            mode.getMenuInflater().inflate(R.menu.action_menu, menu);
            mode.setTitle("Elije una opción");
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            if (item.getItemId() == R.id.borrar) {
                mostrarDialogoConfirmacion(mode);
                return true;
            }
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            menuam = null;
            posicion = -1;
        }

        private void mostrarDialogoConfirmacion(ActionMode mode) {
            new AlertDialog.Builder(contexto)
                    .setTitle("Confirmación de eliminación")
                    .setMessage("¿Está seguro de que desea eliminar este personaje?")
                    .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            if (posicion != -1) {
                                eliminarelementoseleccionado(contexto);
                                Toast.makeText(contexto, "Personaje ELIMINADO", Toast.LENGTH_SHORT).show();
                            }
                            mode.finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(contexto, "Eliminación cancelada", Toast.LENGTH_SHORT).show();
                            mode.finish();
                        }
                    })
                    .create()
                    .show();
        }
    }

    public class PersonajeViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        private TextView txtnombre;
        private TextView txtdescripcion;

        public PersonajeViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_personaje);
            txtnombre = itemView.findViewById(R.id.txt_nombre_personaje);
            txtdescripcion = itemView.findViewById(R.id.txt_descripcion_personaje);
        }

        public void bind(Personaje personaje) {
            txtnombre.setText(personaje.getNombre());
            txtdescripcion.setText(personaje.getDescripcion());
            img.setImageResource(personaje.getImagenResId());
        }
    }
}
