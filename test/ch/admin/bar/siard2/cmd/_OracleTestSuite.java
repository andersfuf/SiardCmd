package ch.admin.bar.siard2.cmd;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	OracleFromDbTester.class,
	OracleToDbTester.class
})
public class _OracleTestSuite {

}
