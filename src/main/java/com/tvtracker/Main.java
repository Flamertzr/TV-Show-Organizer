import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShowManager manager = new ShowManager();
        ShowStorage.load(manager);

        Scanner scanner = new Scanner(System.in);

        IO.println("Show Tracker - type \"help\" for commands");

        while (true) { 
            IO.print("> ");
            String line = scanner.nextLine();

            if (line.trim().isEmpty()) {
                continue;
            }

            String command = line.split(",")[0].trim().toLowerCase();

            int arg = 3;
            if (command.equals("add")) {
                arg = 6;
            }

            String[] parts = line.split(",", arg);
            for (int i = 0; i < parts.length; i++) {
                parts[i] = parts[i].trim();
            }

            try {
                if (command.equals("add")) {
                    if (parts.length < 5) {
                        IO.println("Usage: add, Title, Season, Episode, Rating, Notes");
                        continue;
                    }
                    String title = parts[1];
                    int season = Integer.parseInt(parts[2]);
                    int episode = Integer.parseInt(parts[3]);
                    double rating = Double.parseDouble(parts[4]);
                    String notes = "";
                    if (parts.length > 5) {
                        notes = parts[5];
                    }

                    manager.addShow(title, season, episode, rating, notes);
                    IO.println("Added " + title);

                } else if (command.equals("list")) {
                    for (int i = 0; i < manager.getAllShows().size(); i++) {
                        IO.println(manager.getAllShows().get(i));
                    }

                } else if (command.equals("find")) {
                    if (parts.length < 2) {
                        IO.println("Usage: find, Title");
                        continue;
                    }

                    manager.findByTitle(parts[1]);

                } else if (command.equals("remove")) {
                    if (parts.length < 2) {
                        IO.println("Usage: remove, Title");
                        continue;
                    }

                    manager.removeShow(parts[1]);
                } else if (command.equals("ep")) {
                    if (parts.length < 3) {
                        IO.println("Usage: ep, Title, Episode");
                        continue;
                    }

                    manager.updateEpisode(parts[1], Integer.parseInt(parts[2]));
                } else if (command.equals("season")) {
                    if (parts.length < 3) {
                        IO.println("Usage: season, Title, Season");
                        continue;
                    }

                    manager.updateSeason(parts[1], Integer.parseInt(parts[2]));
                } else if (command.equals("rate")) {
                    if (parts.length < 3) {
                        IO.println("Usage: rate, Title, Rating");
                        continue;
                    }

                    manager.updateRating(parts[1], Double.parseDouble(parts[2]));
                } else if (command.equals("note")) {
                    if (parts.length < 3) {
                        IO.println("Usage: note, Title, Notes");
                        continue;
                    }

                    manager.updateNotes(parts[1], parts[2]);
                } else if (command.equals("help")) {
                    IO.println("Commands:");
                    IO.println("    add, Title, Season, Episode, Rating, Notes - Adds a new show");
                    IO.println("    list - Lists all shows");
                    IO.println("    find, Title - Finds all shows starting with Title");
                    IO.println("    remove, Title - Removes a show");
                    IO.println("    ep, Title, Episode - Updates a shows episode");
                    IO.println("    season, Title season - Updates a shows season");
                    IO.println("    rate, Title, Rating - Updates a shows rating");
                    IO.println("    note, Title, Notes - Updates a shows notes");
                    IO.println("    quit - Exits the program");
                } else if (command.equals("quit")) {
                    ShowStorage.save(manager);
                    IO.println("Bye!");
                    return;
                } else {
                    IO.println("Unknown command. Type \"help\" to see all commands");
                }
            } catch (NumberFormatException e) {
                IO.println("Season, Episode, and Rating need to be numbers");
            }
        }
    }
}