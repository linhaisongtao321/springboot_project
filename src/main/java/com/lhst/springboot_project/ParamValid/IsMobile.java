package com.lhst.springboot_project.ParamValid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {IsMobileValidator.class })//通过调用IsMobileValidator这个校验器来进行校验
public @interface IsMobile {

    boolean required() default true; //默认允许为空
    String message() default "手机号码格式错误";//如果校验不通过的信息

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}