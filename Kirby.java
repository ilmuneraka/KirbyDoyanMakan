package KirbyDoyanMakan;

public class Kirby {

    private String nama = "Kirby";
    private int hp = 100;
    private int basicAttack = 20;
    private String elemen = "";
    private boolean alive = true; //menggunakan protected agar bisa diakses di sub class
    private int killCount = 0; //atribut tambahan

    public void statusKorban(Kirby korban) { //pengumuman pembunuhan
        if (korban.getHp() <= 0) {
            korban.setAlive(false);
            korban.setHp(0);
            System.out.println("### " + nama + " telah membunuh " + korban.nama + " ###");
            setKillCount(getKillCount() + 1);
        }
    }

    public void serang(Kirby korban) {
        int damage = 0;
        if ("Air".equals(getElemen()) && "Api".equals(korban.getElemen())) {
            System.out.println("=== CRITICAL ATTACK ==="); //tambahan
            if (korban.getHp() > 0) {
                damage = (int)(getBasicAttack() + (getBasicAttack() * Math.random()));
                korban.setHp(korban.getHp() - damage);
                statusKorban(korban);
            }
        } else if ("Api".equals(getElemen()) && "Angin".equals(korban.getElemen())) {
            System.out.println("=== CRITICAL ATTACK ===");
            if (korban.getHp() > 0) {
                damage = (int)(getBasicAttack() + (getBasicAttack() * Math.random()));
                korban.setHp(korban.getHp() - damage);
                statusKorban(korban);
            }
        } else if ("Angin".equals(getElemen()) && "Tanah".equals(korban.getElemen())) {
            System.out.println("=== CRITICAL ATTACK ===");
            if (korban.getHp() > 0) {
                damage = (int)(getBasicAttack() + (getBasicAttack() * Math.random()));
                korban.setHp(korban.getHp() - damage);
                statusKorban(korban);
            }
        } else if ("Tanah".equals(getElemen()) && "Air".equals(korban.getElemen())) {
            System.out.println("=== CRITICAL ATTACK ===");
            if (korban.getHp() > 0) {
                damage = (int)(getBasicAttack() + (getBasicAttack() * Math.random()));
                korban.setHp(korban.getHp() - damage);
                statusKorban(korban);
            }
        } else {
            if (korban.getHp() > 0) {
                damage = getBasicAttack();
                korban.setHp(korban.getHp() - damage);
                statusKorban(korban);
            }
        }
        System.out.println("Damage: " + damage);
    }

    public void info() {
        System.out.println("Nama: " + getNama());
        System.out.println("HP: " + getHp());
        System.out.println("Basic attack: " + getBasicAttack());
        if (isAlive() == true) {
            System.out.println("Alive: Yes");
        } else {
            System.out.println("Alive: No");
        }
        System.out.println("Elemen: " + getElemen());
        System.out.println("Kill count: " + getKillCount());
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getBasicAttack() {
        return basicAttack;
    }

    public void setBasicAttack(int basicAttack) {
        this.basicAttack = basicAttack;
    }

    public String getElemen() {
        return elemen;
    }

    public void setElemen(String elemen) {
        this.elemen = elemen;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getKillCount() {
        return killCount;
    }

    public void setKillCount(int killCount) {
        this.killCount = killCount;
    }
}
