package com.bfyamada.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.bfyamada.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
