
package test.java.java_class.Project.Project;

import java.util.ArrayList;

public class GroceryList extends GroceryBuddy {
    ArrayList<String> item = new ArrayList<>();

    /*
    ++public boolean storeProduct(String productName) {
        if(getPrice(productName)==0){
            return false;
        }else{
            //return shoppingCart.add(productName);

        }
        //System.out.println("sorry this product is not available at this moment");
    }*/
//    public ArrayList purchasedList(String item){
//
//
//    }



        public double getPrice(String product){
            /*int totalPrice=0;
            for(String productNAme: shopingCart){
                totalPrice+=getItemPrice(ProductName);
            }*/


            /*double price= getPriceFruits(product) + getPriceVegetable(product) + getPriceProducts(product);// sum of the produce*/
            //return price;
            return 0;
        }


        public void updatedProduct(Integer position, String newItem) {
        item.set(position, newItem);

        }

        public void removeItem(String theItem) {
        for (int i = 0; i < item.size(); i++) {
            if (theItem.equalsIgnoreCase(item.get(i))) {
                item.remove(item.indexOf(theItem));
            }
        }
        }

        public void updateList(String product, String newItem) {
        item.set(item.indexOf(product), newItem);
        }

        public int position(String product) {
        System.out.println(item.indexOf(product));
        return position(product);
        }

        public String replaceItem(String currentItem, String newItem) {
        int index=item.indexOf(currentItem);
            return item.set(index,newItem);
        }

            public double getTotalPrice() {
                double totalPrice = 0.0;
                for (int i = 0; i < item.size(); i++) {
                    totalPrice += getPrice(item.get(i));
                }
                if (totalPrice > 50 && totalPrice < 100) {
                } else if (totalPrice >= 100) {

                }return totalPrice;
            }

}
        















