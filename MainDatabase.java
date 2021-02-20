package KirbyDoyanMakan;

import java.util.Scanner;

public class MainDatabase {

    public static void main(String[] args) {
        Database db = new Database();

        System.out.println("*********************");
        System.out.println("KIRBY TEAM DEATHMATCH");
        System.out.println("*********************\n");

        Scanner in = new Scanner(System.in);

        System.out.println("Fighters list:");
        for (int i = 0; i < db.fighter.length; i++) {
            System.out.println((i + 1) + ". " + db.fighter[i].getNama() + " (" + db.fighter[i].getElemen() + ")");
        }

        System.out.println("\nSIAPA YANG AKAN BERTANDING?");
        String input = in.nextLine();
        System.out.println("===========================");
        String tim[];
        tim = input.split(" vs ");

        String[][] anggota = new String[tim.length][];
        Kirby[][] fighters = new Kirby[tim.length][];

        for (int i = 0; i < anggota.length; i++) {
            String anggotaSplit[] = tim[i].split(", ");
            anggota[i] = new String[anggotaSplit.length];
            fighters[i] = new Kirby[anggotaSplit.length];
//            System.out.println("Tim ke-" + (i+1));
            for (int j = 0; j < anggotaSplit.length; j++) {
                anggota[i][j] = anggotaSplit[j];
                for (int k = 0; k < db.fighter.length; k++) {
                    if (anggota[i][j].equalsIgnoreCase(db.fighter[k].getNama())) {
                        fighters[i][j] = new Kirby();
                        fighters[i][j] = db.fighter[k];
                    }
                }
//                System.out.println("Anggota ke-" + (j+1) + ": " + fighters[i][j].getNama());
            }
        }

        boolean lanjut = true;
        for (int i = 0; i < anggota.length; i++) {
            for (int j = i + 1; j < anggota.length; j++) {
                for (int k = 0; k < anggota[i].length; k++) {
                    for (int l = 0; l < anggota[j].length; l++) {
                        if (anggota[i][k].equalsIgnoreCase(anggota[j][l])) {
                            System.out.println("!!! Tidak boleh ada Kirby yang sama !!!");
                            lanjut = false;
                        }
                    }
                }
            }
        }
        if (lanjut == true) {
            int jumlahTim = fighters.length;
            while (jumlahTim != 1) {
                int randomTim1 = (int) (Math.random() * fighters.length);
                int randomTim2 = (int) (Math.random() * fighters.length);
                int random1 = (int) (Math.random() * fighters[randomTim1].length);
                int random2 = (int) (Math.random() * fighters[randomTim2].length);
                if (randomTim1 != randomTim2 && fighters[randomTim1][random1].isAlive() == true && fighters[randomTim2][random2].isAlive() == true) {
                    fighters[randomTim1][random1].serang(fighters[randomTim2][random2]);
                    int survivorTim;
                    jumlahTim = fighters.length;
                    for (int i = 0; i < fighters.length; i++) {
                        survivorTim = 0;
                        for (int j = 0; j < fighters[i].length; j++) {
                            if (fighters[i][j].isAlive() == true) {
                                survivorTim += 1;
                            }
                        }
                        if (survivorTim == 0) {
                            jumlahTim -= 1;
                        }
                    }
                    System.out.println("<<< Jumlah tim = " + jumlahTim + " >>>");
                }

            }
            System.out.print("^^^ PEMENANGNYA ADALAH ");
            for (int i = 0; i < fighters.length; i++) {
                for (int j = 0; j < fighters[i].length; j++) {
                    if (fighters[i][j].isAlive() == true) {
                        System.out.print(fighters[i][j].getNama() + " ");
                    }
                }
            }
            System.out.println("^^^\n");
            System.out.println("??? KONDISI PASCA PERTANDINGAN ???");
            for (int i = 0; i < fighters.length; i++) {
                for (int j = 0; j < fighters[i].length; j++) {
                    fighters[i][j].info();
                }
            }
        }

    }
}
