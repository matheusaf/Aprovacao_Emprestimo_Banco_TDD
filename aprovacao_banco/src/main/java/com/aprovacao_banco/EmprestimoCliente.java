package com.aprovacao_banco;

 /**
 * Hello world!
 *
 */
public class EmprestimoCliente 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public String aprovaEmprestimo(double saldoMedio, boolean bomPagador, boolean  concessaoEspecial)
    {
        if(saldoMedio > 1000){
            return "Libera Empréstimo";
        }
        return "Não Libera";
    }
}
