package com.cola.sample.domain.req;

import api.model.dto.BillingDTO;
import api.model.dto.CustomerDTO;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public class CreateOrderRequest {
    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单类型
     */
    private Integer orderCategoryType;

    /**
     * 客户信息
     */
    private CustomerDTO customerDTO;

    /**
     * 付款信息
     */
    private BillingDTO billingDTO;


    /**
     * 订单备注
     */
    private String orderNote;

    /**
     * 配送方式
     */
    private Integer shippingType;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderCategoryType() {
        return orderCategoryType;
    }

    public void setOrderCategoryType(Integer orderCategoryType) {
        this.orderCategoryType = orderCategoryType;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public BillingDTO getBillingDTO() {
        return billingDTO;
    }

    public void setBillingDTO(BillingDTO billingDTO) {
        this.billingDTO = billingDTO;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }

    public Integer getShippingType() {
        return shippingType;
    }

    public void setShippingType(Integer shippingType) {
        this.shippingType = shippingType;
    }

    public static final class CreateOrderRequestBuilder {
        private Long orderId;
        private Integer orderCategoryType;
        private CustomerDTO customerDTO;
        private BillingDTO billingDTO;
        private String orderNote;
        private Integer shippingType;

        private CreateOrderRequestBuilder() {
        }

        public static CreateOrderRequestBuilder aCreateOrderRequest() {
            return new CreateOrderRequestBuilder();
        }

        public CreateOrderRequestBuilder withOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        public CreateOrderRequestBuilder withOrderCategoryType(Integer orderCategoryType) {
            this.orderCategoryType = orderCategoryType;
            return this;
        }

        public CreateOrderRequestBuilder withCustomerDTO(CustomerDTO customerDTO) {
            this.customerDTO = customerDTO;
            return this;
        }

        public CreateOrderRequestBuilder withBillingDTO(BillingDTO billingDTO) {
            this.billingDTO = billingDTO;
            return this;
        }

        public CreateOrderRequestBuilder withOrderNote(String orderNote) {
            this.orderNote = orderNote;
            return this;
        }

        public CreateOrderRequestBuilder withShippingType(Integer shippingType) {
            this.shippingType = shippingType;
            return this;
        }

        public CreateOrderRequest build() {
            CreateOrderRequest createOrderRequest = new CreateOrderRequest();
            createOrderRequest.orderCategoryType = this.orderCategoryType;
            createOrderRequest.shippingType = this.shippingType;
            createOrderRequest.billingDTO = this.billingDTO;
            createOrderRequest.orderNote = this.orderNote;
            createOrderRequest.orderId = this.orderId;
            createOrderRequest.customerDTO = this.customerDTO;
            return createOrderRequest;
        }
    }
}
