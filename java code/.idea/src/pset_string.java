public class pset_string {
    public static void main(String[] args){
       // Q1>Write a Java program to convert a string to lowercase.
         /*String name = "Akash Routh";
         name = name.toLowerCase();
         System.out.println(name);*/

        //Q2>Write a Java program to replace spaces with underscores.
        /*String name = "Akash Routh";
        name = name.replace(" ","_");
        System.out.println(name);*/

        //Q3>Write a Java program to fill in a letter template which looks like below:
        // letter = “Dear < |name| >, Thanks a lot”
        // Replace < |name| > with a string (some name)
        String letter = "Dear name, Thanks a lot";
        letter = letter.replace("name","akash");
        System.out.println(letter);
    }
}
