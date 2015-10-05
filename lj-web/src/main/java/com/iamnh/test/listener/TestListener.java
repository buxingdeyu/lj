package com.iamnh.test.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		System.out.println("ServletContext初始化");
		System.out.println(sce.getServletContext().getServerInfo());
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext销毁");
	}

}
