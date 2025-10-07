package com.exemplo.notificacao.decorator;

import com.exemplo.notificacao.Interface.INotifica;

public class NotificaDecorator implements INotifica {
    protected INotifica notificador;

    public NotificaDecorator(INotifica notificador) {
        this.notificador = notificador;
    }

    @Override
    public void envia(String msg) {
        if (notificador != null) {
            notificador.envia(msg);
        }
    }
}