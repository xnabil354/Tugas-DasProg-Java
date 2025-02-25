public class Method {
    public static void main(String[] args) {
         class Mobil {
             String merk;
             int tahun;
             String orang;

             public void infoMobil() {
                 System.out.println("Merek Mobil : " + merk);
                 System.out.println("Tahun Mobil : " + tahun);
                 System.out.println("Driver : " + orang);
             }
         }

         // Program Class Kalkulator
         class operasi {
             public int tambah(int a, int b) {
                 return a + b;
             }
         }

         // Pemanggilan Kalkulator Operasi
        try {
            operasi kalkulator = new operasi();
            int hasilTambah = kalkulator.tambah(10, 5);
            System.out.println(hasilTambah);

            // Pemanggilan Merek Tahun Mobil
            Mobil mobilSaya = new Mobil();
            mobilSaya.merk = "kawasaki";
            mobilSaya.tahun = 2023;
            mobilSaya.orang = "Nabil";
            mobilSaya.infoMobil();
        } catch (Exception e) {
            System.out.println("Program Error : " + e.getMessage());
        }


    }
}
