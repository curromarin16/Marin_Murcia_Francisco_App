package Modelos;

import java.io.Serializable;

public class Personaje implements Serializable {
    private int imagenResId;
    private String nombre;
    private String descripcion;
    private int imagenextra1;
    private int imagenextra2;
    private String descripcionextra;
    public Personaje(int imagenResId, String nombre, String descripcion,int imagenextra1, int imagenextra2, String descripcionextra) {
        this.imagenResId = imagenResId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenextra1=imagenextra1;
        this.imagenextra2=imagenextra2;
        this.descripcionextra=descripcionextra;
    }
    public int getImagenResId() { return imagenResId; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public int getImagenExtra1() { return imagenextra1; }
    public int getImagenExtra2() { return imagenextra2; }
    public String getDescripcionExtra() { return descripcionextra; }



}
