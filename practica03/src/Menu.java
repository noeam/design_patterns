/**
 * Clase Menu que funciono para hacer mas flexible y legible la clase Main.
 * En esta clase se crean metodos para imprimir menus
 * @author noeam Agosto 2020
 */
public class Menu {

    /**
     * Metodo que imprime el Menu Principal
     */
    public static void menu(){
        System.out.println("\n-----------BIENVENIDO AL CONSTRUCTOR DE AUTOS--------------------");
        System.out.println("¿Que tipo de auto te gustaria construir?\n"
                +"1 -> Auto Personalizado\n"
                +"2 -> Auto Normal\n"
                +"3 -> Auto de Batalla\n"
                +"4 -> Auto Monstruoso\n"
                +"0 -> Salir");
    }

    /**
     * Metodo que imprime el menu de Llantas
     * que se pueden agregar a un auto
     */
    public static void menuLlantas(){
        System.out.println("\nVAMOS A CONSTRUIR UN AUTO PERSONALIZADO");
        System.out.println("¿Que tipo de llantas quieres en tu auto?\n"
                +"1 -> Llantas Simples\n"
                +"2 -> Llantas Deportivas\n"
                +"3 -> Llantas off-road\n"
                +"4 -> Llantas Oruga de Tanque\n");
    }

    /**
     * Metodo que imprime el menu de Motores
     * que se pueden agregar a un auto
     */
    public static void menuMotor(){
        System.out.println("¿Que tipo de motor quieres en tu auto?\n"
                +"1 -> Diesel\n"
                +"2 -> Deportivo\n"
                +"3 -> Turbo\n");
    }

    /**
     * Metodo que imprime el menu de Carrocerias
     * que se pueden agregar a un auto
     */
    public static void menuCarroceria(){
        System.out.println("¿Que tipo de carroceria quieres en tu auto?\n"
                +"1 -> Casual\n"
                +"2 -> Camion\n"
                +"3 -> Deportiva\n");
    }

    /**
     * Metodo que imprime el menu de Blindajes
     * que se pueden agregar a un auto
     */
    public static void menuBlindaje(){
        System.out.println("¿Que tipo de blindaje quieres en tu auto?\n"
                +"1 -> Simple\n"
                +"2 -> Reforzado\n"
                +"3 -> Tanque\n");
    }

    /**
     * Metodo que imprime el menu de Armas
     * que se pueden agregar a un auto
     */
    public static void menuArma(){
        System.out.println("¿Que tipo de arma quieres en tu auto?\n"
                +"1 -> Sierra\n"
                +"2 -> Lanzallamas\n"
                +"3 -> Cañones\n"
                +"4 -> Arpones\n"
                +"5 -> Metralleta\n");
    }

}
