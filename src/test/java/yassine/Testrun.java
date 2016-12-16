package yassine;
import junit.framework.Test;
import junit.framework.TestSuite;

public class Testrun {

  
    public static Test suite() {

        TestSuite suite = new TestSuite();
  
	suite.addTestSuite(Testcalcule.class);
	//suite.addTest(AnotherTestSuite.suite());

	return suite;
    }

    /**
     * Runs the test suite using the textual runner.
     */
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}
