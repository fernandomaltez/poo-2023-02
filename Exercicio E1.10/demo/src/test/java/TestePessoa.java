import com.example.Pessoa;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class TestePessoa {
    @Test
    public void TesteCalculo() {

        Pessoa pessoa1 = new Pessoa("Sandra", 1500, 70, 5);

        assertEquals(0, pessoa1.calculaImposto(), 0.0);
    }
}
