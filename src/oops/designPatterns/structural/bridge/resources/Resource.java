package oops.designPatterns.structural.bridge.resources;

import oops.designPatterns.structural.bridge.Detail;
import oops.designPatterns.structural.bridge.fomatter.Formatter;

import java.util.List;

public abstract class Resource {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }
    public abstract List<Detail> getDetails();

    abstract public String getHeader();
}
