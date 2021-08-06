package tratamentoDeExcecoes.estruturaTryCatch.criandoExcecoesPersonalizadas.model.exceptions;

public class DomainException extends RuntimeException{

    //RubntimeException: é um tipo de exceção que o compilador nao obriga você  a tratar
    //Exception: vai obrigar você a tratar

    //Domain pois é uma exceção lançada por algum erro na minha entidade de domínio

    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg); //Essa mensagem vai ficar armazenada dentro da minha exceção
    }

}
