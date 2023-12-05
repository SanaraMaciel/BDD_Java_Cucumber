package acceptance.steps;

import br.com.sanara.leilao.model.Lance;
import br.com.sanara.leilao.model.Leilao;
import br.com.sanara.leilao.model.Usuario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.math.BigDecimal;

public class PropondoLanceSteps {

    private Leilao leilao;
    private Lance lance;

    @Dado("um lance valido")
    public void dado_um_lance_valido() {
        Usuario usuario = new Usuario("fulano");
        lance = new Lance(usuario, BigDecimal.TEN);
    }

    @Quando("propoe o lance")
    public void quando_propoe_o_lance() {
        leilao = new Leilao("Tablet XPTO");
        leilao.propoe(lance);

    }

    @Entao("o lance eh aceito")
    public void entao_o_lance_eh_aceito() {
        Assert.assertEquals(1, leilao.getLances().size());
        Assert.assertEquals(BigDecimal.TEN, leilao.getLances().get(0).getValor());
    }

}
