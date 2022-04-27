package fr.natsystem.formation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.natsystem.formation.bean.Metier;

public class TestMetier {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Metier metier1 = context.getBean("metier1", Metier.class);
		metier1.presenterMetier();
		
		Metier metier2 = context.getBean("metier2", Metier.class);
		metier2.presenterMetier();
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
