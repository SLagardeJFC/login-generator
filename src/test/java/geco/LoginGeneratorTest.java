package geco;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class LoginGeneratorTest {
    private LoginService ls;
    private LoginGenerator lg;
    @Before
    public void setUp() throws Exception {
        //super.setUp();
        final String [] c = new String[3];
        c[0] = "coucou";
        c[1] = "coucou2";
        c[2] = "coucou3";
        ls = new LoginService(c);
        lg = new LoginGenerator(ls);
    }

    @Test
    public void testGenerateLoginForNomAndPrenom() {
        String usr = "SLAG";
        String res = lg.generateLoginForNomAndPrenom("lagarde","sylvain");
        assertEquals(res,usr);
        String usr1 = "SLAG1";
        String res1 = lg.generateLoginForNomAndPrenom("lagarde","sylvain");
        assertEquals(res1,usr1);
    }

}