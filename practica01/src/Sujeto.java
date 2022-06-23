public interface Sujeto {


    /**
     * Agrega un usuario a la lista de usuarios del Chat y
     * notifica a todos los usuarios de la lista
     * @param usuario al que se quiere agregar a la lista
     */
    public void agregarUsuario(Usuario usuario);

    /**
     * Elimina un usuario de la lista de usuarios del Chat y
     * notifica a todos los usuarios de la lista
     * @param usuario al que se quiere eliminar
     */
    public void removerUsuario(Usuario usuario);

    /**
     * Notifica a todos los usuarios que hay un nuevo usuario
     * @param usuario que se acaba de unir al Chat
     */
    public void notificarUsuarioNuevo(Usuario usuario);

    /**
     * Notifica a todos los usuarios que un usuario se ha salido del Chat
     * @param usuario que se sale del Chat
     */
    public void notificarUsuarioRemovido(Usuario usuario);

    /**
     * Notifica a todos los usuarios que un usuarios envio un mensaje
     * @param mensaje que envio el usuario
     * @param usuario que envio el mensaje
     */
    public void notificarMensaje(String mensaje, String usuario);
}
