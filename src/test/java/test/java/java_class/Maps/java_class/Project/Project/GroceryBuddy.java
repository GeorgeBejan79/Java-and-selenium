package test.java.java_class.Project.Project;

public class GroceryBuddy extends CheckOut {

    String [] fruits = {"apple", "orange", "watermelon", "banana", "pineapple", "grapes", "mango", "strawberry","peach","cherry"};
    String [] vegetables = {"carrot", "broccoli", "onion", "potato", "tomato", "cucumber", "corn", "bean","spinach","pepper"};
    String [] products = {"milk", "bread", "beef", "eggs", "chicken", "sugar", "salt", "coffee","rice","pasta"};

    double[] priceFruits={3.99, 5.99, 2.99, 1.59, 1.89, 6.99, 4.99, 3.59, 4.59, 7.99};
    double[] priceVegetables={2.99, 3.59, 1.39, 4.89, 1.29, 3.79, 4.45, 1.55, 5.25, 3.99};
    double[] priceProducts={5.88, 4.25, 9.99, 5.99, 2.99, 1.55, 7.99, 6.99, 2.59};

    public void printFruits(String fruit){
        for (int i = 0; i < fruits.length ; i++) {
            if(fruits[i].equalsIgnoreCase(fruit)){
                System.out.println(fruits[i]);
            }
        }
    }
    public void printVegetables(String vegetable){
        for (int i = 0; i < vegetables.length ; i++) {
            if(vegetables[i].equalsIgnoreCase(vegetable)){
                System.out.println(vegetables[i]);
            }
        }
    }
    public void printProducts(String product){
        for (int i = 0; i < products.length ; i++) {
            if(products[i].equalsIgnoreCase(product)){
            System.out.println(products[i]);
        }}
    }
    public Double getPriceFruits(String fruit){
        for (int i = 0; i < fruits.length ; i++) {
            if(fruits[i].equals(fruit)){
                return priceFruits[i];
            }
            }
        return null;
        }
    public Double getPriceVegetable(String vegetable) {
        for (int i = 0; i < vegetables.length; i++) {
            if (vegetables[i].equals(vegetable)) {
                return priceVegetables[i];
            }
        }
        return null;
    }
    public Double getPriceProducts(String product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(product)) {
                return priceProducts[i];
            }
        }
        return null;
    }
    public void printAllItems(String product) {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
  
        }
    }