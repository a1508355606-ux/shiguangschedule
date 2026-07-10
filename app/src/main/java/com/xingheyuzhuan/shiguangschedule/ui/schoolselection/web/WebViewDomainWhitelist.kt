package com.xingheyuzhuan.shiguangschedule.ui.schoolselection.web

/**
 * WebView 域名白名单工具。
 * 用于 WebViewClient.shouldOverrideUrlLoading 中限制可访问域名。
 *
 * 默认放行的域名后缀:
 *   - *.edu.cn   (中国高校教务系统)
 *   - github.com / *.github.com (拉取适配脚本仓库)
 *
 * 其他域名默认拒绝导航,扼制钓鱼域名威胁。
 */
object WebViewDomainWhitelist {
    private val ALLOWED_SUFFIXES = listOf(
        ".edu.cn",
        "github.com",
        "githubusercontent.com",
        "github.io"
    )

    /** 测试 uri host 是否命中白名单 */
    fun isAllowed(host: String?): Boolean {
        if (host.isNullOrBlank()) return false
        val lower = host.lowercase()
        return ALLOWED_SUFFIXES.any { lower.endsWith(it) }
    }
}
