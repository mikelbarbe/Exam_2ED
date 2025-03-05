package main;

public class Libro {

    // TODO: Documentar estos atributos
    /**
     * Titulo del libro
     * Este atributo de tipo Sting almacena el titulo del libro
     */
    private String titulo;

    /**
     * Autor del libro
     * Este atributo de tipo String almacena el autor del libro
     */
    private String autor;

    /**
     * Año de publicacion
     * Este atributo de tipo Integer almacena el año de publicacion del libro
     */
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método

    /**
     * Es un constructor con los siguientes parametros
     * @param titulo es el titulo del libro
     * @param autor el autor del libro
     * @param anioPublicacion año de publicacion del libro
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método

    /**
     * Este metodo es para que te de el autor del libro
     * @return devuelve el nombre del autor del libro
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método

    /**
     * Este metodo es para que te de el año de publicacion del libro
     * @return devuelve el año de publicacion del libro
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
