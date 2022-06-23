import java.util.ArrayList;
import java.util.List;

/**
*Clase Builder. clase constructora de los ejercitos 
*/
public class Builder {
    
    /**
    *Construye al ejercito explorador conformado por 3 pelotones
    *@return el Ejercito Explorador 
    */
    public Ejercito ejercitoExplorador(){
        Ejercito ejercito = new Ejercito();
        Enemigo enemigo = new Enemigo();
        //Construye peloton1. Seis infanteria
        List<Soldado> soldados1 = new ArrayList<>();
        Soldado infante1 = new SoldadoInfanteria(11,"Enrique", enemigo);
        Soldado infante2 = new SoldadoInfanteria(12,"Pablo", enemigo);
        Soldado infante3 = new SoldadoInfanteria(13,"Pedro", enemigo);
        Soldado infante4 = new SoldadoInfanteria(14,"Omar", enemigo);
        Soldado infante5 = new SoldadoInfanteria(15,"Ivan", enemigo);
        soldados1.add(infante1);
        soldados1.add(infante2);
        soldados1.add(infante3);
        soldados1.add(infante4);
        soldados1.add(infante5);
        Comandante comandante1 = new Comandante(1, "Edgar", new SoldadoInfanteria(), soldados1, enemigo);
        ejercito.agregaPeloton(comandante1);

        //Construye peloton 2. Dos caballeros y un artillero (comandante)
        List<Soldado> soldados2 = new ArrayList<>();
        Soldado caballero1 = new SoldadoCaballeria(16,"Enrique", enemigo);
        Soldado caballero2 = new SoldadoCaballeria(17,"Gabriel", enemigo);
        soldados2.add(caballero1);
        soldados2.add(caballero2);
        Comandante comandante2 = new Comandante(2, "Noe", new SoldadoArtilleria(), soldados2, enemigo);
        ejercito.agregaPeloton(comandante2);

        //Construye peloton3. Seis caballeria
        List<Soldado> soldados3 = new ArrayList<>();
        Soldado caballero11 = new SoldadoCaballeria(18,"Omar", enemigo);
        Soldado caballero12 = new SoldadoCaballeria(19,"Marco", enemigo);
        Soldado caballero13 = new SoldadoCaballeria(20,"Daniel", enemigo);
        Soldado caballero14 = new SoldadoCaballeria(21,"Diego", enemigo);
        Soldado caballero15 = new SoldadoCaballeria(22,"Esteban",enemigo);
        soldados3.add(caballero11);
        soldados3.add(caballero12);
        soldados3.add(caballero13);
        soldados3.add(caballero14);
        soldados3.add(caballero15);
        Comandante comandante3 = new Comandante(3, "Luis", new SoldadoCaballeria(), soldados3, enemigo);
        ejercito.agregaPeloton(comandante3);
        return ejercito;
    }

    /**
    *Construye al ejercito deafult conformado por 3 pelotones
    *@return el Ejercito Default
    */
    public Ejercito ejercitoDefault(){
        Enemigo enemigo = new Enemigo();
        List<Soldado> soldados1 = new ArrayList<Soldado>();
        Ejercito ejercito = new Ejercito();
        //Primer peloton 6 soldados de infanteria
        Soldado infante1 = new SoldadoInfanteria(001, "Pedrito", enemigo);
        Soldado infante2 = new SoldadoInfanteria(002, "Juanito", enemigo);
        Soldado infante3 = new SoldadoInfanteria(003, "Jaimito", enemigo);
        Soldado infante4 = new SoldadoInfanteria(004, "Carlitos", enemigo);
        Soldado infante5 = new SoldadoInfanteria(005, "Alex", enemigo);
        soldados1.add(infante1);
        soldados1.add(infante2);
        soldados1.add(infante3);
        soldados1.add(infante4);
        soldados1.add(infante5);
        Comandante comandante1 = new Comandante(006, "Fulanito", new SoldadoInfanteria(), soldados1, enemigo);
        ejercito.agregaPeloton(comandante1);
        //Segundo peloton son 3 artilleros
        List<Soldado> soldados2 = new ArrayList<Soldado>();
        Soldado artillero1 = new SoldadoArtilleria(01, "Arturo", enemigo);
        Soldado artillero2 = new SoldadoArtilleria(03, "Armando", enemigo);
        soldados2.add(artillero1);
        soldados2.add(artillero2);
        Comandante comandante2 = new Comandante(02, "Fernando", new SoldadoArtilleria(), soldados2, enemigo);
        ejercito.agregaPeloton(comandante2);
        //tercer peloton son 6 de caballeria
        List<Soldado> soldados3 = new ArrayList<Soldado>();
        Soldado caballero1 = new SoldadoCaballeria(21,"Dani", enemigo);
        Soldado caballero2 = new SoldadoCaballeria(22,"Damian", enemigo);
        Soldado caballero3 = new SoldadoCaballeria(23,"Sebastian", enemigo);
        Soldado caballero4 = new SoldadoCaballeria(24,"Lucas", enemigo);
        Soldado caballero5 = new SoldadoCaballeria(26,"Jose", enemigo);
        soldados3.add(caballero1);
        soldados3.add(caballero2);
        soldados3.add(caballero3);
        soldados3.add(caballero4);
        soldados3.add(caballero5);
        Comandante comandante3 = new Comandante(25, "Oscar", new SoldadoCaballeria(), soldados3, enemigo);
        ejercito.agregaPeloton(comandante3);
        return ejercito;
    }

    /**
    *Construye al ejercito kamikaze conformado por 3 pelotones
    *@return el Ejercito Kamikaze
    */
    public Ejercito ejercitoKamikaze(){
        Ejercito ejercito = new Ejercito();
        Enemigo enemigo =  new Enemigo();
        //primer peloton son 5 infantes
        List<Soldado> soldados1 = new ArrayList<Soldado>();
        Soldado infante1 = new SoldadoInfanteria(101,"Hector", enemigo);
        Soldado infante2 = new SoldadoInfanteria(102,"Tomas", enemigo);
        Soldado infante3 = new SoldadoInfanteria(104,"Eduardo", enemigo);
        Soldado infante4 = new SoldadoInfanteria(105,"Camilo", enemigo);
        soldados1.add(infante1);
        soldados1.add(infante2);
        soldados1.add(infante3);
        soldados1.add(infante4);
        Comandante comandante1 = new Comandante(103, "Pepe", new SoldadoInfanteria(), soldados1, enemigo);
        ejercito.agregaPeloton(comandante1);
        //segundo peloton son 5 infantes
        List<Soldado> soldados2 = new ArrayList<Soldado>();
        Soldado infante5 = new SoldadoInfanteria(201,"Ramon", enemigo);
        Soldado infante6 = new SoldadoInfanteria(202,"Emilio", enemigo);
        Soldado infante7 = new SoldadoInfanteria(203,"Saul", enemigo);
        Soldado infante8 = new SoldadoInfanteria(205,"Felipe", enemigo);
        soldados2.add(infante5);
        soldados2.add(infante6);
        soldados2.add(infante7);
        soldados2.add(infante8);
        Comandante comandante2 = new Comandante(204, "Diego", new SoldadoInfanteria(), soldados2, enemigo);
        ejercito.agregaPeloton(comandante2);
        //tercer peloton son 5 de caballeria
        List<Soldado> soldados3 = new ArrayList<Soldado>();
        Soldado caballero1 = new SoldadoCaballeria(500, "Adrian", enemigo);
        Soldado caballero2 = new SoldadoCaballeria(503, "Gonzalo", enemigo);
        Soldado caballero3 = new SoldadoCaballeria(504, "Benito", enemigo);
        Soldado caballero4 = new SoldadoCaballeria(505, "Alejandro", enemigo);
        soldados3.add(caballero1);
        soldados3.add(caballero2);
        soldados3.add(caballero3);
        soldados3.add(caballero4);
        Comandante comandante3 = new Comandante(502, "Angel", new SoldadoCaballeria(), soldados3, enemigo);
        ejercito.agregaPeloton(comandante3);
        return ejercito;
    }
}
