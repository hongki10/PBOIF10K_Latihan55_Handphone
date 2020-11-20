/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Handphone
 */

public class Android extends Handphone {
    private String keyStore;
    
    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    
    public String getKeyStore() {
        return keyStore;
    }
    
    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
}
