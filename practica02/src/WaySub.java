import java.util.Scanner;
/**
 * Clase principal que simula la funcion de una tienda de Baguettes y Pizzas
 * @author noeam Agosto 2020
 */
public class WaySub {
    public static void main(String[] args) {
        Menu menu = new Menu(); // Para imprimir menus y preparar los Baguettes
        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvendid@ a WaySub");
        int seleccion; // Alimento que selecciona
        int seleccion2; // Tipo de pan para el Baguette
        int seleccion3; // El ingrediente que agrega

        do {
            menu.menu();
            seleccion = lector.nextInt();
            switch(seleccion) {

                case 1://Selecciona Baguette
                    menu.menuBaguette();
                    seleccion2 = lector.nextInt();
                    switch(seleccion2) {
                        case 1://Selecciona Pan Blanco
                            System.out.println("Pan Blanco\n");
                            Baguette baguette = new PanBlanco();
                            do {
                                menu.menuIngredientes();
                                seleccion3 = lector.nextInt();
                                baguette = menu.preparaBaguette(seleccion3, baguette);
                            }
                            while (seleccion3 != 0);
                            menu.ticket(baguette);
                            break;
                        case 2: //Selecciona Pan Integral
                            System.out.println("Pan Integral\n");
                            Baguette baguette2 = new PanIntegral();
                            do {
                                menu.menuIngredientes();
                                seleccion3 = lector.nextInt();
                                baguette2 = menu.preparaBaguette(seleccion3, baguette2);
                            }
                            while (seleccion3 != 0);
                            menu.ticket(baguette2);
                            break;
                        case 3: //Selecciona Pan Parmesano
                            System.out.println("Pan Parmesano\n");
                            Baguette baguette3 = new PanParmesano();
                            do {
                                menu.menuIngredientes();
                                seleccion3 = lector.nextInt();
                                baguette3 = menu.preparaBaguette(seleccion3, baguette3);
                            }
                            while (seleccion3 != 0);
                            menu.ticket(baguette3);
                            break;
                        case 4: //Selecciona Pan de Avena
                            System.out.println("Pan de Avena\n");
                            Baguette baguette4 = new PanAvena();
                            do {
                                menu.menuIngredientes();
                                seleccion3 = lector.nextInt();
                                baguette4 = menu.preparaBaguette(seleccion3, baguette4);
                            }
                            while (seleccion3 != 0);
                            menu.ticket(baguette4);
                            break;
                        default:
                            System.out.println("Elige una opcion valida");
                    }
                    break;

                case 2://Selecciona Pizza
                    menu.menuPizza();
                    seleccion2 = lector.nextInt();
                    switch(seleccion2) {
                        case 1:
                            System.out.println("\nPizza Don Cangrejo");
                            Pizza pizzaCangrejo = new Pizza("gruesa","manchego", "salchicha", 250);
                            Baguette pizza1 = new PizzaAdapter(pizzaCangrejo);
                            menu.ticket(pizza1);
                            break;
                        case 2:
                            System.out.println("\nPizza Bob Esponja");
                            Pizza pizzaBob = new Pizza("delgada","chedar", "pollo", 200);
                            Baguette pizza2 = new PizzaAdapter(pizzaBob);
                            menu.ticket(pizza2);
                            break;
                        case 3:
                            System.out.println("\nPizza Arenita");
                            Pizza pizzaArenita = new Pizza("delgada","manchego", "jamon", 2250);
                            Baguette pizza3 = new PizzaAdapter(pizzaArenita);
                            menu.ticket(pizza3);
                            break;
                        case 4:
                            System.out.println("\nPizza Texana");
                            Pizza pizzaTexana = new Pizza("delgada","manchego", "salchicha", 150);
                            Baguette pizza4 = new PizzaAdapter(pizzaTexana);
                            menu.ticket(pizza4);
                            break;
                        case 5:
                            System.out.println("\nPizza Mexicana");
                            Pizza pizzaMexicana = new Pizza("gruesa","chedar", "jamon", 175);
                            Baguette pizza5 = new PizzaAdapter(pizzaMexicana);
                            menu.ticket(pizza5);
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Elige una opcion valida");
                    }
                    break;

                case 0://Salir de la simulacion
                    seleccion = 0;
                    break;

                default:
                    System.out.println("Elige una opcion correcta");
            }
        }
        while (seleccion != 0);
        System.out.println("ADIOSSSSS\n Fue un gusto atenderte :D");
    }
}
