package com.xingheyuzhuan.shiguangschedule.tool

/**
 * Certificate pinning helper placeholder.
 *  当前 fork 不强制执行 pin(因为学业教务域名证书经常更替,误 pin 可能导致大面积不可用),
 *  但预留工具类便于后续审计与加固时快速集成。
 */
object CertificatePinningHelper {
    // 供后续接 OkHttp CertificatePinner 使用,此处留空
    const val TAG = "CertPin"
}
