package com.resolutech;

import com.resolutech.controllers.ConstructorInjectedController;
import com.resolutech.controllers.MyController;
import com.resolutech.controllers.PropertyInjectedController;
import com.resolutech.controllers.SetterInjectedController;
import com.resolutech.examplebeans.FakeDataSource;
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

/*
		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
*/
	}
}
