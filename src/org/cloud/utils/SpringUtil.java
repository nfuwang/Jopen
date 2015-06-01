package org.cloud.utils;

import java.util.Map;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringUtil
  implements ApplicationContextAware
{
  private ApplicationContext applicationContext;
  private static ApplicationContext staticapplicationcontext;
  static {
	  
  }

  public void setApplicationContext(ApplicationContext applicationContext)
    throws BeansException
  {
    this.applicationContext = applicationContext;

    staticapplicationcontext = applicationContext;
  }

  public static Object getBean(String name) {
    if (staticapplicationcontext != null) {
      return staticapplicationcontext.getBean(name);
    }
    return null;
  }

  public static Map getBeansForType(Class clazz)
  {
    if (staticapplicationcontext != null) {
      return staticapplicationcontext.getBeansOfType(clazz);
    }
    return null;
  }
}