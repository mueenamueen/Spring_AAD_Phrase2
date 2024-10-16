package lk.ijse.gdse68.springpossystembackend.dto;

import lk.ijse.gdse68.springpossystembackend.customerObj.CustomerResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO implements SuperDTO, CustomerResponse {
    private String id;
    private String name;
    private String address;
    private Double salary;
}
