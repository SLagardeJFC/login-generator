package geco;

import java.util.Random;

public class PasswordGenerator {

    private LoginService loginService;
    private String AtoZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public PasswordGenerator(LoginService loginService){
        this.loginService=loginService;
    }

    public String generatePassword(){
        StringBuilder s = new StringBuilder();
        Random rand=new Random();
        int r = rand.nextInt(36);

        for (int i = 0 ; i<=7 ; i++ ) {
            s.append(AtoZ.charAt(r));
        }

        return s.toString();
    }

}
