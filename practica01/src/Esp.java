/**
 * Implementa metodos para Usuarios que utilizan
 * como Idioma principal el Espaniol de Espania
 */
public class Esp implements Idioma {

    /**
     * Notifica a todos los usuarios que hay un nuevo usuario
     * por medio de un print statement en idioma espaniol espania
     * @param usuario que se acaba de unir al Chat
     * @param nombre del usuario al que se le va a notificar
     */
    public void notificarUsuarioNuevo(Usuario usuario, String nombre){
        System.out.println(nombre+ ": Habeis conseguido un nuevo compañero, ti@. Saludad a " + usuario.getNombre());
    }

    /**
     * Notifica a todos los usuarios que un usuario salio del Chat
     * por medio de un print statement en idioma espaniol espania
     * @param usuario que sale del Chat
     * @param nombre del usuario al que se le va a notificar
     */
    public void notificarUsuarioRemovido(Usuario usuario, String nombre){
        System.out.println(nombre+ ": Oye chaval, debeis notar que " + usuario.getNombre() +
                " ha salido del chat");
    }

    /**
     * Notifica a todos los usuarios que un usuarios envio un mensaje
     * por medio de un print statement en idioma espaniol espania
     * @param mensaje que envio el usuario
     * @param usuario que envio el mensaje
     * @param nombre del usuario al que se le va a notificar
     */
    public void notificarMensaje(String mensaje, String usuario, String nombre){
        System.out.println(nombre+ ": Vos debeis leer que " + usuario +
                " dice: ''' " + mensaje+" ''' ");
    }
}
