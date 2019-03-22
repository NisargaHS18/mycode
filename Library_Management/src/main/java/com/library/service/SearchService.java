package com.library.service;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

	
	public void Search(String str, String by) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		System.out.println("firstline");
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		org.hibernate.Transaction t = session.beginTransaction();
		
		//Query query = session.createQuery("from bookdeatils where ")
		
		
	}
}
