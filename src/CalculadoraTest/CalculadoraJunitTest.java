package CalculadoraTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import junit.framework.Assert;

class CalculadoraJunitTest {
	@SuppressWarnings("deprecation")
    @Test
    public void SomarDoisNumerosPositivos() {
        Soma soma = new Soma();
        int somar = soma.somar(10, 10);

        Assert.assertEquals(20, soma);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairDoisNumerosPositivos() {
        Subtracao subtracao = new Subtracao();
        int subtrair = subtracao.subtrair(20, 10);

        Assert.assertEquals(10, subtracao);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicarDoisNumerosPositivos() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int multiplicar = multiplicacao.multiplicar(10, 10);

        Assert.assertEquals(100, multiplicacao);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DividirDoisNumerosPositivos() {
        Divisao divisao = new Divisao();
        int dividir = divisao.dividir(100, 10);

        Assert.assertEquals(10, divisao);
    }


}
