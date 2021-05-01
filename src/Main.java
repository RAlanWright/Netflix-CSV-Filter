import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


// Just needs to call the method that reads
public class Main {
    public static void main(String[] args) {


//        DataFileParser newMedia  = new DataFileParser();
//        DataFileParser.

        Scanner input = new Scanner(System.in);

        ArrayList<Media> masterList = (ArrayList<Media>) DataFileParser.readMediaFromCSV("netflix_titles.csv");

        List<Media> currentList = new ArrayList<>();

        List<String> filterList = new ArrayList<>();

        StringBuilder builder = new StringBuilder();
        StringBuilder currentBuilder = new StringBuilder();

        int recordCount = 0;
        for (Media m : masterList) {
//            if (m.getshowId() )
//            System.out.println(m);
//            if (m.type.equals("type"))
//                break;
            builder.append(m);
            recordCount++;
//            if (recordCount == 5)
//                break;
        }


        String choice = "";

        // Client handles the list editing


        String[] filterWords = {"movie", "series", "title", "director", "cast", "country", "rating", "genre", "year", "runtime"};

        int filterCount = 0;
        int currentListCount = 0;
        while (!choice.equals("Q")) {
            System.out.println("Current filters:\n-------------");
            if (filterCount >= 1) {
                for (String filter : filterList) {
                    System.out.println(filter);
                }
            }

            if (currentListCount < 1) {
                System.out.printf("(A)dd a new filter\n(R)emove a filter\n(L)ist matching records (%d found)\n(Q)uit\n", recordCount);
            } else {
                System.out.printf("(A)dd a new filter\n(R)emove a filter\n(L)ist matching records (%d found)\n(Q)uit\n", currentListCount);
            }
            System.out.print("Enter the letter of your choice: ");
            choice = input.nextLine().toUpperCase();


            switch (choice) {
                case "A":
                    System.out.print("\nEnter new filter: ");
                    choice = input.nextLine().toLowerCase();
//                    System.out.println(masterList.);
                    if (Filter.filter(choice)) {
                        filterList.add(choice);
                        filterCount++;
                        for (Media listItem : masterList) {
//                            if (!listItem.equals(null))
//                                System.out.println(listItem.getType());
                            if (!listItem.equals(null) && choice.equals("movie") && listItem.getType().toLowerCase().equals(filterWords[0])) {
                                    currentList.add(listItem);
                                    currentBuilder.append(listItem);
//                                System.out.println(masterList.get(1)); // Prints out the entire first object
//                                System.out.println(currentList);
                                currentListCount++;
                            }
                        }
                    }

                    break;
                case "R":
                    System.out.print("Enter filter to remove: ");
                    choice = input.nextLine();
                    break;
                case "L":
                    if (filterCount > 0) {
//                        System.out.println(currentList);
                        System.out.println(currentBuilder);
                    } else
                        System.out.println(builder);
                    break;
                default:
                    break;
            }
        }
    }
}