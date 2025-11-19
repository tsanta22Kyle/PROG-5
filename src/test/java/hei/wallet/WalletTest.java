package hei.wallet;

import hei.model.Wallet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class WalletTest {
    @Test
    public void ShouldNotAddItemWhenFullInventory(){
        Wallet myWalletTest = new Wallet();
        myWalletTest.setItemsLimit(2);
        myWalletTest.setInventory(List.of("credit_card", "debit_card"));

        myWalletTest.addItem("tsisy lty ah");

        Assertions.assertEquals(myWalletTest.getItemsLimit(), myWalletTest.getInventory().size());
    }
    @Test
    public void ShouldNotDecreaseWhenLowAmount(){
        Wallet myWalletTest = new Wallet();
        myWalletTest.setAmount(20.0);
        myWalletTest.decreaseAmount(100.0);
        Assertions.assertEquals(20.0, myWalletTest.getAmount());
    }
}
