public class arrayOfStrings {
    public static void main(String[] args) {
        String[] words = new String[3];

        words[0] = "you";
        words[1] = "to";
        words[2] = "words";
        
        System.out.println(words[2]);

        String[] cars = {"ford", "tesla", "chevy"};

        for(String cars: cars) {
            System.out.println(cars);
        }
    
    }
}
