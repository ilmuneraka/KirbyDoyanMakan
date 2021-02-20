package KirbyDoyanMakan;

public class KirbyAngin extends Kirby {

    public KirbyAngin() {
        super();
        super.setElemen("Angin");
    }
    @Override
    public void serang(Kirby korban) {
        if (this.isAlive() == true && korban.isAlive() == true) {
            System.out.println("!!" + getNama() + " menyerang " + korban.getNama() + " dengan badai angin" + "!!");
            super.serang(korban);
            System.out.println("Terserang: ");
            korban.info();
        }

    }
}
