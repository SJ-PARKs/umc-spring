package umc.spring.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;
import umc.spring.apiPayload.code.status.ErrorStatus;
import umc.spring.validation.annotation.CheckPage;

@Component
public class CheckPageValidator implements ConstraintValidator<CheckPage, Integer>{
    @Override
    public void initialize(CheckPage constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value == null || value < 1){
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(ErrorStatus.INVALID_PAGE_NUMBER.toString())
                    .addConstraintViolation();
            return false;
        }
        return true;
    }

    public Integer validateAndTransformPage(Integer page) {
        return page - 1;
    }
}
