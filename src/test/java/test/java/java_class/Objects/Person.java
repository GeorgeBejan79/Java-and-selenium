package test.java.java_class.Objects;
import java.util.Random;
public class Person {

        String name, address;
        int age;
        public int generateHour(String numberType) {
            Random random = new Random();
            int hours = random.nextInt(11);
            switch (numberType) {
                case "odd":
                    while (hours % 2 == 0) {
                        hours = random.nextInt(11);
                    }
                    break;
                case "even":
                    while (hours % 2 != 0) {
                        hours = random.nextInt(11);
                    }
            }
            return hours;
        }
        public void study() {
            int hours = generateHour("odd");
            System.out.println(name + " is studying for " + hours + " hours.");
        }
        public void run() {
            int hours = generateHour("odd");
            System.out.println(name + " is running for " + hours + " hours.");
        }
        public void sleep() {
            int hours = generateHour("even");
            System.out.println(name + " is sleeping for " + hours + " hours.");
        }
        public void averageSleep(){
            int sum=0;
        for (int i = 0; i < 7; i++) {
            Random random = new Random();
            int hours=generateHour("even");
            sum+=hours;

        }
            int average=sum/7;
            System.out.println("Average sleep hours in one week is: "+average);

    }
    public void averageStudy(){
            int sum=0;
        for (int i = 0; i < 30; i++) {
            int hours=generateHour("odd");
            sum+=hours;
        }
        int average=sum/30;
        System.out.println("Average study hours in one week is: "+average);
    }
    public void average(String numberType, int numberOfDay, String actionType){

            int sum=0;
        for (int i = 0; i < numberOfDay; i++) {
            int hours=generateHour(numberType);
            sum+=hours;
        }
        int average=sum/numberOfDay;
        System.out.println("Average "+actionType+" hours in "+numberOfDay+" is "+average);
    }
        public static void main(String[] args) {
            Person julia = new Person();
            julia.name = "Julia";
            julia.study();
            julia.run();
            julia.sleep();
            julia.averageSleep();
            julia.averageStudy();
            julia.average("odd",11,"study");
            julia.average("odd", 17, "run");
        }
    }
