package com.cyb.schemal.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyb.schemal.bean.RpcServiceBean;
import com.cyb.schemal.bean.Student;
import com.cyb.schemal.bean.User;

/**
 * 作者 : iechenyb<br>
 * 类描述: 说点啥<br>
 * 创建时间: 2018年2月11日
 */
public class TestRpcSpringSchema {
	Log log = LogFactory.getLog(TestRpcSpringSchema.class);

	@SuppressWarnings("resource")
	public static void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-rpc.xml");

        /*IHelloService helloService = (IHelloService) context.getBean("helloService");
        System.out.println(helloService.sayHello("ricky"));*/

        RpcServiceBean rpcServiceBean = (RpcServiceBean) context.getBean("rpcService");
        System.out.println("rpcServiceBean:"+rpcServiceBean.getInterfaceName());
        System.out.println(rpcServiceBean.getRef());
        /*
        RpcReferenceBean accountService = (RpcReferenceBean) context.getBean("accountService");
        System.out.println("accountService:"+accountService.getInterfaceName());

        RpcRegistryBean rpcRegistryBean = (RpcRegistryBean) context.getBean("zk");
        System.out.println("rpcRegistryBean:"+rpcRegistryBean.getAddress());

        RpcProtocolBean rpcProtocolBean = (RpcProtocolBean) context.getBean("hessian");
        System.out.println("rpcProtocolBean:"+rpcProtocolBean.getPort());*/

        context.close();
		
	}

	public static void main(String[] args) {
		test();
	}
}
