package com.aprovacao_banco

public class AprovacaoBanco {
	public AprovacaoBanco() {}

	public bool getAprovacao(Cliente c) {
		if (c.saldo > 1000 || c.bomPagador || c.concessao)
            return true;
        
        return false;
	}
}