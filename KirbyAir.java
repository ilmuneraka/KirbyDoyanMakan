package KirbyDoyanMakan;

public class KirbyAir extends Kirby { //inheritance
    
    public KirbyAir() {
        super();
        super.setElemen("Air");
    }
    @Override
    public void serang(Kirby korban) {
        if (this.isAlive() == true && korban.isAlive() == true) { //mengecek dulu apakah keduanya masih hidup, kalo salah satu mati udah gak bisa nyerang
            System.out.println("!!" + getNama() + " menyerang " + korban.getNama() + " dengan gelombang tsunami" + "!!");
            super.serang(korban);
            System.out.println("Terserang: ");
            korban.info();
        }
    }
}
