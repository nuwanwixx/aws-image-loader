package com.nuwanwixx.awsimageloader.dataStore;

import com.nuwanwixx.awsimageloader.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES =  new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("520bfdf4-a0f1-4941-bd0e-199763001826"),"nuwanwixx", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("732639e0-4e6b-43b4-8257-34ab0e235622"),"sachi0602", null));
    }

    public  List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
