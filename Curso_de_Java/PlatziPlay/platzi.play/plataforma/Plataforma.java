package platzi.play.plataforma;

import platzi.play.contenido.*;
import platzi.play.exception.PeliculaExistenteException;
import platzi.play.util.FileUtils;

import java.util.*;

public class Plataforma {
    private String nombre;
    private List<Contenido> contenido;
    private Map<Contenido,Integer> visualizaciones;

    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.contenido = new ArrayList<>();
        this.visualizaciones = new HashMap<>();
    }

    // Metodo para agregar peliculas
    public void agregar(Contenido pelicula) {

        Contenido contenido = this.buscarTitulo(pelicula.getTitulo());
        if (contenido != null) {
            throw new PeliculaExistenteException(pelicula.getTitulo());
        }

        FileUtils.escribirContenido(pelicula);
        this.contenido.add(pelicula);
    }

    public void reproducir(Contenido pelicula) {
        int contenidoAcutal = visualizaciones.getOrDefault(pelicula, 0);
        System.out.println(pelicula.getTitulo() + " ha sido reproducido " + contenidoAcutal + " veces");
        this.contarVisualizacion(pelicula);
        pelicula.reproducir();
    }

    private void contarVisualizacion(Contenido contenido){
        visualizaciones.put(contenido, visualizaciones.getOrDefault(contenido, 0) + 1);
    }

    // Metodo para eliminar peliculas
    public void eliminar (Contenido elemento) {
        this.contenido.remove(elemento);
    }


    public List<String> mostarTitulos () {

        return contenido.stream()
                .map(Contenido::getTitulo).toList();
    }

    public List<ResumenContenido> getResumenes(){
        return contenido.stream()
                .map(contenido -> new ResumenContenido(contenido.getTitulo(),contenido.getDuracion(),contenido.getGenero()))
                .toList();
    }

    public Contenido buscarTitulo (String titulo) {

        return contenido.stream().filter(contenido -> contenido.getTitulo()
                        .equalsIgnoreCase(titulo))
                    .findFirst().orElse(null);

    }


    public List<Contenido> buscarPorGenero (Genero genero) {
        return contenido.stream()
                .filter(contenido -> contenido.getGenero().equals(genero))
                .toList();
    }


    public List<Contenido> getPopulares(int canitdad){
        return contenido.stream()
                .sorted(Comparator.comparingDouble(Contenido::getCalificacion).reversed())
                .limit(canitdad)
                .toList();
    }

    public List<Pelicula> getPeliculas(){
        return contenido.stream()
                .filter(contenido -> contenido instanceof Pelicula)
                .map(contenidoFiltrado -> (Pelicula) contenidoFiltrado)
                .toList();
    }

    public List<Documental> getDocumentales(){
        return contenido.stream()
                .filter(contenido -> contenido instanceof Documental)
                .map(contenidoFiltrado -> (Documental) contenidoFiltrado)
                .toList();
    }

    public List<Promocionable> getContenidoPromocionable() {
        return contenido.stream()
                .filter(contenido -> contenido instanceof Promocionable)
                .map(contenidoProm -> (Promocionable) contenidoProm)
                .toList();
    }

    public List<Contenido> getMuyPopulares(){
        return contenido.stream().filter(contenido -> contenido.getCalificacion() > 4)
                .toList();
    }

    public Contenido getMasLargo(){
        return contenido.stream()
                .sorted(Comparator.comparingInt(Contenido::getDuracion).reversed())
                .findFirst().orElse(null);
    }

    public Contenido getMasCorto(){
        return contenido.stream()
                .sorted(Comparator.comparingInt(Contenido::getDuracion))
                .findFirst().orElse(null);
    }

    public  int getDuracionTotal() {
        return  contenido.stream().mapToInt(Contenido::getDuracion).sum();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Contenido> getContenido() {
        return contenido;
    }
}
