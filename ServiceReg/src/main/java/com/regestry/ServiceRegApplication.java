package com.regestry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegApplication.class, args);
	}

}


/*

Eureka Server itself does not perform load balancing. Eureka is a service registry component of Netflix's OSS suite, 
primarily used for service discovery and registration.


1] Services register themselves with the Eureka Server, providing their location and metadata.

2] Service Discovery : Services or clients query the Eureka Server to find the locations of other services. 
This helps in dynamically discovering the addresses of services as they are registered or deregistered.

3] Eureka Server can perform health checks on registered services to ensure they are alive and available. 
If a service fails to respond to health checks, Eureka will eventually remove it from the registry.


What Eureka Does Not Do
Load Balancing : Eureka itself does not distribute requests across multiple instances of a service. It provides 
information about which instances of a service are available, but it does not decide how requests are routed among 
these instances.

API Gateway: An API Gateway such as Spring Cloud Gateway or Zuul can handle server-side load balancing. 
These gateways can route requests to different instances of a service registered with Eureka.



When a service starts, it sends its details to the service registry. It also periodically sends heartbeat 
signals to indicate that it is still alive.

Clients or load balancers query the service registry for instances of a service. The registry responds 
with a list of available instances.

The load balancer or API gateway routes the client request to one of the instances and handles load balancing.



*/