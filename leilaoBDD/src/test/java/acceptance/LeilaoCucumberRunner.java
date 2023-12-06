package acceptance;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/** classe que faz a integra��o do Junit com o Cucumber */
//a tag @leilao mostra ao cumcumber que ele vai rodar apenas os testes que est�o na
// tag leilao
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@leilao")
public class LeilaoCucumberRunner {


}
