package com.exemplo.notificacao.decorator;

import com.exemplo.notificacao.Interface.INotifica;

public class EmailDecorator extends NotificaDecorator {
    public EmailDecorator(INotifica notificador) {
        super(notificador);
    }

    public void notificaEmail(String msg) {
        System.out.println("Notificando via email: " + msg);
    }

    @Override
    public void envia(String msg) {
        super.envia(msg);
        notificaEmail(msg);
    }
}