/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import javax.swing.JOptionPane;

/**
 *
 * @author CeRaL
 */
abstract class Password { //soyut sınıf oluşturuldu
    public static String mesaj = "Kullanıcı Adı veya Şifre Hatalı";
    
    private final String ak_adi;
    private final String asifre;
    
    private final String dk_adi;
    private final String dsifre;
    
    private final String sk_adi;
    private final String ssifre;
    
    public Password () { //soyut sınıfın constructor ı oluşturuldu
        ak_adi = "admin";
        asifre = "admin";
        
        dk_adi = "doktor";
        dsifre = "doktor";
        
        sk_adi = "sekreter";
        ssifre = "sekreter";
    }

    public String getAk_adi() { //private ddeğişkenler için getter lar oluşturuldu.
        return ak_adi;
    }

    public String getAsifre() {
        return asifre;
    }

    public String getDk_adi() {
        return dk_adi;
    }

    public String getDsifre() {
        return dsifre;
    }

    public String getSk_adi() {
        return sk_adi;
    }

    public String getSsifre() {
        return ssifre;
    }
    
    public abstract void giris(); //soyut sınıfın soyut metodu.
    
}
