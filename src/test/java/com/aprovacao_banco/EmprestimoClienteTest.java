package com.aprovacao_banco;

import com.aprovacao_banco.Cliente.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class EmprestimoClienteTest 
{
    private EmprestimoCliente emprestimoCliente;

     public EmprestimoClienteTest()
     {
        emprestimoCliente = new EmprestimoCliente();     
     }
    
     /**
     * Um sistema bancário é utilizado para avaliar o cliente e determinar se um empréstimo pode ser liberado para ele. As regras para liberação do empréstimo são as seguintes:
     * O saldo médio deve ser maior que R$1000,00 mensais.
     * Mesmo se o saldo médio ser menor que o exigido, mas o cliente possuí um histórico de bom pagador o empréstimo também é liberado.
     * Se um cliente possui uma concessão especial de crédito ele também pode ter empréstimo liberado, mesmo não tendo saldo mínimo exigido e não sendo um bom pagador.
     * Para qualquer outro caso o cliente tem o empréstimo negado.
     **/
    @Test
    public void testeLiberaEmprestimoSaldo()
    {
        assertEquals("Libera Empréstimo", emprestimoCliente.aprovaEmprestimo(new Cliente("Eidolas", 22, 1000.01, false, false )));
    }

    @Test
    public void testeLiberaEmprestimoBomPagador() {
        asserEquals("Libera Empréstimo", emprestimoCliente.aprovaEmprestimo(new Cliente("Eidolas", 22, 100.00, true, false )));
    }

    @Test
    public void testeLiberaEmprestimoConcessao(){
        asserEquals("Libera Empréstimo", emprestimoCliente.aprovaEmprestimo(new Cliente("Eidolas", 22, 100.00, false, true )));
    }

    @Test
    public void testeNaoLiberaEmprestimo(){
        asserEquals("Não Libera", emprestimoCliente.aprovaEmprestimo(new Cliente("Eidolas", 22, 100.00, false, false )));
    }
}
