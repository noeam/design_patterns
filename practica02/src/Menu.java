/**
 * Clase Menu que funciono para hacer mas flexible y legible la clase main (WaySub).
 * En esta clase se crean metodos para imprimir menus, generar tickets y preparar Baguettes.
 * @author noeam Agosto 2020
 */
public class Menu {

    /**
     * Metodo que imprime el Menu Principal
     */
    public static void menu(){
        System.out.println("\n-----------MENU PRINCIPAL--------------------");
        System.out.println("¿Que quieres degustar hoy?\n"
                +"1 -> Baguette\n"
                +"2 -> Pizza\n"
                +"0 -> Salir");
    }

    /**
     * Metodo que imprime el menu de Panes
     * en caso de estar preparando un Baguette
     */
    public static void menuBaguette(){
        System.out.println("\nQuieres Baguette");
        System.out.println("¿Que tipo de pan quieres?\n"
                +"1 -> Pan Blanco\n"
                +"2 -> Pan Integral\n"
                +"3 -> Pan Parmesano\n"
                +"4 -> Pan de Avena\n"
                +"0 -> Regresar al Menu Principal");
    }

    /**
     * Metodo que imprime el menu de Pizzas que ofrece la tienda
     */
    public static void menuPizza(){
        System.out.println("\nQuieres Pizza");
        System.out.println("¿Cual de nuestras 5 pizzas te gustaria probar?\n"
                +"1 -> Pizza Don Cangrejo\n"
                +"2 -> Pizza Bob Esponja\n"
                +"3 -> Pizza Arenita\n"
                +"4 -> Pizza Texana\n"
                +"5 -> Pizza Mexicana\n"
                +"0 -> Regresar al Menu Principal");
    }

    /**
     * Metodo que imprime el menu de Ingredientes
     * que se pueden agregar en un Baguette
     */
    public static void menuIngredientes(){
        System.out.println("Selecciona los ingredientes de tu Baguette\n"
                +"1 -> Pollo\n"
                +"2 -> Pepperoni\n"
                +"3 -> Jamon\n"
                +"4 -> Lechuga\n"
                +"5 -> Jitomate\n"
                +"6 -> Cebolla\n"
                +"7 -> Mostaza\n"
                +"8 -> Catsup\n"
                +"9 -> Mayonesa\n"
                +"0 -> Terminar pedido");
    }

    /**
     * Metodo que imprime el ticket de un alimento
     * describiendo los ingredientes del mismo y su costo
     * @param alimento que se compra
     */
    public static void ticket(Baguette alimento){
        System.out.println("------------------------TICKET--------------------------\n"+
                alimento.getDescripcion() + "\n"+"PRECIO:$" + alimento.costo()+"\n\n");
    }

    /**
     * Metodo que permite preparar un Baguette seleccionando los ingredientes que se le quieren agregar
     * @param ingrediente que se quiere agregar
     * @param alimento al que se le quiere agregar el ingrediente
     * @return el alimento con el ingrediente agregado
     */
    public static Baguette preparaBaguette(int ingrediente, Baguette alimento){
        Baguette baguette = alimento;
        switch(ingrediente) {
            case 1:
                System.out.println("Pollo\n");
                baguette = new Pollo(baguette);
                break;
            case 2:
                System.out.println("Pepperoni\n");
                baguette = new Pepperoni(baguette);
                break;
            case 3:
                System.out.println("Jamon\n");
                baguette = new Jamon(baguette);
                break;
            case 4:
                System.out.println("Lechuga\n");
                baguette = new Lechuga(baguette);
                break;
            case 5:
                System.out.println("Jitomate\n");
                baguette = new Jitomate(baguette);
                break;
            case 6:
                System.out.println("Cebolla\n");
                baguette = new Cebolla(baguette);
                break;
            case 7:
                System.out.println("Mostaza\n");
                baguette = new Mostaza(baguette);
                break;
            case 8:
                System.out.println("Catsup\n");
                baguette = new Catsup(baguette);
                break;
            case 9:
                System.out.println("Mayonesa\n");
                baguette = new Mayonesa(baguette);
                break;
            default:
                break;
        }
        baguette = baguette;
        return baguette;
    }

}

