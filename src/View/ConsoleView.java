package View;

import java.util.*;


public class ConsoleView {
    /*private MovieControllerInterface movieController;
    private ActorControllerInterface actorController;

    public ConsoleView(MovieControllerInterface movieController, ActorControllerInterface actorController) {
        this.movieController = movieController;
        this.actorController = actorController;

        actorController.addActor(0, "Gheorghe", 2);
        actorController.addActor(1, "Mihai", 5);

        movieController.addMovie(0, "prim film", MovieType.COMEDY, new ArrayList<>());
        movieController.addMovie(1, "al doilea film", MovieType.ACTION, new ArrayList<>());

        movieController.addActorToMovie(0, 0);
        movieController.addActorToMovie(0, 1);
        movieController.addActorToMovie(1, 0);
    }


    public void run() {
        Scanner scanner = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("""

                     0. Exit Program \r
                     1. Show all Movies \r
                     2. Show all Actors \r
                     3. Add a Movie \r
                     4. Add an Actor \r
                     5. Remove a Movie \r
                     6. Remove an Actor \r
                     7. Update a Movie \r
                     8. Update an Actor \r
                     9. Add Actor to Movie \r
                     10. Get top Actors \r
                    """);
            System.out.println("Enter input: ");
            int variant = scanner.nextInt();
            System.out.println("You've entered: " + variant);
            switch (variant) {
                case 0:
                    break loop;
                case 1:
                    showMovies();
                    break;
                case 2:
                    showActors();
                    break;
                case 3:
                    addMovie();
                    break;
                case 4:
                    addActor();
                    break;
                case 5:
                    deleteMovie();
                    break;
                case 6:
                    deleteActor();
                    break;
                case 7:
                    updateMovie();
                    break;
                case 8:
                    updateActor();
                    break;
                case 9:
                    addActorToMovie();
                    break;
                case 10:
                    getTopActors();
                    break;
            }

        }
    }

    private void showMovies() {
        System.out.println(movieController.getAll());
    }

    private void addMovie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You will need to write a few things that represent Movie attributes.");
        System.out.println("Enter Movie id:");
        try {
            int id = scanner.nextInt();
            System.out.println("Enter Movie name:");
            scanner.nextLine(); //throw away the \n not consumed by nextInt()
            String name = scanner.nextLine();
            System.out.println("Enter Movie type:");
            String movieType = scanner.nextLine();

            movieController.addMovie(id, name, MovieType.valueOf(movieType), new ArrayList<>());
        } catch (Exception e) {
            throw e;
        }
    }

    private void deleteMovie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Movie id:");
        int id = scanner.nextInt();
        movieController.deleteMovie(id);
    }

    private void updateMovie() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You will need to write a few things that represent Movie attributes.");
            System.out.println("Enter Movie id:");
            int id = scanner.nextInt();
            System.out.println("Enter Movie name:");
            scanner.nextLine(); //throw away the \n not consumed by nextInt()
            String name = scanner.nextLine();
            System.out.println("Enter Movie type:");
            String movieType = scanner.nextLine();

            movieController.updateMovie(id, name, MovieType.valueOf(movieType), new ArrayList<>());
        } catch (Exception e) {
            throw e;
        }
    }

    private void showActors() {
        System.out.println(actorController.getAll());
    }

    private void addActor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You will need to write a few things that represent Actor attributes.");
        System.out.println("Enter Actor id:");
        try {
            int id = scanner.nextInt();
            System.out.println("Enter Actor name:");
            scanner.nextLine(); //throw away the \n not consumed by nextInt()
            String name = scanner.nextLine();
            System.out.println("Enter Actor's number of Oscars:");
            Integer nrOscars = scanner.nextInt();

            actorController.addActor(id, name, nrOscars);
        } catch (Exception e) {
            throw e;
        }
    }

    private void deleteActor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Actor id:");
        int id = scanner.nextInt();
        actorController.deleteActor(id);
    }

    private void updateActor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You will need to write a few things that represent Actor attributes.");
        System.out.println("Enter Actor id:");
        try {
            int id = scanner.nextInt();
            System.out.println("Enter Actor name:");
            scanner.nextLine(); //throw away the \n not consumed by nextInt()
            String name = scanner.nextLine();
            System.out.println("Enter Actor's number of Oscars:");
            Integer nrOscars = scanner.nextInt();

            actorController.updateActor(id, name, nrOscars);
        } catch (Exception e) {
            throw e;
        }
    }

    private void addActorToMovie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Movie id:");
        try {
            int movieId = scanner.nextInt();
            System.out.println("Enter Actor id:");
            int actorId = scanner.nextInt();
            movieController.addActorToMovie(movieId, actorId);
        } catch (Exception e) {
            throw e;
        }
    }

    private void getTopActors(){
        List<Map.Entry<Actor, Integer>> topActors = movieController.getTopActors();
        for(int i = topActors.size() - 1; i >= 0; i--){
            System.out.println("Name: " + topActors.get(i).getKey().getName() + " " + topActors.get(i).getValue());
        }
    }*/
}
