package com.qz.djmall.gateway.fallback;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qz.djmall.gateway.common.R;

@RestController
public class FallbackController {
	/**
	 * 在网关转发请求到微服务失败的时候熔断
	 * 主要是断网、超时
	 * @return
	 */
	@RequestMapping("/fallback")
    public R fallback() {
        return R.error(500, "网关转发服务失败");
    }
}
