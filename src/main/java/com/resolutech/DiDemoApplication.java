package com.resolutech;

import com.resolutech.recipe.controllers.MyController;
import com.resolutech.examplebeans.FakeDataSource;
import com.resolutech.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.resolutech"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource ds = ctx.getBean(FakeDataSource.class);
		System.out.println(ds.getPassword());
        System.out.println(ds.getUser());

        FakeJmsBroker jms = ctx.getBean(FakeJmsBroker.class);
        System.out.println(jms.getUser());
/*
		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
*/
	}
}

