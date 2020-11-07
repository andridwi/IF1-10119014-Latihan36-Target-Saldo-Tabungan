/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan36.target.saldo.tabungan;

/**
 *
 * @author USER
 */
class TargetSaldoTabungan {
      private static Double jmlBunga;
    private static int lama;
    
    private static double hitungBunga(double bunga, int saldo){
        jmlBunga = (bunga / 100) * saldo;
        return jmlBunga;
    }
    
    public static void tampilSaldo(double bunga, int saldo, int targetSaldo){
        lama = 1;
        while(saldo < targetSaldo) {
            saldo += hitungBunga(bunga, saldo);
            System.out.printf("Saldo di bulan ke-" + lama +" RP. %,d%n", saldo);
            lama++;
        }
    }  
}
