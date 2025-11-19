package hei.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;


@Data
public class Wallet {
   private Double amount;
   private Double weight;
   private String color;
   //private Boolean cardSlot;
   private int itemsLimit;
   private List<String> inventory = new ArrayList<>(itemsLimit);

   public void addItem(String item) {
       try{

       if(inventory.size() == itemsLimit) {
           System.out.println("not enough space");
       }
       inventory.add(item);
       }catch (UnsupportedOperationException e){
           System.out.println("not enough space");
       }
   }
   public void addAmount(Double amount) {
       this.amount = this.amount+amount;
   }
   public void decreaseAmount(Double amount) {
       if(amount> this.amount) {
           System.out.println("amount  cant be superior to available amount");
       }else{
       this.amount = this.amount-amount;
       }
   }
}
