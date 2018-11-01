package Game;

public class Quiz {
    Player p1;
    Player p2;
    Player p3;

    int p1_num;
    int p2_num;
    int p3_num;

    boolean p1_guessed = false;
    boolean p2_guessed = false;
    boolean p3_guessed = false;

    public void start_quiz(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        while(true){
            int number_to_guess = (int)(Math.random() * 10);
            System.out.println("Number to guess is: " + number_to_guess);

            p1.guess();
            p2.guess();
            p3.guess();

            p1_num = p1.number;
            p2_num = p2.number;
            p3_num = p3.number;

            if (number_to_guess == p1_num){
                p1_guessed = true;
            }
            if (number_to_guess == p2_num){
                p2_guessed = true;
            }
            if (number_to_guess == p3_num){
                p3_guessed = true;
            }

            if (p1_guessed || p2_guessed || p3_guessed){
                System.out.println("We have the Winner!");
                System.out.println("The winner is:");
                System.out.println("Player One: " + p1_guessed);
                System.out.println("Player Two: " + p2_guessed);
                System.out.println("Player Three: " + p3_guessed);
                break;
            }else{
                System.out.println("There is no winner, game need to be repeated!");
            }
        }
    }
}
