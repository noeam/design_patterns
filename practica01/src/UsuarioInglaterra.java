/**
 * Construye Usuarios que tiene como principal caracteristica
 * el idioma en este caso Ingles
 */
public class UsuarioInglaterra extends Usuario {

    /**
     * Constructor de un Usuario que utiliza
     * idioma Ingles
     */
    public UsuarioInglaterra(String nombre, Chat chat){
        this.nombre = nombre;
        this.chat = chat;
        this.idioma = new Ing();
        chat.agregarUsuario(this);
    }


}
