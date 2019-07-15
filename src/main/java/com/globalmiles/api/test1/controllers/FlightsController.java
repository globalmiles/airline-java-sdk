/*
 * GlobalMilesAirlineAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import com.globalmiles.api.test1.*;
import com.globalmiles.api.test1.models.*;
import com.globalmiles.api.test1.exceptions.*;
import com.globalmiles.api.test1.http.client.HttpClient;
import com.globalmiles.api.test1.http.client.HttpContext;
import com.globalmiles.api.test1.http.request.HttpRequest;
import com.globalmiles.api.test1.http.response.HttpResponse;
import com.globalmiles.api.test1.http.response.HttpStringResponse;
import com.globalmiles.api.test1.http.client.APICallBack;
import com.globalmiles.api.test1.controllers.syncwrapper.APICallBackCatcher;

public class FlightsController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static FlightsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the FlightsController class 
     */
    public static FlightsController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new FlightsController();
                }
            }
        }
        return instance;
    }

    /**
     * This endpoint allows to search the status of flight.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the FlightStatusResponse response from the API call 
     */
    public FlightStatusResponse createFlightStatus(
                final FlightStatusRequest body
    ) throws Throwable {

        HttpRequest _request = _buildCreateFlightStatusRequest(body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleCreateFlightStatusResponse(_context);
    }

    /**
     * This endpoint allows to search the status of flight.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void createFlightStatusAsync(
                final FlightStatusRequest body,
                final APICallBack<FlightStatusResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildCreateFlightStatusRequest(body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            FlightStatusResponse returnValue = _handleCreateFlightStatusResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for createFlightStatus
     */
    private HttpRequest _buildCreateFlightStatusRequest(
                final FlightStatusRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v1/airline/flights/actions/status");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");
        _headers.put("content-type", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for createFlightStatus
     * @return An object of type void
     */
    private FlightStatusResponse _handleCreateFlightStatusResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        FlightStatusResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<FlightStatusResponse>(){});

        return _result;
    }

    /**
     * This endpoint allows to create a flight on the system and defines the mileage rules for the passenger.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the Response response from the API call 
     */
    public Response createFlightCreation(
                final FlightCreateRequest body
    ) throws Throwable {

        HttpRequest _request = _buildCreateFlightCreationRequest(body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleCreateFlightCreationResponse(_context);
    }

    /**
     * This endpoint allows to create a flight on the system and defines the mileage rules for the passenger.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void createFlightCreationAsync(
                final FlightCreateRequest body,
                final APICallBack<Response> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildCreateFlightCreationRequest(body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            Response returnValue = _handleCreateFlightCreationResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for createFlightCreation
     */
    private HttpRequest _buildCreateFlightCreationRequest(
                final FlightCreateRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v1/airline/flights");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");
        _headers.put("content-type", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for createFlightCreation
     * @return An object of type void
     */
    private Response _handleCreateFlightCreationResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        Response _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<Response>(){});

        return _result;
    }

}
