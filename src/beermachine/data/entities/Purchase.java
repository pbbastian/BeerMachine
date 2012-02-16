package beermachine.data.entities;

import java.util.Calendar;
import java.util.Set;

public class Purchase {
    private Long id;
    private Calendar TimeAndDate;
    private Customer customer;
    private Set<PurchaseLine> purchaseLines;
}
