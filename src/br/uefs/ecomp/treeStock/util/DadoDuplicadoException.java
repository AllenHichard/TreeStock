package br.uefs.ecomp.treeStock.util;

public class DadoDuplicadoException extends Exception{
    public DadoDuplicadoException(){
        super();
    }
    
    public DadoDuplicadoException(String msg){
        super(msg);
    }
    
    public DadoDuplicadoException(Throwable t){
        super(t);
    }
}
