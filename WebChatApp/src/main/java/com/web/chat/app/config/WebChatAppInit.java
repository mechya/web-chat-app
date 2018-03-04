package com.web.chat.app.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebChatAppInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	 @Override
	   protected Class<?>[] getRootConfigClasses() {
	      return new Class[] {WebChatAppSecurityConfig.class};
	   }

	   @Override
	   protected Class<?>[] getServletConfigClasses() {
	      return new Class[] { WebChatAppConfig.class,WebChatAppSocketConfig.class};
	   }

	   @Override
	   protected String[] getServletMappings() {
	      return new String[] { "/" };
	   }
}
