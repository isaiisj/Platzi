package platzi.play.contenido;

public class Pelicula extends Contenido {
    public Pelicula(String titulo, int duracion, Genero genero, double calificacion) {
        super(titulo, duracion, genero, calificacion);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo las pelicula " + this.getTitulo());
    }

    @Override
    public String obtenerFichaTecnica() {
        return "Titulo: " + this.getTitulo() +
                "(" + getFechaEstreno().getYear() + ")\n" +
                "Genero: " + getGenero() + "\n"
                + "Calificacion: " + getCalificacion() + "/5\n";
    }
}
