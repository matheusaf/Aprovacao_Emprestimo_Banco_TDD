package com.aprovacao_banco;

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
     */
    @Test
    public void testeLiberaEmprestimo()
    {
        assertEquals("Libera Empréstimo", emprestimoCliente.aprovaEmprestimo(1000, true, true));
    }
}
