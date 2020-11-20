/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Handphone
 */

public static void main(String[] args) {
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        BlackBerry blackBerry = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        WindowsPhone windowsPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        
        android.setKeyStore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : " + android.getKeyStore());
        
        System.out.println();
        
        blackBerry.setPinBB("BHS249");
        blackBerry.displayProduct();
        System.out.println("PIN : " + blackBerry.getPinBB());
        
        System.out.println();
        
        windowsPhone.setWpKeyStore("UUUQIJWORJ");
        windowsPhone.displayProduct();
        System.out.println("Wp Key Store : " + windowsPhone.getWpKeyStore());
    }
    
}