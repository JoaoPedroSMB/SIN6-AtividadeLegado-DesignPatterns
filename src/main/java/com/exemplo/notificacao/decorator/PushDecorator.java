package com.exemplo.notificacao.decorator;

import com.exemplo.notificacao.Interface.INotifica;

public class PushDecorator extends NotificaDecorator {
    public PushDecorator(INotifica notificador) {
        super(notificador);
    }

    public void notificaPush(String msg) {
        System.out.println("Notificando via Push: " + msg);
    }

    @Override
    public void envia(String msg) {
        super.envia(msg);
        notificaPush(msg);
    }
}