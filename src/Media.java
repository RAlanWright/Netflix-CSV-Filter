abstract class Media {
    protected String showId;
    protected String type;          // type can be either Movie or TV Show
    protected String title;
    protected String director;
    protected String cast;
    protected String country;
    protected String dateAdded;
    protected String releaseYear;
    protected String rating;
    protected String genre;
    protected String duration;
    protected String description;

    public Media(String type, String title, String director, String cast, String country, String releaseYear, String rating, String genre, String duration, String description) {
//        setShowId(showId);
        setType(type);
        setTitle(title);
        setDirector(director);
        setCast(cast);
        setCountry(country);
//        setdateAdded(dateAdded);
        setReleaseYear(releaseYear);
        setRating(rating);
        setGenre(genre);
        setDescription(description);
    }

    public String getshowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    public String getdateAdded() {
//        return dateAdded;
//    }
//
//    public void setdateAdded(String dateAdded) {
//        this.dateAdded = dateAdded;
//    }


    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "\n\t(" + type + ")\t" +  title + "\n\tDirector: " + director + "\n\tCast: " + cast+ "\n\tCountry: " + country + "\n\tRelease Year: " + releaseYear + "\n\tRating: " + rating + "\n\tGenre: " + genre;
    }
}
