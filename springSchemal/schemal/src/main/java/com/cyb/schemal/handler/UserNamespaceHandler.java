package com.cyb.schemal.handler;
/**
 *作者 : iechenyb<br>
 *类描述: 说点啥<br>
 *创建时间: 2018年2月11日
 */
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

import com.cyb.schemal.parse.UserBeanDefinitionParser;

public class UserNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
