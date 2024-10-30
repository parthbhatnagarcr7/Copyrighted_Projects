import java.util.Scanner;

public class Numerology_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user's full name
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        // Get user's date of birth
        System.out.print("Enter your date of birth (in the format DD-MM-YYYY): ");
        String dob = scanner.nextLine();

        // Calculate destiny number
        int destinyNumber = calculateDestinyNumber(dob);
        System.out.println("Destiny Number: " + destinyNumber);
        displayCharacteristics("Destiny Number", destinyNumber);

        // Calculate soul number
        int soulNumber = calculateSoulNumber(fullName);
        System.out.println("Soul Number: " + soulNumber);
        displayCharacteristics("Soul Number", soulNumber);

        // Calculate character number
        int characterNumber = calculateCharacterNumber(fullName);
        System.out.println("Character Number: " + characterNumber);
        displayCharacteristics("Character Number", characterNumber);

        scanner.close();
    }

    private static int calculateDestinyNumber(String dob) {
        // Implement your destiny number calculation logic here
        // For simplicity, let's just sum up the digits of the date of birth
        int sum = 0;
        for (char digit : dob.replaceAll("[^0-9]", "").toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        return reduceToSingleDigit(sum);
    }

    private static int calculateSoulNumber(String fullName) {
        // Implement your soul number calculation logic here
        // For simplicity, let's just sum up the numerical values of the characters in the name
        int sum = 0;
        for (char character : fullName.toUpperCase().toCharArray()) {
            if (Character.isLetter(character)) {
                sum += character - 'A' + 1;
            }
        }
        return reduceToSingleDigit(sum);
    }

    private static int calculateCharacterNumber(String fullName) {
        // Implement your character number calculation logic here
        // For simplicity, let's just sum up the ASCII values of the characters in the name
        int sum = 0;
        for (char character : fullName.toCharArray()) {
            sum += (int) character;
        }
        return reduceToSingleDigit(sum);
    }

    private static void displayCharacteristics(String type, int number) {
        // Display characteristics based on the number
        switch (number) {
            case 1:
                System.out.println(type + " The number 1 is related with administration and autonomy. Individuals with this name-number exhibit extraordinary internal quality and have a lot of potential for money related achievement and different achievements throughout everyday life. These people are accepted to utilize their inalienable gifts and authority capacities to impact and lead individuals.");
                break;
            case 2:
                System.out.println(type + "In the event that an individual's name-number is 2, he is viewed as co-employable and exceptionally versatile to any situation throughout everyday life. 2 is related with collaboration, interceding and working for the integrity of others. Individuals with the name-number 2 will in general be old buddies and are thoughtful, useful people.");
                break;
            case 3:
                System.out.println(type + " Characteristics related with the number 3 incorporate progressed social aptitudes and verbalization. Individuals with name-number 3 are superb to address and are regularly effective speakers or scholars. They have a brilliant creative mind and appreciate life without limit.");
                break;
            case 4:
                System.out.println(type + " Request, common sense, genuineness and difficult work are a portion of the character qualities related with this number. A number 4 man is trained, genuine, fair and will work consistently to accomplishing his objective. Such an individual can carry request to a generally clamorous circumstance.");
                break;
            case 5:
                System.out.println(type + " If your baby name is chosen by a number estimation of 5, it recommends brightness, excitement, vitality and flexibility. These people are accepted to be daring and love their opportunity. They like difficulties and get exhausted with schedule. They regularly need a few exercises to keep their dynamic psyche involved. Become familiar with number 5 in numerology.");
                break;
            case 6:
                System.out.println(type + " Number 6 is related with supporting, compassion, balance, city sense and obligation. Individuals with name-number 6 spot high need on family. They are additionally ready to bear duties and execute them in the most ideal way.");
                break;
            case 7:
                System.out.println(type + " Number 7 people are explanatory and curious. They have a hunger for information and regularly make extraordinary academicians, analysts or researchers. They have a solid feeling of autonomy and will in general do things their own specific manner. Number 7 people are accepted to act naturally dependent and may seem to be held.");
                break;
            case 8:
                System.out.println(type + " An individual with name-number 8 is aggressive, sure, viable and has an extraordinary capacity to execute plans. They are achievers and try to arrive at the head of their field through difficult work.");
                break;
            case 9:
                System.out.println(type + " A number 9 man is compassionate and sacrificial. Empathy, resistance, optimism and affectability are the signs of number 9. Number 9 people regularly offer unselfishly to other people.");
                break;

            default:
                System.out.println(type + " Characteristics: Unknown or not defined");
        }
    }

    private static int reduceToSingleDigit(int number) {
        // Reduce a number to a single digit by summing its digits recursively
        while (number > 9) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
    }
}
