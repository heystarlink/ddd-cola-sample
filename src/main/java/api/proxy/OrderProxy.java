package api.proxy;

import api.endpoint.OrderApiEndpoint;
import api.model.dto.Request;
import api.model.param.OrderSaveParam;
import com.cola.sample.adapter.endpoint.OrderApiEndpointImpl;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public class OrderProxy {
    /**
     * 保存订单
     * @param orderSaveParam
     * @return
     */
    public Boolean save(OrderSaveParam orderSaveParam) {
        OrderApiEndpoint apiEndpoint = new OrderApiEndpointImpl();
        return apiEndpoint.save(new Request<>(orderSaveParam)).getBody();
    }
}
