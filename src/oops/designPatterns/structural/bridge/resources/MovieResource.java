package oops.designPatterns.structural.bridge.resources;

import oops.designPatterns.structural.bridge.Detail;
import oops.designPatterns.structural.bridge.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieResource extends  Resource{
    private Movie movie;

    public MovieResource(Movie movie) {
        this.movie = movie;
    }

    @Override
    public List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();

        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Year", movie.getYear()));
        details.add(new Detail("Runtime", movie.getRuntime()));

        return details;
    }

    @Override
    public String getHeader() {
        return this.movie.getClassification();
    }
}
