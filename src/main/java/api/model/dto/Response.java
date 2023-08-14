package api.model.dto;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public class Response<T>{

    private T body;

    public Response(T body) {
        this.body = body;
    }

    public T getBody() {
        return body;
    }
}
