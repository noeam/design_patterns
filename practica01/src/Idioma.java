public interface Idioma {

    /**
     * Notifica a todos los usuarios que hay un nuevo usuario
     * @param usuario que se acaba de unir al Chat
     * @param nombre del usuario al que se le va a notificar
     */
    public void notificarUsuarioNuevo(Usuario usuario, String nombre);

    /**
     * Notifica a todos los usuarios que un usuario salio del Chat
     * @param usuario que sale del Chat
     * @param nombre del usuario al que se le va a notificar
     */
    public void notificarUsuarioRemovido(Usuario usuario, String nombre);

    /**
     * Notifica a todos los usuarios que un usuarios envio un mensaje
     * @param mensaje que envio el usuario
     * @param usuario que envio el mensaje
     * @param nombre del usuario al que se le va a notificar
     */
    public void notificarMensaje(String mensaje, String usuario, String nombre);
}
