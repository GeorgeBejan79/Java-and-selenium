package test.java.java_class.Mentoring;

public class Practice101 {

        String student1 ;
        public static void main(String[] args) {
            Practice101 object = new Practice101();
            object.practice1("SAM");
            Practice101 object3 = new Practice101("JAN");
            object3.practice1("WWWW");
        }
        public Practice101(){ } //first constructor
        public Practice101(String name){ //second constructor

            this.student1=name;
        }
        public void practice1() {
            String name ="KAYLA";

            System.out.println("This is a string in practice1 method");
        }
        public void practice1(String name){
            System.out.println("This is a string in practice1 OVERLOADED method with string parameter  "+name);
        }
        public void practice1(int a){
            System.out.println("This is my number "+a);
        }
        public void practice1(int b, String string){
            System.out.println("This is my last overloaded method *****"+ b+"----"+string);
        }
        public void practice1(boolean yes){
            System.out.println("Message form boolean conditioning method  >>>"+ yes);
        }
    }

