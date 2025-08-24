package platzi.play;

import platzi.play.contenido.*;
import platzi.play.exception.PeliculaExistenteException;
import platzi.play.plataforma.Plataforma;
import platzi.play.util.FileUtils;
import platzi.play.util.ScannerUtils;

import java.util.List;


public class Main {
    public static final String NOMBRE_PLATAFORMA = "PLATZI PLAY";
    public  static  final String VERSION = "v1.0.0";

    public static final int AGREGAR = 1;
    public static final int MOSTRAR = 2;
    public static final int BUSCAR = 3;
    public static final int BUSCAR_GENERO = 4;
    public static final int VER_POPULARES = 5;
    public static final int REPRODUCIR = 6;
    public static final int BUSCAR_POR_TIPO = 7;
    public static final int VER_MUY_POPULARES = 8;
    public static final int VER_MAS_LARGA = 9;
    public static final int VER_MAS_CORTA = 10;
    public static final int ELIMINAR = 11;
    public static final int SALIR = 12;

    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma(NOMBRE_PLATAFORMA);
        System.out.println(NOMBRE_PLATAFORMA + " " + VERSION);

        cargarPeliculas(plataforma);

        System.out.println("Más de " + plataforma.getDuracionTotal() + " minutos de contenido\n");
        plataforma.getContenidoPromocionable().forEach(promocionable -> System.out.println(promocionable.promocionar()));

        while (true) {
            int opcionElegida = ScannerUtils.capturarNumero("""
                    Ingrese alguna de las siguientes opiones
                    1. Agregar conenido
                    2. Mostrar todo
                    3. Buscar por titulo
                    4. Buscar por genero
                    5. Ver populares
                    6. Reproducir
                    7. Buscar por tipo de contenido
                    8. Ver muy populares
                    9. Ver mas larga
                    10. Ver mas corta
                    11. Eliminar
                    12. Salir
                    """);


            switch (opcionElegida) {
                case AGREGAR -> {
                    int tipoDeContenido = ScannerUtils.capturarNumero("¿Que tipo de contenido quieres agregar?\n" +
                            "\n1.Pelicula\n2.Documental ");

                    String nombre = ScannerUtils.capturarTexto("Nombre del contenido");
                    Genero genero = ScannerUtils.capturarGenero("Genero del contenido");
                    int duracion = ScannerUtils.capturarNumero("Duracion del contenido");
                    double calificacion = ScannerUtils.capturarDecimal("Calificacion del contenido");

                    try {
                        if (tipoDeContenido == 1) {
                            plataforma.agregar(new Pelicula(nombre,duracion,genero,calificacion));
                        } else {
                            String narradorDeDocumental = ScannerUtils.capturarTexto("Narrador de documental");
                            plataforma.agregar(new Documental(nombre,duracion,genero,calificacion, narradorDeDocumental));
                        }

                    } catch (PeliculaExistenteException e) {
                        System.out.println(e.getMessage());
                    }

                }

                case MOSTRAR -> {
                    List<ResumenContenido> conenidosResumidos = plataforma.getResumenes();
                    conenidosResumidos.forEach(resumen -> System.out.println(resumen.toString()));
                }

                case BUSCAR -> {
                    String nombreBuscado = ScannerUtils.capturarTexto("Nombre del contenido a buscar");
                    Contenido contenido = plataforma.buscarTitulo(nombreBuscado);

                    if (contenido != null) {
                        System.out.println(contenido.obtenerFichaTecnica());
                    } else {
                        System.out.println(nombreBuscado + " no existe dentro de " + plataforma.getNombre());
                    }
                }

                case BUSCAR_GENERO -> {
                    Genero generoBuscado = ScannerUtils.capturarGenero("Genero del contenido");
                    List<Contenido> contenidoPorGenero = plataforma.buscarPorGenero(generoBuscado);
                    System.out.println(contenidoPorGenero.size() + " encontrados por el genero " + generoBuscado);
                    contenidoPorGenero.forEach(cotenido -> System.out.println(cotenido.obtenerFichaTecnica() + "\n"));
                }

                case VER_POPULARES -> {
                    int cantidad = ScannerUtils.capturarNumero("Cantidad del contenido");
                    List<Contenido> contenidosPopulares = plataforma.getPopulares(cantidad);
                    contenidosPopulares.forEach(cotenido -> System.out.println(cotenido.obtenerFichaTecnica() + "\n"));
                }

                case REPRODUCIR -> {
                    String nombre = ScannerUtils.capturarTexto("Nombre del contenido");
                    Contenido pelicula = plataforma.buscarTitulo(nombre);

                    if (pelicula != null) {
                        plataforma.reproducir(pelicula);
                    } else {
                        System.out.println(nombre + " no existe");
                    }
                }

                case BUSCAR_POR_TIPO -> {
                    int tipoContenido = ScannerUtils.capturarNumero("¿Que tipo de contenido quieres buscar?\n1.Pelicula\n2.Documental");
                    if(tipoContenido == 1) {
                        List<Pelicula> peliculas = plataforma.getPeliculas();
                        peliculas.forEach(pelicula -> System.out.println(pelicula.obtenerFichaTecnica() + "\n"));
                    } else {
                        List<Documental> documentales = plataforma.getDocumentales();
                        documentales.forEach(documental -> System.out.println(documental.obtenerFichaTecnica() + "\n"));
                    }
                }

                case VER_MUY_POPULARES -> {
                    List<Contenido> pelicula = plataforma.getMuyPopulares();
                    pelicula.forEach(content -> System.out.println(content.obtenerFichaTecnica() + "\n"));
                }

                case VER_MAS_LARGA -> {
                    Contenido peli = plataforma.getMasLargo();
                    System.out.println(peli.obtenerFichaTecnica());
                }

                case VER_MAS_CORTA -> {
                    Contenido peli = plataforma.getMasCorto();
                    System.out.println(peli.obtenerFichaTecnica());
                }

                case ELIMINAR -> {
                    String nombreAEliminar = ScannerUtils.capturarTexto("Nombre del contenido a eliminar");
                    Contenido contenido = plataforma.buscarTitulo(nombreAEliminar);

                    if (contenido != null) {
                        plataforma.eliminar(contenido);
                        System.out.println(nombreAEliminar + " eliminado! ❌");
                    } else {
                        System.out.println(nombreAEliminar + " no existe dentro de " + plataforma.getNombre());
                    }
                }

                case SALIR -> System.exit(0);

                default -> System.out.println("Opcion invalida");
            }

        }



    }

    private static void cargarPeliculas(Plataforma plataforma) {

        plataforma.getContenido().addAll(FileUtils.leerContenido());

    }
}
