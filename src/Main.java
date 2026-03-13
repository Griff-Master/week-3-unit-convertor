import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner scanner =  new Scanner(System.in);
   public static ArrayList<String > conversions = new ArrayList<>();
    public static  void main(String[] args){
showMainMenu();

    }
    public static void showMainMenu(){
        boolean  running = true;
        while(running){
            System.out.println("----UNIT CONVERTOR-------");
            System.out.println("1. Length convertor");
            System.out.println("2. Temperature convertor");
            System.out.println("3. Currency convertor");
            System.out.println("4. Mass convertor");
            System.out.println("5. Exit");
            System.out.println("----------------------------");
            System.out.print("Choose an option: ");
            if(!scanner.hasNextInt()){
                System.out.println("Enter valid entry");
                scanner.next();
                continue;
            }
            int choice = scanner.nextInt();
            switch(choice){
                case 1 ->lengthConvertor();
                case 2 ->temperatureConvertor();
                case 3 -> currencyConvertor();
                case 4 -> massConvertor();
                case 5 ->{
                    running = false;
                    System.out.println("Goodbye👋");
                }
                default -> System.out.println("Invalid choice");
            }

        }
    }
    public static void lengthConvertor(){
        double length = 0;
        double newLength = 0;
        boolean running = true;
        while(running){
            System.out.println("------Length convertor-----");
            System.out.println("1. Metres to Kilometres");
            System.out.println("2. Kilometres to Metres");
            System.out.println("3. Centimetres to Metres");
            System.out.println("4. Metres to Centimetres");
            System.out.println("5. Show conversion history");
            System.out.println("6. Back to main menu");
            System.out.println("----------------------------");
            System.out.print("Enter your choice: ");
            if(!scanner.hasNextInt()){
                System.out.println("Enter valid Number: ");
                scanner.next();
                continue;
            }
            int choice = scanner.nextInt();
            switch(choice){
                case 1 ->{
                    System.out.print("Enter length in metres: ");
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    length = scanner.nextDouble();
                    if(length <= 0){
                        System.out.println("Input must be greater than zero!");
                        break;
                    }
                    newLength = length/1000;
                    System.out.printf("Your new length in KM is %.2f\n", newLength);
                    conversions.add("Converted " + length + " metres to " + newLength + " kilometres.");
                }
                case 2 ->{
                    System.out.print("Enter length in Kilometers: ");
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    length = scanner.nextDouble();
                    if(length <= 0){
                        System.out.println("Input must be greater than zero!");
                        break;
                    }
                    newLength = length * 1000;
                    System.out.printf("Your new length in metres is %.2f\n", newLength);
                    conversions.add("Converted " + length + " Kilometres to "  +newLength + " metres.");
                }
                case 3 ->{
                    System.out.print("Enter length in centimeters: ");
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    length = scanner.nextDouble();
                    if(length <= 0){
                        System.out.println("Input must be greater than zero!");
                        break;
                    }
                    newLength = length/100;
                    System.out.printf("Your new length in metres is %.2f\n", newLength);
                    conversions.add("Converted " + length + " centimetres to " + newLength + " metres.");
                }
                case 4 ->{
                    System.out.print("Enter length in metres: ");
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    length = scanner.nextDouble();
                    if(length <= 0){
                        System.out.println("Input must be greater than zero!");
                        break;
                    }
                    newLength = length * 100;
                    System.out.printf("Your new length in centimetres is %.2f\n", newLength);
                    conversions.add("Converted " + length + " metres to " + newLength + " centimetres.");
                }
                case 5 ->{
                    System.out.println("----Length Conversion History-----");
                    for(String c : conversions){
                        System.out.println(c);
                        System.out.println("-------------------------------------");
                    }
                }
                case 6 ->{
                    running = false;
                    System.out.println("Thanks for using length convertor program: ");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again!");
            }
        }
    }
    public static void temperatureConvertor(){
        double temperature = 0;
        double newTemperature = 0;
        boolean running = true;
        while(running){
            System.out.println("------Temperature------Convertor---------");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Show Conversion History");
            System.out.println("6. Back to main menu");
            System.out.println("------------------------------------------");
            System.out.print("Enter your option: ");
            if(!scanner.hasNextInt()){
                System.out.println("Enter a valid number.");
                scanner.next();
                continue;
            }
            int option = scanner.nextInt();
            switch(option){
                case 1 ->{
                    System.out.print("Enter temperature in Celsius: " );
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    temperature = scanner.nextDouble();
                    if(temperature <= 0){
                        System.out.println("Input must be greater than zero!");
                        break;
                    }
                    newTemperature = (temperature * 9/5) + 32;
                    System.out.printf("Your new temperature is %.2f\n" , newTemperature);
                    conversions.add("Converted " + temperature + "\u00B0C to " + newTemperature + "\u00B0F");
                }
                case 2 ->{
                    System.out.print("Enter temperature in Fahrenheit: ");
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    temperature = scanner.nextDouble();
                    if(temperature <= 0){
                        System.out.println("Input must be greater than zero!");
                        break;
                    }
                    newTemperature = (temperature - 32) * 5/9;
                    System.out.printf("Your new temperature is %.2f\n" , newTemperature);
                    conversions.add("Converted " + temperature + "\u00B0F to " + newTemperature + "\u00B0C");
                }
                case 3 ->{
                    System.out.print("Enter temperature in Celsius: ");
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    temperature = scanner.nextDouble();
                    if(temperature <= 0){
                        System.out.println("Input must be greater than zero!");
                        break;
                    }
                    newTemperature = temperature + 273.15;
                    System.out.printf("Your new temperature is %.2f\n" , newTemperature);
                    conversions.add("Converted " + temperature + "\u00B0C to " + newTemperature + "K");
                }
                case 4 ->{
                    System.out.print("Enter temperature in Kelvin: ");
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    temperature = scanner.nextDouble();
                    if(temperature <= 0){
                        System.out.println("Input must be greater than zero!");
                        break;
                    }
                    newTemperature = temperature - 273.15;
                    System.out.printf("Your new temperature is %.2f\n" , newTemperature);
                    conversions.add("Converted " + temperature + "K to " + newTemperature + "\u00B0C");
                }
                case 5 ->{
                    System.out.println("------Temperature Conversion History------");
                    for(String c : conversions){
                        System.out.println(c);
                        System.out.println("--------------------------------------------");
                    }
                }
                case 6 ->{
                    running = false;
                    System.out.println("Thanks for using Temperature conversion program.");
                    return;
                }
                default -> System.out.println("Invalid Choice.");
            }
        }
    }
    public static void currencyConvertor() {
        double amount = 0;
        double newAmount = 0;
        boolean running = true;
        while (running) {
            System.out.println("----Currency Convertor-----");
            System.out.println("1. USD to KES");
            System.out.println("2. KES to USD");
            System.out.println("3. EUR to KES");
            System.out.println("4. KES to EUR");
            System.out.println("5. Show conversion History");
            System.out.println("6. Back to Main Menu");
            System.out.println("-----------------------------");
            System.out.print("Enter option: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Enter valid number. Try again🙏");
                scanner.next();
                continue;
            }
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.print("Enter the amount in USD: ");
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    amount = scanner.nextDouble();
                    if (amount <= 0) {
                        System.out.println("Input must be greater than zero!");
                        break;
                    }
                    newAmount = amount * 130;
                    System.out.printf("Your converted amount is%.2f\n", newAmount);
                    conversions.add("Converted $" + amount + " to KES" + newAmount);
                }
                case 2 -> {
                    System.out.print("Enter amount in KES: ");
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    amount = scanner.nextDouble();
                    if (amount <= 0) {
                        System.out.println("Input must be greater than zero. Try again🙏");
                        break;
                    }
                    newAmount = amount / 130;
                    System.out.printf("Your converted amount is%.2f\n", newAmount);
                    conversions.add("Converted KES" + amount + " to $" + newAmount);
                }
                case 3 -> {
                    System.out.print("Enter amount in EUR: ");
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    amount = scanner.nextDouble();
                    if (amount <= 0) {
                        System.out.println("Amount must be greater than zero. Try again🙏");
                        break;
                    }
                    newAmount = amount * 140;
                    System.out.printf("Your converted amount is%.2f\n", newAmount);
                    conversions.add("Converted " + amount + " Euros to KES" + newAmount);
                }
                case 4 -> {
                    System.out.print("Enter amount in KES: ");
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    amount = scanner.nextDouble();
                    if (amount <= 0) {
                        System.out.println("Amount must be greater than zero. Try again🙏");
                        break;
                    }
                    newAmount = amount / 140;
                    System.out.printf("Your converted amount is%.2f\n", newAmount);
                    conversions.add("Converted KES" + amount + " to " + newAmount + " Euros");
                }
                case 5 -> {
                    System.out.println("----Conversion History-----");
                    for (String c : conversions) {
                        System.out.println(c);
                        System.out.println("-------------------------------");
                    }
                }
                case 6 -> {
                    running = false;
                    System.out.println("Thanks for using Currency Conversion program.");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again🙏");
            }
        }
    }
    public static void massConvertor(){
        double mass = 0;
        double newMass = 0;
        boolean running = true;
        while(running){
            System.out.println("-----Mass Convertor-------");
            System.out.println("1. Kilogram to Tonne");
            System.out.println("2. Tonne to Kilogram");
            System.out.println("3. Gram to Kilogram");
            System.out.println("4. Kilogram to Gram");
            System.out.println("5. Weight conversion history");
            System.out.println("6. Back to Main Menu");
            System.out.println("------------------------------");
            System.out.println("Enter your choice: ");
            if(!scanner.hasNextInt()){
                System.out.print("Enter valid number. Try again🙏");
                scanner.next();
                continue;
            }
            int choice = scanner.nextInt();
            switch(choice){
                case 1 ->{
                    System.out.print("Enter mass in Kilograms: ");
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    mass = scanner.nextDouble();
                    if(mass <=0){
                        System.out.println("Mass must be greater than zero.");
                        break;
                    }
                    newMass = mass/1000;
                    System.out.printf("Your converted mass is %.2f\n" , newMass);
                    conversions.add("Converted " + mass + "KG to " + newMass +"tonnes" );
                }
                case 2 -> {
                    System.out.print("Enter mass in tonnes: ");
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    mass = scanner.nextDouble();
                    if(mass <= 0){
                        System.out.println("Mass must be greater than zero.");
                        break;
                    }
                    newMass = mass * 1000;
                    System.out.printf("Your converted mass is %.2f\n" , newMass);
                    conversions.add("Converted " + mass + "tonnes to " + newMass + "KG");
                }
                case 3 ->{
                    System.out.print("Enter mass in grams: ");
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    mass = scanner.nextDouble();
                    if(mass <= 0){
                        System.out.println("Mass must be greater than zero.");
                        break;
                    }
                    newMass = mass/1000;
                    System.out.printf("Your converted mass is %.2f\n" , newMass);
                    conversions.add("Converted " + mass + "g to " + newMass + "Kg");
                }
                case 4 ->{
                    System.out.print("Enter mass in Kilograms: ");
                    if(!scanner.hasNextDouble()){
                        System.out.println("Enter  number!");
                        scanner.next();
                        continue;
                    }
                    mass = scanner.nextDouble();
                    if(mass <= 0){
                        System.out.println("Mass must be greater than zero.");
                        break;
                    }
                    newMass = mass * 1000;
                    System.out.printf("Your converted mass is %.2f\n" , newMass);
                    conversions.add("Converted " + mass + "Kg to " + newMass + "g");
                }
                case 5 ->{
                    System.out.println("---Conversion History----");
                    for(String c : conversions){
                        System.out.println(c);
                        System.out.println("--------------------------");
                    }
                }
                case 6 ->{
                       running = false;
                    System.out.println("Thank you for using Mass Conversion Program.");
                    return;
                }
                default -> System.out.println("Invalid Choice. Try again🙏");
            }
        }
    }
}
