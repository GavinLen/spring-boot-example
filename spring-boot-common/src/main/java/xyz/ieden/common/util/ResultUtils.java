package xyz.ieden.common.util;

import xyz.ieden.common.constant.ResultConstant;
import xyz.ieden.common.entity.Result;

import java.util.Objects;

/**
 * ResultUtils
 *
 * @author gavin
 * @version 1.0
 * @date 2019/9/10 0:41
 */
public class ResultUtils {

    /**
     * 验证 Result 的 SUCCESS 状态
     *
     * @param result
     * @param <T>
     * @return
     */
    public static <T> Boolean isSuccess(Result<T> result) {
        if (result == null) {
            return Boolean.FALSE;
        }
        if (Objects.equals(result.getCode(), ResultConstant.SUCCESS_CODE)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /**
     * 获取 Result
     *
     * @param code
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> Result<T> getResult(Integer code, String msg) {
        Result<T> result = new Result<>(code, msg);
        result.setRespTime(System.currentTimeMillis());
        return result;
    }

    /**
     * 获取 Result
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> getResult(T data) {
        Result<T> result = new Result<>(ResultConstant.SUCCESS_CODE, ResultConstant.SUCCESS_MSG);
        result.setRespTime(System.currentTimeMillis());
        result.setData(data);
        return result;
    }

}
