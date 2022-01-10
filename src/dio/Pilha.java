package dio;

public class Pilha {
    private No referenciaEntradaPilha;

    public Pilha() {
        this.referenciaEntradaPilha = null;
    }

    public void push(No novoNo){
        No referenciaAux = referenciaEntradaPilha;
        referenciaEntradaPilha = novoNo;
        referenciaEntradaPilha.setReferenciaNo(referenciaAux);
    }

    public No pop(){
        if (!this.isEmpty()){
            No noPoped = referenciaEntradaPilha;
            referenciaEntradaPilha = referenciaEntradaPilha.getReferenciaNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return referenciaEntradaPilha;
    }

    public boolean isEmpty(){
        if (referenciaEntradaPilha == null){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String toString() {
        String stringRetorno = "---------\n";
        stringRetorno += "          Pilha\n";
        stringRetorno += "          Pilha\n";

        No noAuxiliar = referenciaEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += "{No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReferenciaNo();
            }else{
                break;
            }
        }

        return stringRetorno += "---------\n";

    }
}
