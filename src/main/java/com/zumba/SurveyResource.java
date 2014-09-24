package com.zumba;

import org.springframework.stereotype.Component;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by root on 24/9/14.
 */
@Component
@Path("profile/{profileId}/survey")
public class SurveyResource {

    @POST
    public String createSurvey(@PathParam("profileId") Long surveyId){
        return "success";
    }
}
