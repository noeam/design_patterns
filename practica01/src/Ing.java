/**
 * Implementa metodos para Usuarios que utilizan
 * como Idioma principal el Ingles
 */
public class Ing implements Idioma {

    /**
     * Notifica a todos los usuarios que hay un nuevo usuario
     * por medio de un print statement en idioma ingles
     * @param usuario que se acaba de unir al Chat
     * @param nombre del usuario al que se le va a notificar
     */
    public void notificarUsuarioNuevo(Usuario usuario, String nombre){
        System.out.println(nombre+ ": User " + usuario.getNombre()+
                " has joined");
    }

    /**
     * Notifica a todos los usuarios que un usuario salio del Chat
     * por medio de un print statement en idioma ingles
     * @param usuario que sale del Chat
     * @param nombre del usuario al que se le va a notificar
     */
    public void notificarUsuarioRemovido(Usuario usuario, String nombre){
        System.out.println(nombre+ ": User " + usuario.getNombre() +
                " has left");
    }

    /**
     * Notifica a todos los usuarios que un usuarios envio un mensaje
     * por medio de un print statement en idioma ingles
     * @param mensaje que envio el usuario
     * @param usuario que envio el mensaje
     * @param nombre del usuario al que se le va a notificar
     */
    public void notificarMensaje(String mensaje, String usuario, String nombre){
        System.out.println(nombre+ ": User " + usuario +
                " says: ''' " + mensaje+" ''' ");
    }
}
