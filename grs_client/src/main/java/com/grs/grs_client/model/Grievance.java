package com.grs.grs_client.model;

import com.grs.grs_client.enums.GrievanceCurrentStatus;
import com.grs.grs_client.enums.ServiceType;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class Grievance {
    private Long id;
    private Date submissionDate;
    private ServiceType grievanceType;
    private GrievanceCurrentStatus grievanceCurrentStatus;
    private String subject;
    private String details;
    private String trackingNumber;
    private Long officeId;
    private ServiceOrigin serviceOrigin;
    private ServiceOrigin serviceOriginBeforeForward;
    private Long complainantId;
    private boolean grsUser;
    private boolean isAnonymous;
    private String caseNumber;
    private String otherService;
    private String otherServiceBeforeForward;
    private String serviceReceiver;
    private String serviceReceiverRelation;
    private Long currentAppealOfficeId;
    private Long sendToAoOfficeId;
    private Long currentAppealOfficerOfficeUnitOrganogramId;
    private String groDecision;
    private String groIdentifiedCause;
    private String groSuggestion;
    private String appealOfficerDecision;
    private String appealOfficerIdentifiedCause;
    private String appealOfficerSuggestion;
    private Float rating;
    private Float appealRating;
    private Boolean isRatingGiven;
    private Boolean isAppealRatingGiven;
    private String feedbackComments;
    private String appealFeedbackComments;
    private Boolean isOfflineGrievance;
    private Long uploaderOfficeUnitOrganogramId;
    private Boolean isSelfMotivatedGrievance;
    private String sourceOfGrievance;
    private boolean safetyNet;
    private String officeLayers;
    private Integer complaintCategory;
    private Integer spProgrammeId;
    private Integer geoDivisionId;
    private Integer geoDistrictId;
    private Integer geoUpazilaId;
    private String mediumOfSubmission;
    private Date createdAt;
    private Date updatedAt;
    private Long createdBy;
    private Long modifiedBy;
    private Boolean status;
    private List<AttachedFile> attachedFiles;
}
