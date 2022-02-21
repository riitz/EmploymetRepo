package com.kuebiko.employmentservice.utility;

import com.kuebiko.employmentservice.models.Employment;

public class EmploymentValidation {

    public static void validateEmployment(Employment toValidate) throws Exception {

        String company = toValidate.getCompany();
        if(company == null) {
            throw new Exception("company name is required.");
        }

    }

}
