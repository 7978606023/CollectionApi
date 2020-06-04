package com.ip.collection;

import static com.ip.collection.ProductFixtures.door;
import static com.ip.collection.ProductFixtures.floorPanel;
import static com.ip.collection.ProductFixtures.window;
import static org.hamcrest.Matchers.contains;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import org.testng.annotations.Test;
import com.ip.model.Shipment;


/**
 * @author PRATAP
 *
 */
public class ShipmentTest {
  private Shipment shipment = new Shipment();

  
  @Test
  public void shouldAddItems() throws Exception {
    shipment.add(door);
    shipment.add(window);

    assertThat(shipment, contains(door, window));
  }

  @Test
  public void shouldReplaceItems() throws Exception {
    shipment.add(door);
    shipment.add(window);

    shipment.replace(door, floorPanel);

    assertThat(shipment, contains(floorPanel, window));
  }

  @Test
 public void shouldNotReplaceMissingItems() throws Exception {
    shipment.add(window);

    shipment.replace(door, floorPanel);

    assertThat(shipment, contains(window));
  }

   
 @Test
 public void shouldIdentifyVanRequirements() throws Exception {
    shipment.add(door);
    shipment.add(window);
    shipment.add(floorPanel);

    shipment.prepare();

        assertThat(shipment.getHeavyVanProducts(), contains(floorPanel, door));
//         List<Product> pr = shipment.getLightVanProducts();
//         for(Product p: pr) {
//         System.out.println(p);
//  }
  }
}
