import java.util.ArrayList;
import java.util.List;

// If movie --> Allow for runtime filter
public class Filter {

    // No need for a list
    // 1. Field (i.e. object[0]
    // 2. Target
    // 3. Method(Media obj)

    protected String field;
    protected String target;

    public static boolean filter(String attribute) {
        // Declare filter boolean as false
        boolean isValidFilter = false;
//        attribute.getType().equals("Movie")

        if (attribute.contains("movie") || attribute.contains("series") || attribute.contains("title ") || attribute.contains("director ") || attribute.contains("cast ") || attribute.contains("country ") || attribute.contains("rating ") || attribute.contains("genre ") || attribute.contains("year < ") || attribute.contains("year > ") || attribute.contains("year <= ") || attribute.contains("year >= ") || attribute.contains("year = ") || attribute.contains("runtime < ") || attribute.contains("runtime > ") || attribute.contains("runtime <= ") || attribute.contains("runtime >= ") || attribute.contains("runtime = "))
            isValidFilter = true;

        // If filter isn't valid, return false
        return isValidFilter;
    }

}