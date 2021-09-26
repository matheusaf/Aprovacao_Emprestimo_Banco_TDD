package com.aprovacao_banco.Cliente;

public class Cliente {
        private String _nome;
        private int _idade;
        private double _saldo;
        private boolean _bomPagador;
        private boolean _concessao;

	public Cliente(String nome, int idade, double saldo, boolean bomPagador, boolean concessao) {
                _nome = nome;
                _idade = idade;
                _saldo = saldo;
                _bomPagador = bomPagador;
                _concessao = concessao;
	}

        public String getNome(){
                return _nome;
        }

        public int getIdade(){
                return _idade;
        }

        public double getSaldo(){
                return _saldo;
        }

        public boolean getBomPagador(){
                return _bomPagador;
        }

        public boolean getConcessao(){
                return _concessao;
        }

        @Override
        public String toString(){
                return String.format("\tnome: %s\n \tidade: %d\n \tsaldo: %.2f\n \tbomPagador:%s\n \tconcessao: %s\n",_nome, _idade, _saldo, Boolean.toString(_bomPagador), Boolean.toString(_concessao));
        }
}