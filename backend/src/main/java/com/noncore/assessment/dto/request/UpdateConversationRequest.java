package com.noncore.assessment.dto.request;

import lombok.Data;

@Data
public class UpdateConversationRequest {
    private String title;
    private Boolean pinned;
    private Boolean archived;
}


