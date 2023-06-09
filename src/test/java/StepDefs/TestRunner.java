
import StepDefs.ImportResultToXray;
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
        //tags = {"@TEST_POEI23P2G4-75 "},
        features = "src/test/resources/features/GestionCompteClient.feature",
        glue = "",
        plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber.json" }
)
public class TestRunner {
    @AfterClass

    public static void ImportTestToXray() throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, InterruptedException {
        ImportResultToXray token = new ImportResultToXray();
        token.ImportToXray();

    }
}
