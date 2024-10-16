package lk.ijse.gdse68.springpossystembackend.dto;

import lk.ijse.gdse68.springpossystembackend.customerObj.PlaceOrderResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class OrdersDTO implements Serializable, PlaceOrderResponse {
    private String order_id;
    private LocalDate date;
    private String customer_id;
    private List<OrderDetailsDTO> orderDetails = new ArrayList<>();
    private double total;
    double txtCash;
    double txtDiscount;
    private int qty;

}
