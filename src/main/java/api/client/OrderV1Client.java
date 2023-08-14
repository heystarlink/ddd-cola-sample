package api.client;

import api.annotation.FeignClient;
import api.endpoint.OrderApiEndpoint;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
@FeignClient(name = "order.service")
public interface OrderV1Client extends OrderApiEndpoint {

}
