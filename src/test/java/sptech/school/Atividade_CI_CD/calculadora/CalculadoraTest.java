package sptech.school.Atividade_CI_CD.calculadora;

import org.junit.jupiter.api.Test;
import sptech.school.Atividade_CI_CD.service.CalculadoraService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void testeDivisaoSimples() {
        CalculadoraService service = new CalculadoraService();
        double resultado = service.dividir(20, 4);
        assertEquals(5.0, resultado);
    }
}