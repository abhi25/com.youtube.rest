package com.youtube.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import java.sql.*;



/**
 * This is the root path for our restful api service
 * In the web.xml file, we specified that /api/* need to be in the URL to
 * get to this class.
 * 
 * We are versioning the class in the URL path.  This is the first version v1.
 * Example how to get to the root of this api resource:
 * http://localhost:7001/com.youtube.rest/api/v1/status
 * 
 * @author 308tube
 *
 */
@Path("/v1/status") //removed * wildcard to make this more compatible with tomcat
public class V1_status {

        private static final String api_version = "00.02.00"; //version of the api
        
        /**
         * This method sits at the root of the api.  It will return the name
         * of this api.
         * 
         * @return String - Title of the api
         */
        @GET
        @Produces(MediaType.TEXT_HTML)
        public String returnTitle() {
                return "<p>Java Web Service for testing</p>";
        }
        
        /**
         * This method will return the version number of the api
         * Note: this is nested one down from the root.  You will need to add version
         * into the URL path.
         * 
         * Example:
         * http://localhost:7001/com.youtube.rest/api/v1/status/version
         * 
         * @return String - version number of the api
         */
        @Path("/version")
        @GET
        @Produces(MediaType.TEXT_HTML)
        public String returnVersion() {
                return "<p>Version:</p>" + api_version;
        }
        
        /**
         * This method will connect to the oracle database and return the date/time stamp.
         * It will then return the date/time to the user in String format
         * 
         * This was explained in Part 3 of the Java Rest Tutorial Series on YouTube
         * 
         * @return String -  returns the database date/time stamp
         * @throws Exception
         */
     
        
}