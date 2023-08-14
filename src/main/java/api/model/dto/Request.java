package api.model.dto;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public class Request<T> {


    private T body;


    public Request(T body) {
        this.body = body;
    }

    public T getBody() {
        return body;
    }
}
