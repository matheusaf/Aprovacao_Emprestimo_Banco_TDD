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
     * Rigorous Test :-)
     **/
    @Test
    public void testeLiberaEmprestimo()
    {
        assertEquals("Libera Empréstimo", emprestimoCliente.aprovaEmprestimo(new Cliente("Eidolas", 22, 1000.00, true, true )));
    }

    @Test
    public void testeNaoLibera(){
        asserEquals("Não Libera", emprestimoCliente.aprovaEmprestimo(new Cliente("Eidolas", 22, 1000.00, true, true )));
    }
}
