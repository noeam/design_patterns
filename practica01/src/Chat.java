import java.util.ArrayList;
import java.util.List;

/**
 * Representa un ambiente Chat en el que existen usuarios
 * que pueden mandar mensajes y entablar conversación.
 */
public class Chat implements Sujeto {

    List<Usuario> usuarios = new ArrayList<>();

    /**
     * Constructor por omision
     */
    public Chat(){
    }

    /**
     * Obtencion de la lista de usuarios
     * @return usuarios, la lista de usuarios que contiene
     *                  a los participantes en el chat
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Se establece la lista de usuarios del Chat
     * @param usuarios que interactuan en el Chat
     */
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * Agrega un usuario a la lista de usuarios del Chat y
     * notifica a todos los usuarios de la lista
     * @param usuario al que se quiere agregar a la lista
     */
    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
        notificarUsuarioNuevo(usuario);
    }

    /**
     * Elimina un usuario de la lista de usuarios del Chat y
     * notifica a todos los usuarios de la lista
     * @param usuario al que se quiere eliminar
     */
    public void removerUsuario(Usuario usuario){
        usuarios.remove(usuario);
        notificarUsuarioRemovido(usuario);
    }

    /**
     * Notifica a todos los usuarios que hay un nuevo usuario
     * @param usuario que se acaba de unir al Chat
     */
    public void notificarUsuarioNuevo(Usuario usuario){
        for(Usuario user : usuarios){
            user.notificarUsuarioNuevo(usuario);
        }
    }

    /**
     * Notifica a todos los usuarios que un usuario se ha salido del Chat
     * @param usuario que se sale del Chat
     */
    public void notificarUsuarioRemovido(Usuario usuario){
        for(Usuario user : usuarios){
            user.notificarUsuarioRemovido(usuario);
        }
    }

    /**
     * Notifica a todos los usuarios que un usuarios envio un mensaje
     * @param mensaje que envio el usuario
     * @param usuario que envio el mensaje
     */
    public void notificarMensaje(String mensaje, String usuario){
        for(Usuario user : usuarios){
            user.notificarMensaje(mensaje, usuario);
        }
    }

}
