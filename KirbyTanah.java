package KirbyDoyanMakan;

public class KirbyTanah extends Kirby {

    public KirbyTanah() {
        super();
        super.setElemen("Tanah");
    }
    @Override
    public void serang(Kirby korban) {
        if (this.isAlive() == true && korban.isAlive() == true) {
            System.out.println("!!" + getNama() + " menyerang " + korban.getNama() + " dengan gempa bumi!!");
            super.serang(korban);
            System.out.println("Terserang: ");
            korban.info();
        }

    }
}
