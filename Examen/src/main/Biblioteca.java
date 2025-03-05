package main;
import main.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que trabaja con una biblioteca y diferentes metodos para manejarla
 * @author Mikel Barberena
 * @version 1.0
 * @see Libro
 */

public class Biblioteca {

    // TODO: Documentar estos atributos
    /**
     * Lista que almacena los libros registrados en la biblioteca
     */

    private final List<Libro> libros;

    // TODO: Documentar este método

    /**
     * Es un constructor sin parametros que te define la variable libros en un arrayList
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO

    /**
     * Es un constructor con parametros
     * @param libros le pasas un parametro y la lista se llamara con ese nombre
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Este metodo coge todos los libros de la lista
     * @return una lista con todos los libros
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     * Este metodo encuentra libros por su titulo
     * @param titulo recibe el titulo del libro
     * @return devuelve el libro con ese titulo
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo

    /**
     * @deprecated
     * Este metodo encuentra libros segun su autor
     * @link encuentraLibrosPorAutor (String autor)
     * @param autor el nombre del autor del libro
     * @return devuelve una lista con los libros que ha escrito ese autor
     */
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente

    /**
     * Este metodo encuentra libros segun su autor
     * @param autor es el nombre del autor que queremos buscar
     * @return devuelve una lista con todos los libros escritos por ese autor
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
