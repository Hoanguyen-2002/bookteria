package com.devteria.profile.service;

import com.devteria.profile.dto.request.ProfileCreationRequest;
import com.devteria.profile.dto.response.UserProfileResponse;
import com.devteria.profile.entity.UserProfile;
import org.springframework.stereotype.Service;


public interface UserProfileService {
    UserProfileResponse createProfile(ProfileCreationRequest request);
    UserProfileResponse getProfile(String id);
}
