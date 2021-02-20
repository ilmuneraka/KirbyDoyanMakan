package KirbyDoyanMakan;

public class KirbyApi extends Kirby {

    public KirbyApi() {
        super();
        super.setElemen("Api");
    }
    @Override
    public void serang(Kirby korban) {
        if (this.isAlive() == true && korban.isAlive() == true) {
            System.out.println("!!" + getNama() + " menyerang " + korban.getNama() + " dengan bola api!!");
            super.serang(korban);
            System.out.println("Terserang: ");
            korban.info();
        }

    }
}
