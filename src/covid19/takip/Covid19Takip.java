package covid19.takip;

import javax.swing.JFrame;

public class Covid19Takip {


    public static void main(String[] args) {
       ekran pencere2=new ekran();
       duzen pencere3=new duzen();
       kayit pencere4=new kayit();
       giris pencere=new giris();
       pencere.setVisible(true);
       pencere.setTitle("Covid19 Takip Sistemi");
       pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pencere.setLocationRelativeTo(null);
    }
    
}
