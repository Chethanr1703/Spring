package com.xworkz.job.service;

import com.xworkz.job.dto.ApplicationFormDTO;

public interface FormService {
    boolean validateForm(ApplicationFormDTO applicationFormDTO);

    ApplicationFormDTO getApplication(String email);

    boolean formUpdate(ApplicationFormDTO applicationFormDTO);

    boolean isDelete(String email);
}
