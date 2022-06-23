import java.util.Scanner;
/**
 * Clase Main que funciono para correr la simulación del constructor de Autos.
 * @author noeam Agosto 2020
 */
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner lector = new Scanner(System.in);
        int saldo; //EL SALDO QUE TIENE EL USUARIO
        int seleccion; //Tipo de auto
        int seleccion2; //Selecciona llantas
        int seleccion3; //Selecciona motor
        int seleccion4; //Selecciona carroceria
        int seleccion5; //Selecciona blindaje
        int seleccion6; //Selecciona arma
        do {
            menu.menu();//Menu de autos
            seleccion = lector.nextInt();
            switch(seleccion) {
                case 1://Selecciona Auto Personalizado
                    saldo = 100;
                    Builder autoPersonalizado = new BuildAuto();
                    Llantas llanta = null;
                    Motor motor = null;
                    Carroceria carroceria = null;
                    Blindaje blindaje = null;
                    Arma arma = null;
                    do {
                        menu.menuLlantas();
                        seleccion2 = lector.nextInt();
                        switch(seleccion2) {
                            case 1://Selecciona Simple
                                llanta = new LlantaSimple();
                                break;
                            case 2://Selecciona Deportivas
                                llanta = new LlantaDeportiva();
                                break;
                            case 3://Selecciona Off-road
                                llanta = new LlantaOffRide();
                                break;
                            case 4://Selecciona Oruga de Tanque
                                llanta = new LlantaOruga();
                                break;
                            default:
                                System.out.println("Selecciona una opcion correcta");
                        }
                    } while((seleccion2 != 1 ) & (seleccion2 != 2) & (seleccion2 != 3) & (seleccion2 != 4));
                    //Seleccion de Motor
                    do {
                        menu.menuMotor();
                        seleccion3 = lector.nextInt();
                        switch(seleccion3) {
                            case 1://Selecciona Diesel
                                motor = new MotorDiesel();
                                break;
                            case 2://Selecciona Deportivo
                                motor = new MotorDeportivo();
                                break;
                            case 3://Selecciona Turbo
                                motor = new MotorTurbo();
                                break;
                            default:
                                System.out.println("Selecciona una opcion correcta");
                        }
                    } while((seleccion3 != 1 ) & (seleccion3 != 2) & (seleccion3 != 3));
                    //Seleccion Carroceria
                    do {
                        menu.menuCarroceria();
                        seleccion4 = lector.nextInt();
                        switch(seleccion4) {
                            case 1://Selecciona Casual
                                carroceria = new CarroceriaCasual();
                                break;
                            case 2://Selecciona Camion
                                carroceria = new CarroceriaCamion();
                                break;
                            case 3://Selecciona Deportiva
                                carroceria = new CarroceriaDeportiva();
                                break;
                            default:
                                System.out.println("Selecciona una opcion correcta");
                        }
                    } while((seleccion4 != 1 ) & (seleccion4 != 2) & (seleccion4 != 3));
                    //Seleccion Blindaje
                    do {
                        menu.menuBlindaje();
                        seleccion5 = lector.nextInt();
                        switch(seleccion5) {
                            case 1://Selecciona Simple
                                blindaje = new BlindajeSimple();
                                break;
                            case 2://Selecciona Reforzado
                                blindaje = new BlindajeReforzado();
                                break;
                            case 3://Selecciona Tanque
                                blindaje = new BlindajeTanque();
                                break;
                            default:
                                System.out.println("Selecciona una opcion correcta");
                        }
                    } while((seleccion5 != 1 ) & (seleccion5 != 2) & (seleccion5 != 3));
                    //Seleccion Armas
                    do {
                        menu.menuArma();
                        seleccion6 = lector.nextInt();
                        switch(seleccion6) {
                            case 1://Selecciona Sierra
                                arma = new ArmaSierra();
                                break;
                            case 2://Selecciona Lanzallamas
                                arma = new ArmaLanzallamas();
                                break;
                            case 3://Selecciona Caniones
                                arma = new ArmaCanion();
                                break;
                            case 4://Selecciona Arpones
                                arma = new ArmaArpon();
                                break;
                            case 5://Selecciona Metralleta
                                arma = new ArmaMetralleta();
                                break;
                            default:
                                System.out.println("Selecciona una opcion correcta");
                        }
                    } while((seleccion6 != 1 ) & (seleccion6 != 2) & (seleccion6 != 3) & (seleccion6 != 4) & (seleccion6 != 5));
                    autoPersonalizado.setLlantas(llanta);
                    autoPersonalizado.setMotor(motor);
                    autoPersonalizado.setCarroceria(carroceria);
                    autoPersonalizado.setBlindaje(blindaje);
                    autoPersonalizado.setArma(arma);
                    Auto autoConstruido = autoPersonalizado.build();
                    System.out.println(autoConstruido.getDescripcion());
                    System.out.println("Tu saldo era: $" + saldo+", tu nuevo saldo es de $"+(saldo- autoConstruido.costo));
                    break;
                case 2://Selecciona Auto Normal
                    saldo = 100;
                    Builder autoNormal = new BuildAuto();//Utilizo constructor por omision
                    Auto autoConstruido0 = autoNormal.build();
                    System.out.println(autoConstruido0.getDescripcion());
                    System.out.println("Tu saldo era: $" + saldo+", tu nuevo saldo es de $"+(saldo- autoConstruido0.costo));
                    break;
                case 3://Selecciona Auto de Batalla
                    saldo = 100;
                    Builder autoBatalla = new BuildAuto();
                    Llantas llanta1 = new LlantaOffRide();
                    Motor motor1 = new MotorDeportivo();
                    Carroceria carroceria1 = new CarroceriaDeportiva();
                    Blindaje blindaje1 = new BlindajeReforzado();
                    Arma arma1 = new ArmaLanzallamas();
                    autoBatalla.setLlantas(llanta1);
                    autoBatalla.setMotor(motor1);
                    autoBatalla.setCarroceria(carroceria1);
                    autoBatalla.setBlindaje(blindaje1);
                    autoBatalla.setArma(arma1);
                    Auto autoConstruido1 = autoBatalla.build();
                    System.out.println(autoConstruido1.getDescripcion());
                    System.out.println("Tu saldo era: $" + saldo+", tu nuevo saldo es de $"+(saldo- autoConstruido1.costo));
                    break;
                case 4://Selecciona Auto Monstruoso
                    saldo = 100;
                    Builder autoMonstruo = new BuildAuto();
                    Llantas llanta2 = new LlantaOruga();
                    Motor motor2 = new MotorTurbo();
                    Carroceria carroceria2 = new CarroceriaCamion();
                    Blindaje blindaje2 = new BlindajeTanque();
                    Arma arma2 = new ArmaMetralleta();
                    autoMonstruo.setLlantas(llanta2);
                    autoMonstruo.setMotor(motor2);
                    autoMonstruo.setCarroceria(carroceria2);
                    autoMonstruo.setBlindaje(blindaje2);
                    autoMonstruo.setArma(arma2);
                    Auto autoConstruido2 = autoMonstruo.build();
                    System.out.println(autoConstruido2.getDescripcion());
                    System.out.println("Tu saldo era: $" + saldo+", tu nuevo saldo es de $"+(saldo- autoConstruido2.costo));
                    break;
                case 0://Salir de la simulacion
                    seleccion = 0;
                    break;
                default:
                    System.out.println("Elige una opcion correcta");
            }
        }
        while (seleccion != 0);
        System.out.println("ADIOSSSSS\nFue un gusto construir autos contigo :D");
    }
}
