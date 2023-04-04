package one.digitalinovetion;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();

        }
        return refNoEntradaPilha;

    }
    public No top(){
        return refNoEntradaPilha;
            }
            public  boolean isEmpty() {
                return refNoEntradaPilha == null ? true : false;
            }

            @Override
    public String toString(){

        String stringRetorno = "------Pilha-----\n";
        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if(noAuxiliar != null){
                stringRetorno = stringRetorno+"[No{dado"+noAuxiliar.getDado()+"}]\n";
                noAuxiliar = noAuxiliar.getRefNo();

            }else {
                break;
            }
        }

        return stringRetorno;
            }
}
