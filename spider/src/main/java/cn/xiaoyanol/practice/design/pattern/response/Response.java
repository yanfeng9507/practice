package cn.xiaoyanol.practice.design.pattern.response;

import lombok.Data;

import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-07-31
 * @Time: 上午10:46
 */
@Data
public class Response {

    private byte[] data;

    public Response(byte[] data) {
        this.data = data;
    }

}
