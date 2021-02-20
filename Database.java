package KirbyDoyanMakan;

public class Database {

    Kirby[] fighter = new Kirby[10];
    public Database() {
        fighter[0] = new KirbyAir();
        fighter[0].setNama("Katara");
        fighter[1] = new KirbyAngin();
        fighter[1].setNama("Aang");
        fighter[2] = new KirbyApi();
        fighter[2].setNama("Zuko");
        fighter[3] = new KirbyTanah();
        fighter[3].setNama("Toph");
        fighter[4] = new KirbyApi();
        fighter[4].setNama("Azula");
        fighter[5] = new KirbyTanah();
        fighter[5].setNama("The Boulder");
        fighter[6] = new KirbyAir();
        fighter[6].setNama("Master Pakku");
        fighter[7] = new KirbyApi();
        fighter[7].setNama("General Iroh");
        fighter[8] = new KirbyTanah();
        fighter[8].setNama("Long Feng");
        fighter[9] = new KirbyTanah();
        fighter[9].setNama("King Bumi");
    }
}
