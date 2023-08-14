package api.model.dto;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public class CustomerDTO {
    private Long customerId;

    private String customerName;

    private String phoneNumber;

    private String email;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static final class CustomerDTOBuilder {
        private Long customerId;
        private String customerName;
        private String phoneNumber;
        private String email;

        private CustomerDTOBuilder() {
        }

        public static CustomerDTOBuilder aCustomerDTO() {
            return new CustomerDTOBuilder();
        }

        public CustomerDTOBuilder withCustomerId(Long customerId) {
            this.customerId = customerId;
            return this;
        }

        public CustomerDTOBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public CustomerDTOBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public CustomerDTOBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public CustomerDTO build() {
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setCustomerId(customerId);
            customerDTO.setCustomerName(customerName);
            customerDTO.setPhoneNumber(phoneNumber);
            customerDTO.setEmail(email);
            return customerDTO;
        }
    }
}
