
package Com.lingkaran;


public class SetLingkaran implements Lingkaran {
   double hasil;
    public SetLingkaran(){
        hasil = 0;
    }
    @Override
    public void hitungLuas() {
        hasil = (panjang * lebar) - (Math.PI *(panjang/2) * (panjang/2) /2);
    }
    @Override
    public void tampilkanLuas(){
        System.out.println("Luasnya adalah : " + this.getHasil());
    }
    
    public double getHasil(){
        return hasil;
    }
    
    
}
