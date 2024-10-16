package lk.ijse.gdse68.springpossystembackend.customerObj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlaceOrderErrorResponse implements PlaceOrderResponse, Serializable {
    private String state;
    private String message;
    private Object data;
}
