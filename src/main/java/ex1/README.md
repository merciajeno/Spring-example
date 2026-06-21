The first thing you need to learn in Spring is adding object instances (which we call
beans) to the Spring context. You can imagine the Spring context as a bucket in which
you add the instances you expect Spring to be able to manage. Spring can see only the
instances you add to its context.
You can add beans to the Spring context in three ways: using the @Bean annotation,
using stereotype annotations, and doing it programmatically.
Using the @Bean annotation to add instances to the Spring context enables you to
add any kind of object instance as a bean and even multiple instances of the same
kind to the Spring context. From this point of view, this approach is more flexible
than using stereotype annotations. Still, it requires you to write more code because
you need to write a separate method in the configuration class for each
independent instance added to the context.
Using stereotype annotations, you can create beans for only the application classes
with a specific annotation (e.g., @Component). This configuration approach
requires writing less code, which makes your configuration more comfortable to
read. You’ll prefer this approach over the @Bean annotation for classes that you
define and can annotate.
Using the registerBean() method enables you to implement custom logic for
adding beans to the Spring context. Remember, you can use this approach only
with Spring 5 and later.
