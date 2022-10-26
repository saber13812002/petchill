package com.alexhong.common.exception;

/***
 *	错误码和错误信息定义类
 *	1. 错误码定义规则为 5 为数字
 *	2. 前两位表示业务场景，最后三位表示错误码。例如：100001。10:通用 001:系统未知异常
 *	3. 维护错误码后需要维护错误描述，将他们定义为枚举形式
 *	错误码列表：
 *	10: 通用
 *	001：参数格式校验
 *	11:  商品
 *	12:  订单
 *	13: 购物车
 *	14: 物流
 */

public enum BizCodeEnume {
    UNKNOWN_EXCEPTION(10000, "Unknown exception error"),
    VAILD_EXCEPTION(10001, "Parameters validation error"),

    PRODUCT_UP_EXCEPTION(11000, "Product upload error");

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private Integer code;
    private String msg;

    BizCodeEnume(int code, String msg){
        this.code = code;
        this.msg = msg;
    }



}
