package com.aprovacao_banco.Banco;

import com.aprovacao_banco.Cliente.*;

public class Banco {
	public Banco() {}

	public boolean getAprovacao(Cliente c)
	{
		if (c.getSaldo() > 1000 || c.getBomPagador() || c.getConcessao()){
            return true;
		}
        return false;
	}
}