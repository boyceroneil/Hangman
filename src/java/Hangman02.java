import java.util.*;
public class Hangman02 {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        ArrayList<String> bank = new ArrayList<String>(Arrays.asList("dragonball", "gundam", "rugrats", "avatar", "jimmyneutron",
                "fights","stepbrothers", "theotherguys","coding","life","sadness"));
        Random obj = new Random();
        int rando = obj.nextInt(10);// pick from the bank 1-10
        String answer = bank.get(rando);
//        int tries = 0;//bad
//        int trieG = answer.length();//good
//        while( tries != trieG+1) {//win condition
            guess(answer);
            //tries++;

        //}

    }
    public static void guess(String answer) {
        int tries = 0;//bad guesses
        Scanner input = new Scanner(System.in);
        String blank = answer;
        blank = blank.replaceAll("[a-z]", "_");
        String blank2 = blank;
        while (tries < 5 && blank2.contains("_")) {
            System.out.println(blank2 + " \n input a letter ");
            String user = input.nextLine(); //guess the letter
            System.out.println(blank);
            char userInput = user.charAt(0);
            if (answer.contains(user)) {
                for (int i = 0; i < answer.length(); i++) {
                    if (userInput == answer.charAt(i)) {
                        blank2 = blank.substring(0, i) + userInput + blank.substring(i+ 1);
                        blank2= blank2.replaceAll("_","_");
                        blank = blank2;

                    }
                }


            }
            else{
                System.out.println(user + " is not present in the word.");
                tries++;
            }

        }
        if (tries == 5) {
            System.out.println("You reached the limit. "+ tries);
        }
        else {
            // when solved
            System.out.print("The word is: " + blank + "\n good job ");
        }

        }


    public  boolean check(String user, String answer){
        if(!answer.contains(user)){
            return false;
        }
            return true;
    }

//    public String getAnswer() {
//        return answer;
//    }
//
//    public void setAnswer(String answer) {
//        this.answer = answer;
//    }
}
