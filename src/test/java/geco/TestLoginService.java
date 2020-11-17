package geco;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestLoginService extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestLoginService( String testName )
    {
        super();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestLoginService.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
