/**
 * Implementa metodos para Usuarios que utilizan
 * como Idioma principal el Espaniol de Mexico
 */
public class Mex implements Idioma {

    /**
     * Notifica a todos los usuarios que hay un nuevo usuario
     * por medio de un print statement en idioma espaniol mexico
     * @param usuario que se acaba de unir al Chat
     * @param nombre del usuario al que se le va a notificar
     */
    public void notificarUsuarioNuevo(Usuario usuario, String nombre){
        System.out.println(nombre+ ": Tienes un/a nuev@ amig@. Saluda a " + usuario.getNombre());
    }

    /**
     * Notifica a todos los usuarios que un usuario salio del Chat
     * por medio de un print statement en idioma espaniol mexico
     * @param usuario que sale del Chat
     * @param nombre del usuario al que se le va a notificar
     */
    public void notificarUsuarioRemovido(Usuario usuario, String nombre){
        System.out.println(nombre+ ": Hijoles, tu amig@ " + usuario.getNombre() +
                " se salio de la conversacion");
    }

    /**
     * Notifica a todos los usuarios que un usuarios envio un mensaje
     * por medio de un print statement en idioma espaniol mexico
     * @param mensaje que envio el usuario
     * @param usuario que envio el mensaje
     * @param nombre del usuario al que se le va a notificar
     */
    public void notificarMensaje(String mensaje, String usuario, String nombre){
        System.out.println(nombre+ ": Oye carnalito, " + usuario +
                " mando un mensaje:" + "''' " + mensaje+" ''' ");
    }
}
