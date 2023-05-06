

To tranform an object to a managed bean, you use one of these annotations:
Component: Generic, no logic specification
Repository: Represent data layer
Service: Represent service layer




A bean is any object that has one of these annotations:
@Bean @Component @Service @Repository



There two ways to inject a dependecy
1. Field injection
2. Constructor injection


It is not compulsory to add the @autowired annotations.
Spring is smart enough to know a dependency requriement