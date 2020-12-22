package com.dashingqi.module.net

import com.dashingqi.dqhttp.response.IResponse

/**
 * @author : zhangqi
 * @time : 12/22/20
 * desc :
 */
class BaseResponse : IResponse {
    override fun getMessage(): String {
        return ""
    }

    override fun isSuccess(): Boolean {
        return true
    }

    override fun isTokenError(): Boolean {
        return true
    }
}