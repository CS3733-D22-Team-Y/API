package edu.wpi.cs3733.d22.teamY.api;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/** This class is used to manage the Hibernate session. */
public class SessionManager {

  private static SessionFactory sf =
      new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

  private SessionManager() {}

  /**
   * Use only if you know what you are doing. Close the session after use.
   *
   * @return Session object
   */
  public static Session getSession() {
    return sf.openSession();
  }
}
