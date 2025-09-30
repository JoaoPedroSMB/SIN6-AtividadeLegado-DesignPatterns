package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.Interface.INotifica;
import com.exemplo.notificacao.decorator.EmailDecorator;
import com.exemplo.notificacao.decorator.SMSDecorator;
import com.exemplo.notificacao.decorator.PushDecorator;
import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    public void enviarNotificacoes(Pedido pedido) {
        INotifica notificador = new EmailDecorator(
            new SMSDecorator(
                new PushDecorator(
                    msg -> {}
                )
            )
        );
        notificador.envia("Pedido criado para o cliente: " + pedido.getCliente() + ", valor: " + pedido.getValor());
    }
}
