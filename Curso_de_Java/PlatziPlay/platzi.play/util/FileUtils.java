package platzi.play.util;

import platzi.play.contenido.Documental;
import platzi.play.contenido.Genero;
import platzi.play.contenido.Contenido;
import platzi.play.contenido.Pelicula;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static final String NOMBRE_ARCHIVO = "contenido.txt";
    public static final String SEPARADOR = "\\|";

    public static void escribirContenido(Contenido pelicula) {
        String linea = String.join(SEPARADOR,
                pelicula.getTitulo(),
                String.valueOf(pelicula.getDuracion()),
                pelicula.getGenero().name(),
                String.valueOf(pelicula.getCalificacion()),
                pelicula.getFechaEstreno().toString()
        );

        String lineaFinal;

        if (pelicula instanceof Documental documental){
            lineaFinal  = "DOCUMENTAL" + SEPARADOR +linea + SEPARADOR + documental.getNarrador();
        } else {
            lineaFinal = "PELICULA" + SEPARADOR + linea;
        }

        try{
            Files.writeString(Paths.get(NOMBRE_ARCHIVO),
                    lineaFinal + System.lineSeparator(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch(IOException e){
            System.out.println("Error al escribir el archivo" + e.getMessage());
        }

    }

    public static List<Contenido> leerContenido(){
        List<Contenido> contenidoDesdeArchivo = new ArrayList<>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));

            lineas.forEach(linea -> {
                String[] datos = linea.split(SEPARADOR);

                String tipoContenido = datos[0];

                if (("PELICULA".equals(tipoContenido) && datos.length >= 6) || ("DOCUMENTAL").equals(tipoContenido) && datos.length >= 7) {
                    String titulo = datos[1];
                    int duracion = Integer.parseInt(datos[2]);
                    Genero genero = Genero.valueOf(datos[3].toUpperCase());
                    double calificacion = datos[4].isBlank() ? 0 : Double.parseDouble(datos[4]);
                    LocalDate fecha = LocalDate.parse(datos[5]);

                    Contenido contenido;

                    if("PELICULA".equals(tipoContenido)){
                        contenido = new Pelicula(titulo,duracion,genero,calificacion);
                    } else {
                        String narrador = datos[6];
                        contenido = new Documental(titulo,duracion,genero,calificacion,narrador);
                    }

                    contenido.setFechaEstreno(fecha);
                    contenidoDesdeArchivo.add(contenido);
                }
            });

        } catch (IOException e) {
            System.out.println("Error al leer el archivo de peliculas" + e.getMessage());
        }

        return contenidoDesdeArchivo;
    }
}
