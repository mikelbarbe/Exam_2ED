package test;


import main.Biblioteca;
import main.Libro;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    Biblioteca biblioteca;
    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();

    }

    @Test
    public void  agregarLibro(){
        String titulo = "Cien años de soledad";
        String autor = "Gabriel García Márquez";
        int anioPublicacion = 1967;

        Libro libro = new Libro(titulo, autor, anioPublicacion);

        assertTrue("Se ha agregado",biblioteca.agregarLibro(libro));
    }

    @Test
    public void  eliminarLibro(){
        String titulo = "Cien años de soledad";
        String autor = "Gabriel García Márquez";
        int anioPublicacion = 1967;

        Libro libro = new Libro(titulo, autor, anioPublicacion);

        assertTrue("Se ha eliminado",biblioteca.eliminarLibro(libro));
    }

    @Test
    public void testConstructor(){
        String tituloEsperado = "Cien años de soledad";
        String autorEsperado = "Gabriel García Márquez";
        int anioPublicacionEsperado = 1967;

        Libro libro = new Libro(tituloEsperado, autorEsperado, anioPublicacionEsperado);

        assertEquals(tituloEsperado, libro.getTitulo(), "El título del libro no es correcto.");
        assertEquals(autorEsperado, libro.getAutor(), "El autor del libro no es correcto.");
        assertEquals(anioPublicacionEsperado, libro.getAnioPublicacion(), "El año de publicación del libro no es correcto.");
    }

    @Test
    public void encuentraLibrosPorAutor() {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("El señor de los anillos", "Tolkien", 1975);
        Libro libro3 = new Libro("Harry potter", "Rowling", 2001);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
    }


    }




}