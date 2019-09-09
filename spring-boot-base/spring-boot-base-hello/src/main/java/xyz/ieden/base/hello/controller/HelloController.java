package xyz.ieden.base.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.ieden.common.entity.Result;
import xyz.ieden.common.util.ResultUtils;

import java.util.Arrays;
import java.util.List;

/**
 * HelloController
 *
 * @author gavin
 * @version 1.0
 * @date 2019/9/10 0:35
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping(value = "data")
    public Result<List<Integer>> getData() {
        LOGGER.info("Request HelloController.getData Begin.");
        List<Integer> data = Arrays.asList(1, 2, 3, 4);
        Result<List<Integer>> result = ResultUtils.getResult(data);
        LOGGER.info("Response Data:{}.", result.toString());
        return result;
    }

}
