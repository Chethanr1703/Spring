package com.xworkz.matrimonyapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatrimonyDTO {
    private String email;
    private  String forWhom;
  private   char gender;
  private String dob;
  private String religion;
  private String motherTongue;
  private String martialStatus;
  private int height;
}
