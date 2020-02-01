package org.samples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FetchTest {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();

		
		 Session hs=factory.openSession(); Employee e=new Employee(); Transaction
		  tx=hs.beginTransaction(); e.setName("Rani"); e.setSalary(100.50f);
		  hs.save(e); tx.commit(); hs.close();		
		
		/*Session hs1=factory.openSession();
		Employee e1=new Employee();
		hs1.load(e1,1);
		hs1.close();
		
		Session hs2=factory.openSession();
		Employee e2=new Employee();
		hs2.load(e2,1);
		hs2.close();*/
		
		System.out.println("----success----");
	    
		 

	}
}