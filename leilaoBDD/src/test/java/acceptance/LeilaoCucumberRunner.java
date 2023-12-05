package acceptance;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/** classe que faz a integração do Junit com o Cucumber */
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features")
public class LeilaoCucumberRunner {


}
