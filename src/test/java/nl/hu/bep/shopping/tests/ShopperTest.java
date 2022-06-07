package nl.hu.bep.shopping.tests;

import nl.hu.bep.shopping.model.Product;
import nl.hu.bep.shopping.model.Shopper;
import nl.hu.bep.shopping.model.ShoppingList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopperTest {
    private Shopper p;
    private ShoppingList il, al;

    @BeforeEach
    public void setup() {
        p = new Shopper("Dum-Dum", "admin", "geheim");
        il = new ShoppingList("initialList", p);
        al = new ShoppingList("anotherList", p);
        p.addList(il);
        p.addList(al);
        il.addItem(new Product("Cola Zero"), 4);
        il.addItem(new Product("Cola Zero"), 4);
        il.addItem(new Product("Toiletpapier 6stk"), 1);
        al.addItem(new Product("Paracetamol 30stk"), 3);
    }

    @Test
    public void shouldHaveTwoLists() {
        assertEquals(2, p.getAllLists().size());
    }

}
