package com.byedbl.spring.custom;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class UserNameSpaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
    }
}
