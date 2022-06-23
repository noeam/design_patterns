public abstract class Usuario implements Observador{
    String nombre;
    Chat chat;
    Idioma idioma;

    /**
     * Obtencion del nombre del Usuario
     * @return nombre, el nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Envia un mensaje al Chat a la vez que se le notifica a todos
     * los usuarios .
     * @param mensaje que quiere quiere enviar un Usuario
     *                al Chat
     */
    public void mensajear(String mensaje){
        chat.notificarMensaje(mensaje, this.getNombre());
    }

    /**
     * Notifica a todos los usuarios que hay un nuevo usuario
     * utilizando el idioma del usuario a notificar
     * @param usuario que se acaba de unir al Chat
     */
    @Override
    public void notificarUsuarioNuevo(Usuario usuario){
        idioma.notificarUsuarioNuevo(usuario, this.nombre);
    }

    /**
     * Notifica a todos los usuarios que un usuario se ha salido del Chat
     * utilizando el idioma del usuario a notificar
     * @param usuario que se sale del Chat
     */
    public void notificarUsuarioRemovido(Usuario usuario){
        idioma.notificarUsuarioRemovido(usuario, this.nombre);
    }

    /**
     * Notifica a todos los usuarios que un usuarios envio un mensaje
     * utilizando el idioma del usuario a notificar
     * @param mensaje que envio el usuario
     * @param nombre del usuario que envia el mensaje
     */
    public void notificarMensaje(String mensaje, String nombre){
        idioma.notificarMensaje(mensaje, nombre, this.nombre);
    }

}
