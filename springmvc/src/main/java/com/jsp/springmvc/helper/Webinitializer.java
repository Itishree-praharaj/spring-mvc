package com.jsp.springmvc.helper;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Webinitializer  extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] classes = {Config.class};
		return classes;
		
	}

	@Override
	protected String[] getServletMappings() {
		String[] urls= {"/"};
		return urls;
	}

}