/**
 * Implementacion y prueba de los metodos y clases.
 * Simulacion directa de 6 Usuarios que reciben notificaciones
 * por las acciones generadas por parte de otro Usuario
 */
public class Main {
    public static void main(String[] args) {
        Chat telegram = new Chat();

        System.out.println("-------------AGREGANDO USUARIOS-------------");

        Usuario mexicano = new UsuarioMexico("Jose-Mex", telegram);
        System.out.println("\n " + "\n");
        Usuario espaniola = new UsuarioEspania("Isabel-Esp", telegram);
        System.out.println("\n " + "\n");
        Usuario ingles = new UsuarioInglaterra("Harry-Ing", telegram);
        System.out.println("\n " + "\n");
        Usuario mexicana = new UsuarioMexico("Maria-Mex", telegram);
        System.out.println("\n " + "\n");
        Usuario espaniol = new UsuarioEspania("Antonio-Esp", telegram);
        System.out.println("\n " + "\n");
        Usuario inglesa = new UsuarioInglaterra("Hermione-Ing", telegram);
        System.out.println("\n " + "\n");

        System.out.println("-------------ENVIANDO MENSAJE-------------");

        mexicano.mensajear("Que vivan los patrones de diseño :v");
        System.out.println("\n " + "\n");

        System.out.println("-------------USUARIO ABANDONA CHAT-------------");
        telegram.removerUsuario(mexicano);
        System.out.println("\n " + "\n");
        telegram.removerUsuario(inglesa);

    }
}
