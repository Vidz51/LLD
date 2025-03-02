package oops.designPatterns.structural.bridge;

import oops.designPatterns.structural.bridge.fomatter.Formatter;
import oops.designPatterns.structural.bridge.fomatter.HTMLFormatter;
import oops.designPatterns.structural.bridge.fomatter.PrintFormatter;
import oops.designPatterns.structural.bridge.resources.MovieResource;
import oops.designPatterns.structural.bridge.resources.Resource;

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
 *
 * Key Concepts
 * Abstraction: Defines the interface for high-level control logic.
 * Implementation (Bridge): Defines the interface for platform-specific operations.
 * Refinement: Extends the abstraction to add specific features.
 * Concrete Implementation: Provides concrete implementation of the bridge interface.
 * Abstraction ----------> Implementation
 *      |                        |
 *      v                        v
 * Refined Abstraction   Concrete Implementation
 */
public class BridgeDemo {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Resource movieResource = new MovieResource(movie);


        Formatter printFormatter = new PrintFormatter(movieResource);

        String printedMaterial = printFormatter.render();

        System.out.println("printedMaterial: " +printedMaterial);


        Formatter htmlFormatter = new HTMLFormatter(movieResource);

        String htmlMaterial = htmlFormatter.render();

        System.out.println("htmlMaterial:  " +htmlMaterial);

    }
}
