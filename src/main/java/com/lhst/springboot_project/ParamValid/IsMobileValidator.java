package com.lhst.springboot_project.ParamValid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsMobileValidator implements ConstraintValidator<IsMobile,String> {

    private boolean required = false;//不能为空

    //初始化
    public void initialize(IsMobile constraintAnnotation){
        required = constraintAnnotation.required(); //是否为空
    }

    public boolean isValid(String value, ConstraintValidatorContext context){

        return true;
    }
}