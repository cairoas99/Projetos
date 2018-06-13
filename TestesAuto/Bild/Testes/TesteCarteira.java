package bild.Testes;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/bild/Features/010_Carteira.feature",
        glue = { "" },
        monochrome = true,
        dryRun = false,
        tags = {"@Tag2"}
)
public class TesteCarteira {

}