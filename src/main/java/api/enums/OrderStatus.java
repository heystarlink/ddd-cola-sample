package api.enums;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public enum OrderStatus {

    CREATED(1, "创建订单"),
    COMPLETED(2, "完成订单"),
    CANCELLED(3, "取消订单");

    private int code;
    private String desc;

    OrderStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
