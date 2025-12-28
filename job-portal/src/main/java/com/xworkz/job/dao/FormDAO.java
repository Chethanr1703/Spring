package com.xworkz.job.dao;

import com.xworkz.job.dto.ApplicationFormDTO;

public interface FormDAO {
    boolean saveApplicationForm(ApplicationFormDTO applicationFormDTO);
    boolean checkEmail(ApplicationFormDTO applicationFormDTO);

    ApplicationFormDTO getApplicationFromDAO( String email);
   boolean updateApplicationForm(ApplicationFormDTO applicationFormDTO);



   boolean deleteForm(String email);

}
