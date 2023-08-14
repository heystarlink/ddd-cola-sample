package api.endpoint;

import api.annotation.Api;
import api.annotation.ApiImplicitParam;
import api.annotation.ApiOperation;
import api.annotation.PostMapping;
import api.annotation.RequestBody;
import api.model.dto.Request;
import api.model.dto.Response;
import api.model.param.OrderSaveParam;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
@Api(tags = "订单服务")
public interface OrderApiEndpoint {

    String FACTORY_API = "OrderApiEndpoint";

    @ApiOperation(value = "新增订单操作", notes = "新增订单操作", response = Boolean.class)
    @ApiImplicitParam(name = "request", value = "订单信息", required = true, dataType = "Request«OrderSaveParam»",
            paramType = "body")
    @PostMapping(value = "/endpoint/v5/factory/save")
    Response<Boolean> save(@RequestBody Request<OrderSaveParam> request);
}
