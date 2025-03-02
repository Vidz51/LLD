The Flyweight Design Pattern is a structural design pattern that helps optimize memory usage by sharing objects that are 
similar instead of creating new ones.
It is useful when an application has a large number of objects that consume a significant amount of memory,
but many of these objects share common properties.

Key Concepts
Intrinsic State - The shared, immutable part of the object that can be reused.
Extrinsic State - The unique, context-specific part that is passed in when needed.
Flyweight Factory - Manages flyweight objects and ensures reuse instead of creating new instances.
Client - Uses the flyweight objects and provides extrinsic states when required.

When to Use the Flyweight Pattern?
When you have a large number of objects with similar data.
When memory usage is high due to object duplication.
When objects can be divided into shared (intrinsic) and unique (extrinsic) states.

Advantages
✅ Reduces memory usage by sharing objects.
✅ Improves performance for applications with a large number of objects.
✅ Promotes reusability and efficient object management.

Disadvantages
❌ Increases complexity due to the need for a factory and object management.
❌ Not useful when objects have more unique states than shared states.

Flyweight Pattern in Spring Boot
In Spring Boot, the Flyweight Design Pattern is used to optimize memory and resource usage by sharing instances of 
objects instead of creating new ones. The most common implementations of Flyweight in Spring are:


Summary
Use Case	Flyweight Pattern in Action
Spring Singleton Beans	Reuses the same service instance across the app.
Spring Cache	Stores and reuses cached data instead of fetching repeatedly.
Database Connection Pooling	Shares database connections efficiently.
Thread Pooling	Reuses worker threads instead of creating new ones.
