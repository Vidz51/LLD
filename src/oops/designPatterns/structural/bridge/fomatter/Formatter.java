package oops.designPatterns.structural.bridge.fomatter;

import oops.designPatterns.structural.bridge.Detail;
import oops.designPatterns.structural.bridge.resources.Resource;

import java.util.List;

public abstract class Formatter {

    Resource resource;

    public Formatter(Resource resource) {
        this.resource = resource;
    }
    public abstract String format(String header, List<Detail> details);
    public abstract String render();


}
