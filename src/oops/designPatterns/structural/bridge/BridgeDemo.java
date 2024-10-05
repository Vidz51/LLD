package oops.designPatterns.structural.bridge;

/**
 * The Bridge Pattern provides a way to decouple abstraction from its implementation, enabling both to vary independently.
 * It's useful when you need flexibility and scalability in a system where both the high-level control and low-level details can change frequently.
 *
 * The provided example demonstrates the Bridge Design Pattern because it separates two distinct concepts:
 *
 * Resource (MovieResource): This represents the content or data.
 * Formatter (PrintFormatter, HtmlFormatter): This represents how that content is displayed or formatted.
 * By decoupling these two, the pattern allows us to create multiple different resources (e.g., Movie, Book)
 * and format them in different ways (e.g., PrintFormatter, HtmlFormatter), without them being tightly coupled.
 */
public class BridgeDemo {
}
