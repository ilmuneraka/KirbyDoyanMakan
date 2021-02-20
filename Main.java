package KirbyDoyanMakan;

public class Main {

    public static void main(String[] args) {
        Kirby[] fighter = new Kirby[4]; //array of objects
        fighter[0] = new KirbyAir();
        fighter[0].setNama("Kirby Katara");
        fighter[1] = new KirbyAngin();
        fighter[1].setNama("Kirby Aang");
        fighter[2] = new KirbyApi();
        fighter[2].setNama("Kirby Zuko");
        fighter[3] = new KirbyTanah();
        fighter[3].setNama("Kirby Toph");
        int max = 3;
        int min = 0;
        int range = max - min + 1;
        //^^^^^^ polymorphism ^^^^^
        int survivor = 4;
        while (survivor != 1) { //kondisi agar tidak berhenti sebelum ada 1 pemenang terakhir
            int random1 = (int) (Math.random() * range) + min;
            int random2 = (int) (Math.random() * range) + min;
            if (random1 != random2 && fighter[random1].isAlive() == true && fighter[random2].isAlive() == true) {
                fighter[random1].serang(fighter[random2]);
                survivor = 0;
                for (int i = 0; i < fighter.length; i++) {
                    if (fighter[i].isAlive() == true) {
                        survivor++;
                    }
                }
                System.out.println("<<<<< Survivor: " + survivor + " >>>>>\n");
            }
            

        }
        System.out.print("***** PEMENANGNYA ADALAH ");
        for (int i = 0; i < fighter.length; i++) {
            if (fighter[i].isAlive() == true) {
                System.out.println(fighter[i].getNama() + " *****");
            }
        }
        System.out.println("[[[ KONDISI SETELAH PERTANDINGAN ]]]");
        for (int i = 0; i < fighter.length; i++) {
            fighter[i].info();
        }
    }
}
