package StepDefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

@RunWith(Cucumber.class)
@CucumberOptions(
<<<<<<< HEAD:src/test/java/StepDefs/TestRunner.java
        tags = "@TESTSET_POEI23P2G4-90",
        features = "src/test/resources/features/",
=======
        tags = {"@TEST_POEI23P2G4-60"},
        features = "src/test/resources/features",
>>>>>>> 55e1ef94e88a130c74d3b00486a36d214d7d2c46:src/test/java/TestRunner.java
        glue = "",
        plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber.json" }
)
public class TestRunner {
/*    @AfterClass

    public static void ImportTestToXray() throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, InterruptedException {
        ImportResultToXray token = new ImportResultToXray();
        token.ImportToXray();
    }*/
}

