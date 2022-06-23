/**
 * Construye Usuarios que tiene como principal caracteristica
 * el idioma en este caso Espanio de Espania
 */
public class UsuarioEspania extends Usuario {

    /**
     * Constructor de un Usuario que utiliza
     * idioma Espaniol de Espania
     */
    public UsuarioEspania(String nombre, Chat chat){
        this.nombre = nombre;
        this.chat = chat;
        this.idioma = new Esp();
        chat.agregarUsuario(this);
    }

}
