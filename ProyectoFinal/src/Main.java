import java.util.Scanner;
import java.util.InputMismatchException;

/**
*Clase Main. Imprime el menu de opciones e inicia el juego
*/
public class Main {
    
    /**
    *Metodo main. inicia y ejecuta el juego mostrando un menú de opciones
    */
    public static void main(String[] args) {
        Ejercito ejercito;
        int seleccion;
        int seleccion2;
        Builder builder = new Builder();
        Enemigo enemigo =  new Enemigo();
        Scanner lector = new Scanner(System.in);
        Main main = new Main();
        try{
        do {
            main.menuEjercitos();
            seleccion = lector.nextInt();
            switch(seleccion) {
                case 1://Selecciona Ejercito Explorador
                    ejercito = builder.ejercitoExplorador();
                    ejercito.presentar();
                    System.out.println("\nTienes que derrotar a un enemigo con " + enemigo.getVida() + " puntos de vida\n");
                    do {
                        main.menuAcciones();
                        seleccion2 = lector.nextInt();
                        switch(seleccion2) {
                            case 1://Selecciona Reportar ejercito
                               ejercito.presentar();
                                break;
                            case 2://Selecciona Mover ejercito
                                ejercito.mover();
                                break;
                            case 3://Selecciona Atacar ejercito
                                if (ejercito.getPelotones().get(0).getEnemigo().getVida() > 0){
                                    ejercito.ataca();
                                }else {
                                    System.out.println("¡Felicidades!, ya has vencido al enemigo.");
                                    seleccion2 = 0;
                                }
                                break;
                            case 0://Salir
                                seleccion2 = 0;
                                seleccion = 0;
                            default:
                                System.out.println("Selecciona una opcion correcta");
                        }
                    } while((seleccion2 != 0));
                    seleccion = 0;
                    break;
                case 2://Selecciona Ejercito Default
                    ejercito = builder.ejercitoDefault();
                    ejercito.presentar();
                    System.out.println("\nTienes que derrotar a un enemigo con " + enemigo.getVida() + " puntos de vida\n");
                    do {
                        main.menuAcciones();
                        seleccion2 = lector.nextInt();
                        switch(seleccion2) {
                            case 1://Selecciona Reportar ejercito
                                ejercito.presentar();
                                break;
                            case 2://Selecciona Mover ejercito
                                ejercito.mover();
                                break;
                            case 3://Selecciona Atacar ejercito
                                if (ejercito.getPelotones().get(0).getEnemigo().getVida() > 0){
                                    ejercito.ataca();
                                }else {
                                    System.out.println("¡Felicidades!, ya has vencido al enemigo.");
                                    seleccion2 = 0;
                                }
                                break;
                            case 0://Salir
                                seleccion2 = 0;
                                seleccion = 0;
                            default:
                                System.out.println("Selecciona una opcion correcta");
                        }
                    } while((seleccion2 != 0));
                    seleccion = 0;
                    break;
                case 3://Selecciona Ejercito Kamikaze
                    ejercito = builder.ejercitoKamikaze();
                    ejercito.presentar();
                    System.out.println("\nTienes que derrotar a un enemigo con " + enemigo.getVida() + " puntos de vida\n");
                    do {
                        main.menuAcciones();
                        seleccion2 = lector.nextInt();
                        switch(seleccion2) {
                            case 1://Selecciona Reportar ejercito
                                ejercito.presentar();
                                break;
                            case 2://Selecciona Mover ejercito
                                ejercito.mover();
                                break;
                            case 3://Selecciona Atacer ejercito
                                if (ejercito.getPelotones().get(0).getEnemigo().getVida() > 0){
                                    ejercito.ataca();
                                }else {
                                    System.out.println("¡Felicidades!, ya has vencido al enemigo.");
                                    seleccion2 = 0;
                                }
                                break;
                            case 0://Salir
                                seleccion2 = 0;
                                seleccion = 0;
                            default:
                                System.out.println("Selecciona una opcion correcta");
                        }
                    } while((seleccion2 != 0));
                    seleccion = 0;
                    break;
                case 0://Salir de la simulacion
                    seleccion = 0;
                    break;
                default:
                    System.out.println("Elige una opcion correcta");
            }
        }
        while (seleccion != 0);
        System.out.println("Fin del juego. Hasta luego, vuelve pronto");
        }catch(InputMismatchException e){
            System.out.println("opcion invalida");

        }

    }

    /**
    *imprime los tipos de ejercito disponibles para que el juagador pueda elegir
    */
    public void menuEjercitos() {
        System.out.println("\n-----------BIENVENIDO--------------------");
        System.out.println("¿Con que ejercito quieres jugar?\n"
                +"\n 1 -> Ejercito Explorador\n"
                +"Cuenta con 3 pelotones.\n" 
                + "Peloton 1 tienen 6 soldados de infantería.\n"
                + "Peloton 2 se compone con 1 artillero y 2 miembros de la caballeria.\n" 
                + "Peloton 3 se compone con 6 soldados, todos miembros de la caballeria.\n"
                +"\n 2 -> Ejercito Default\n"
                +"Cuenta con 3 pelotones.\n" 
                + "Peloton 1 tienen 6 soldados, todos miembros de la infanteria.\n"
                + "Peloton 2 tiene 3 artilleros.\n" 
                + "Peloton 3 tiene 6 miembros de la caballeria.\n"
                +"\n 3 -> Ejercito Kamikaze\n"
                +"Cuenta con 3 pelotones.\n" 
                + "Peloton 1 y 2 tienen 5 soldados cada uno, todos miembros de la infanteria.\n" 
                + "Peloton 3 tiene 5 soldados, todos miembros de la caballería.\n"
                +"\n0 -> Salir");
    }

    
    /**
    *Imprime el menu de acciones que el juegador puede realizar con su ejercito
    */
    public void menuAcciones() {
        System.out.println("¿Que accion deseas realizar?\n"
                +"1 -> Reportar ejercito\n"
                +"2 -> Mover ejercito\n"
                +"3 -> Atacar al enemigo\n"
                +"0 -> Salir");
    }
}