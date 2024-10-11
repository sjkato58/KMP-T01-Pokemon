package com.mtfuji.sakura.utils.common.outcome

import com.mtfuji.sakura.utils.common.EMPTY

sealed class Outcome<out SUCCESS, out FAIL>(
    val isSuccess: Boolean
) {
    data class Success<SUCCESS, FAIL>(
        val value: SUCCESS
    ): Outcome<SUCCESS, FAIL>(true)
    data class Failure<SUCCESS, FAIL>(
        val value: FAIL? = null,
        val message: String = String.EMPTY
    ): Outcome<SUCCESS, FAIL>(false)
}