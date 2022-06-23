/**
 * Construye Usuarios que tiene como principal caracteristica
 * el idioma en este caso Espaniol de Mexico
 */
public class UsuarioMexico extends Usuario {

    /**
     * Constructor de un Usuario que utiliza
     * idioma Espaniol de Mexico
     */
    public UsuarioMexico(String nombre, Chat chat){
        this.nombre = nombre;
        this.chat = chat;
        this.idioma = new Mex();
        chat.agregarUsuario(this);
    }

}
