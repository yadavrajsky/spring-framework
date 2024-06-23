package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UsingInterface implements InitializingBean,DisposableBean{

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Inside afterPropertiesSet method");
        // throw new UnsupportedOperationException("Unimplemented method 'afterPropertiesSet'");
    }

    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Inside destroy method");
        // throw new UnsupportedOperationException("Unimplemented method 'destroy'");
    }

    public UsingInterface()
    {
        System.out.println("Inside constructor");
    }
    
}
