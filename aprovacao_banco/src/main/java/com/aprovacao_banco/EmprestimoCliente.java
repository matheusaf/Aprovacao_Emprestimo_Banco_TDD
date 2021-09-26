package com.aprovacao_banco;

import com.aprovacao_banco.Banco.*;
import com.aprovacao_banco.Cliente.*;

 /**
 * Hello world!
 *
 */
public class EmprestimoCliente 
{
    private Banco _banco;

    public EmprestimoCliente(Banco banco)
    {
        _banco = banco;
    }

    public EmprestimoCliente()
    {
        _banco = new Banco();
    }

    public Banco getBanco(){
        return _banco;
    }

    public void setBanco(Banco b){
        _banco = b;
    }

    public String aprovaEmprestimo(Cliente c){
        return (_banco.getAprovacao(c)) ? "Libera Empréstimo" : "Não Libera";
    }
}
