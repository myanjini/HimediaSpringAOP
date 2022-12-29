package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.ExecuteTimeAspect;
import spring.Calculator;
import spring.ImplCalculator;
import spring.RecuCalculator;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppCtx {

	@Bean 
	public ExecuteTimeAspect executeTimeAspect() {
		return new ExecuteTimeAspect();
	}
	
	@Bean 
	public Calculator recuCalculator() {
		return new RecuCalculator();
	}

	@Bean 
	public Calculator implCalculator() {
		return new ImplCalculator();
	}
}
