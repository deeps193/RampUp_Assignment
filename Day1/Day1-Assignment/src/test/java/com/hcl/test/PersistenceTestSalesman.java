package com.hcl.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hcl.model.Salesman;

//import java.util.List;
//import static org.testng.Assert.assertEquals;
public class PersistenceTestSalesman {
	private SessionFactory factory = null;

	@BeforeClass
	public void setup() {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	}

	@Test
	public void saveSalesman() {
		Salesman salesman = new Salesman();
		salesman.setSalesman_id(12);
		salesman.setSalesman_name("deepika");
		salesman.setSalesman_mobno("9047845297");
		salesman.setSalesman_email("deepika@gmail,com");
		salesman.setSalesman_username("deeps3");
		salesman.setSalesman_password("wait");
		salesman.setSalesman_address("veerachamy,street,virudhunagar");

		Transaction transaction = null;
		try (Session session = factory.openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the salesman objects
			session.save(salesman);

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@Test(dependsOnMethods = "saveSalesman")
	public void readSalesman() {
		Transaction transaction = null;
		try (Session session = factory.openSession()) {
			@SuppressWarnings("rawtypes")
			List salesmanDetails = session.createQuery("from Salesman").list();
			salesmanDetails.forEach(s -> System.out.println(((Salesman) s).getSalesman_name()));
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}