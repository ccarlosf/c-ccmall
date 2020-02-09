package com.ccarlos.ccmall.core;

import com.ccarlos.ccmall.core.configuration.ExceptionCodeConfiguration;
import com.ccarlos.ccmall.exception.http.HttpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;

/**
 * @description: 全局异常处理类
 * @author: ccarlos
 * @date: 2020/2/8 19:46
 */
@ControllerAdvice
public class GlobalExceptionAdvice {

    @Autowired
    private ExceptionCodeConfiguration codeConfiguration;

    /**
     * @description: 处理通用异常
     * @author: ccarlos
     * @date: 2020/2/8 19:46
     * @return: void
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public UnifyResponse handleException(HttpServletRequest req, Exception e) {
        String requestUrl = req.getRequestURI();
        String method = req.getMethod();
        System.out.println(e);
        UnifyResponse message = new UnifyResponse(9999,"服务器异常",method+" "+requestUrl);
        return message;
    }
    
    /**
     * @description: 处理通用异常
     * @author: ccarlos
     * @date: 2020/2/8 20:59
     * @param: req 请求
     * @param: e 异常
     * @return: void
     */
    @ExceptionHandler(HttpException.class)
    public ResponseEntity<UnifyResponse> handleHttpException(HttpServletRequest req, HttpException e){
        String requestUrl = req.getRequestURI();
        String method = req.getMethod();

//        ResponseEntity
        UnifyResponse message = new UnifyResponse(e.getCode(), codeConfiguration.getMessage(e.getCode()), method + " " + requestUrl);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpStatus httpStatus = HttpStatus.resolve(e.getHttpStatusCode());

        ResponseEntity<UnifyResponse> r = new ResponseEntity<>(message,headers,httpStatus);
        return r;
    }


    /**
     * @description: 处理Bean校验异常
     * @author: ccarlos
     * @date: 2020/2/9 21:03
     * @param: req 请求
     * @param: e 异常
     * @return: org.springframework.http.ResponseEntity<com.ccarlos.ccmall.core.UnifyResponse>
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public UnifyResponse handleBeanValidation(HttpServletRequest req, MethodArgumentNotValidException e) {
        String requestUrl = req.getRequestURI();
        String method = req.getMethod();

        List<ObjectError> errors = e.getBindingResult().getAllErrors();
        String message = formatAllErrorMessages(errors);

        return new UnifyResponse(1001, message, method + " " + requestUrl);
    }

    /**
     * @description: 处理url参数校验 ConstraintViolationException 异常
     * @author: ccarlos
     * @date: 2020/2/9 21:20
     * @param: req 请求
     * @param: e 异常
     * @return: com.ccarlos.ccmall.core.UnifyResponse
     */
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public UnifyResponse handelConstraintException(HttpServletRequest req, ConstraintViolationException e) {
        String requestUrl = req.getRequestURI();
        String method = req.getMethod();
        String message = e.getMessage();

        return new UnifyResponse(10001, message, method + " " + requestUrl);
//        for(ConstraintViolation error:e.getConstraintViolations()){
//            ConstraintViolation a = error;
//        }
    }

    /**
     * @description: 格式化Bean异常校验信息
     * @author: ccarlos
     * @date: 2020/2/9 21:10
     * @param: errors 异常列表
     * @return: java.lang.String
     */
    private String formatAllErrorMessages(List<ObjectError> errors) {
        StringBuffer errorMsg = new StringBuffer();
        errors.forEach(error ->{
            errorMsg.append(error.getDefaultMessage()).append(';');
        });
        return errorMsg.toString();
    }
}
