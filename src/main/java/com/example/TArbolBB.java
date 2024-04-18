package com.example;

public class TArbolBB<T> implements IArbolBB<T> {
    private TElementoAB<T> raiz;

    @Override
    public boolean insertar(TElementoAB<T> unElemento) {
        if (raiz == null) {
            raiz = unElemento;
            return true;
        } else {
            return raiz.insertar(unElemento);
        }
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        return raiz.buscar(unaEtiqueta);
    }

    @Override
    public String preOrden() {
        if (this.raiz == null) {
            return "";
        }
        return this.raiz.preOrden();
    }

    @Override
    public String inOrden() {
        if (this.raiz == null) {
            return "";
        } else {
            return raiz.inOrden();
        }
    }

    @Override
    public String postOrden() {
        if (raiz == null) {
            return "";
        } else {
            return raiz.postOrden();
        }
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

}
