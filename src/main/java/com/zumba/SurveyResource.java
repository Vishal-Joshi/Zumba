package com.zumba;

import org.springframework.stereotype.Component;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by root on 24/9/14.
 */
@Component
@Path("/profile/{profileId}/survey")
public class SurveyResource {

    @POST
    public Response createSurvey(@PathParam("profileId") Long surveyId){
        if(surveyId!=null) {
            return Response.ok().build();
        } else{
            return Response.noContent().build();
        }
    }
}
