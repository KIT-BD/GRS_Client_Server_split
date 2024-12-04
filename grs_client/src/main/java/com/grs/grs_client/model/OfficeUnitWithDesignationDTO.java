package com.grs.grs_client.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OfficeUnitWithDesignationDTO {
    String officeUnitNameBangla;
    String officeUnitNameEnglish;
    String designation;
    Long officeUnitOrganogramId;
}
