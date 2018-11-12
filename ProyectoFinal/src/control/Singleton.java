

package control;

import windows.Recuperar;
import windows.Signin;
import windows.acercade;

public class Singleton {

    private static Signin sg = null;
    private static acercade acd = null;
    private static Recuperar rp = null;
    
    private Singleton() {}

    public static Signin getSg() {
        return sg;
    }

    public static void setSg(Signin sg) {
        Singleton.sg = sg;
    }

    public static acercade getAcd() {
        return acd;
    }

    public static void setAcd(acercade acd) {
        Singleton.acd = acd;
    }

    public static Recuperar getRp() {
        return rp;
    }

    public static void setRp(Recuperar rp) {
        Singleton.rp = rp;
    }
    
    public static Signin getIntance() {
        
        if(sg == null) {
            sg = new Signin();
            sg.setVisible(true);
        }else {
            sg.requestFocus();
        }
        
        return sg;
    }
    
    public static acercade getInstanceAcd() {
        if(acd == null) {
            acd = new acercade();
            acd.setVisible(true);
        }
        return acd;
    } 
    
    public static Recuperar getInstanceRp() {
        if(rp == null) {
            rp = new Recuperar();
            rp.setVisible(true);
        }else {
            rp.requestFocus();
        }
        return rp;
    }
}
