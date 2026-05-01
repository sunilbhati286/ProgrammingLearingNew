package Encapsulation;

public class Lab26WithoutEncapsulation {
    public static void main(String[] args) {
        VwoLogin vwoLogin = new VwoLogin("Sunil@123", "Sunil Bhati");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "SalmanKhan";
        System.out.println(vwoLogin.password);


    }

    static class VwoLogin {
        String username;
        String password;

        public VwoLogin(String pwd, String usr) {
            this.password = pwd;
            this.username = usr;
        }
    }
}
