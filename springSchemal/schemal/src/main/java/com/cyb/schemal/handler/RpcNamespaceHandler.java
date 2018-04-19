package com.cyb.schemal.handler;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

import com.cyb.schemal.parse.RpcServiceBeanDefinitionParser;
/**
 *作者 : iechenyb<br>
 *类描述: 说点啥<br>
 *SimplePropertyNamespaceHandler 
 *UtilNamespaceHandler
 *创建时间: 2018年2月11日
 */
public class RpcNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("service", new RpcServiceBeanDefinitionParser());
        /*registerBeanDefinitionParser("ref", new RpcReferenceBeanDefinitionParser());
        registerBeanDefinitionParser("registry", new RpcRegistryBeanDefinitionParser());
        registerBeanDefinitionParser("protocol", new RpcProtocolBeanDefinitionParser());*/
    }
}
