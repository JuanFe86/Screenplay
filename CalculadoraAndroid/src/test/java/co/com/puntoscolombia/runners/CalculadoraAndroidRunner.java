package co.com.puntoscolombia.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/calculadora_android.feature",
        glue = "co.com.puntoscolombia.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class CalculadoraAndroidRunner {
}
