package PRAK201_2110817120003_HennyKartika;
public class main {
    
    public static void main(String[] args) {
        Mangga arumanis = new Mangga("Arumanis", "hijau kekuning-kuningan", "lembut", "manis", 5000, 0.3f, 13);
        Mangga manalagi = new Mangga("Manalagi", "hijau", "kasar", "manis", 7500, 0.5f, 17);
        Mangga manggaMadu = new Mangga("Mangga Madu", "kuning", "lembut", "manis",6500, 0.375f, 12);


        arumanis.tampilkan();
        manalagi.tampilkan();
        manggaMadu.tampilkan();
    }
    
}
