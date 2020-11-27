package geco;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

//STARTING TESTING CLASS
public class LoginServiceTest {
    private LoginService ls;
    @Before
    public void setUp() throws Exception {
        //super.setUp();
        final String [] c = new String[3];
        c[0] = "coucou";
        c[1] = "coucou2";
        c[2] = "coucou3";
        ls = new LoginService(c);

    }
    @Test
    public void testLoginExists() {
        assertTrue(ls.loginExists("coucou"));
        assertFalse(ls.loginExists("coco"));
    }
    @Test
    public void testAddLogin() {
        ls.addLogin("coucou4");
        assertTrue(ls.loginExists("coucou4"));
        assertFalse(ls.loginExists("coco"));
    }
    @Test
    public void testFindAllLoginsStartingWith() {
        assertEquals(3,ls.findAllLoginsStartingWith("coucou").size());
    }
    @Test
    public void testFindAllLogins() {
        assertEquals(3,ls.findAllLogins().size());
    }

    @Test
    public void loginExists() {
    }

    @Test
    public void addLogin() {
    }

    @Test
    public void findAllLoginsStartingWith() {
    }

    @Test
    public void findAllLogins() {
    }
}
