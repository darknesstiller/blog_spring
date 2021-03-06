package org.upiita.spring.testing;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.upiita.spring.dao.iUsuarioDAO;

public class LoggingAspectosDemostracion {

	private static ApplicationContext contexto;

	private static iUsuarioDAO usuarioDAO;
	
	public static void main(String args[]) {

		contexto = new ClassPathXmlApplicationContext("dao-context-testing.xml");
		usuarioDAO = (iUsuarioDAO) contexto.getBean("usrDAO");
		
		usuarioDAO.getUsuario(1);
		
	}

}
