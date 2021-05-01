public class Movie extends Media {
//    protected String duration;

//    public String getDuration() {
//        return duration;
//    }
//
//    public void setDuration(String duration) {
//        this.duration = duration;
//    }

    public Movie(String type, String title, String director, String cast, String country,
                 String releaseYear, String rating, String genre, String duration, String description) {
        super(type,
                title,
                director,
                cast,
                country,
                releaseYear,
                rating,
                genre,
                duration,
                description);
        setDuration(duration);
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tRuntime: " + duration + " minutes" + "\n\n\t" + description + "\n\n-----\n";
    }
}
