package com.xworkz.runtimeexceptionclass.external;

import com.xworkz.runtimeexceptionclass.events.NumberOutOfBound;
import com.xworkz.runtimeexceptionclass.internal.SocialMedia;

public class SocialMediaRunner {
    public static void main(String[] args) throws NumberOutOfBound {
        SocialMedia socialMedia=new SocialMedia(49);
        socialMedia.noOfApp();
    }
}
