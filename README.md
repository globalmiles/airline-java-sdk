# Getting started

API for Airlines

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=Global%20Miles%20Airline%20API-Java&workspaceName=GlobalMilesAirlineAPI&projectName=GlobalMilesAirlineAPILib&rootNamespace=com.globalmiles.api.test1)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=Global%20Miles%20Airline%20API-Java&workspaceName=GlobalMilesAirlineAPI&projectName=GlobalMilesAirlineAPILib&rootNamespace=com.globalmiles.api.test1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=Global%20Miles%20Airline%20API-Java&workspaceName=GlobalMilesAirlineAPI&projectName=GlobalMilesAirlineAPILib&rootNamespace=com.globalmiles.api.test1)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=Global%20Miles%20Airline%20API-Java&workspaceName=GlobalMilesAirlineAPI&projectName=GlobalMilesAirlineAPILib&rootNamespace=com.globalmiles.api.test1)

## How to Use

The following section explains how to use the GlobalMilesAirlineAPI library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Global%20Miles%20Airline%20API-Java&workspaceName=GlobalMilesAirlineAPI&projectName=GlobalMilesAirlineAPILib&rootNamespace=com.globalmiles.api.test1)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Global%20Miles%20Airline%20API-Java&workspaceName=GlobalMilesAirlineAPI&projectName=GlobalMilesAirlineAPILib&rootNamespace=com.globalmiles.api.test1)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Global%20Miles%20Airline%20API-Java&workspaceName=GlobalMilesAirlineAPI&projectName=GlobalMilesAirlineAPILib&rootNamespace=com.globalmiles.api.test1)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Global%20Miles%20Airline%20API-Java&workspaceName=GlobalMilesAirlineAPI&projectName=GlobalMilesAirlineAPILib&rootNamespace=com.globalmiles.api.test1)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Global%20Miles%20Airline%20API-Java&workspaceName=GlobalMilesAirlineAPI&projectName=GlobalMilesAirlineAPILib&rootNamespace=com.globalmiles.api.test1)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *GlobalMilesAirlineAPILib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Global%20Miles%20Airline%20API-Java&workspaceName=GlobalMilesAirlineAPI&projectName=GlobalMilesAirlineAPILib&rootNamespace=com.globalmiles.api.test1)

Clicking the ``` Add ``` button will open a dialog where you need to specify GlobalMilesAirlineAPI in ``` Group Id ``` and GlobalMilesAirlineAPILib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Global%20Miles%20Airline%20API-Java&workspaceName=GlobalMilesAirlineAPI&projectName=GlobalMilesAirlineAPILib&rootNamespace=com.globalmiles.api.test1)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Global%20Miles%20Airline%20API-Java&workspaceName=GlobalMilesAirlineAPI&projectName=GlobalMilesAirlineAPILib&rootNamespace=com.globalmiles.api.test1)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *GlobalMilesAirlineAPILib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### 

API client can be initialized as following.

```java

GlobalMilesAirlineAPIClient client = new GlobalMilesAirlineAPIClient();
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [FlightsController](#flights_controller)

## <a name="flights_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.globalmiles.api.test1.controllers.FlightsController") FlightsController

### Get singleton instance

The singleton instance of the ``` FlightsController ``` class can be accessed from the API Client.

```java
FlightsController flights = client.getFlights();
```

### <a name="create_recommend_a_new_member_async"></a>![Method: ](https://apidocs.io/img/method.png "com.globalmiles.api.test1.controllers.FlightsController.createRecommendANewMemberAsync") createRecommendANewMemberAsync

> This endpoint allows to recommend a new member to airlines.


```java
void createRecommendANewMemberAsync(
        final String accept,
        final String contentType,
        final NewMemberRequest body,
        final APICallBack<NewMemberResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accept |  ``` Required ```  ``` DefaultValue ```  | It advertises which content type is able to understand. |
| contentType |  ``` Required ```  ``` DefaultValue ```  | It tells the client what the content type of the returned. |
| body |  ``` Required ```  | The body of the request. |


#### Example Usage

```java
try {
    String accept = "application/json";
    String contentType = "application/json";
    NewMemberRequest body = new NewMemberRequest();
    // Invoking the API call with sample inputs
    flights.createRecommendANewMemberAsync(accept, contentType, body, new APICallBack<NewMemberResponse>() {
        public void onSuccess(HttpContext context, NewMemberResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="create_flight_status_async"></a>![Method: ](https://apidocs.io/img/method.png "com.globalmiles.api.test1.controllers.FlightsController.createFlightStatusAsync") createFlightStatusAsync

> This endpoint allows to search the status of flight.


```java
void createFlightStatusAsync(
        final String accept,
        final String contentType,
        final FlightStatusRequest body,
        final APICallBack<FlightStatusResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accept |  ``` Required ```  ``` DefaultValue ```  | It advertises which content type is able to understand. |
| contentType |  ``` Required ```  ``` DefaultValue ```  | It tells the client what the content type of the returned. |
| body |  ``` Required ```  | The body of the request. |


#### Example Usage

```java
try {
    String accept = "application/json";
    String contentType = "application/json";
    FlightStatusRequest body = new FlightStatusRequest();
    // Invoking the API call with sample inputs
    flights.createFlightStatusAsync(accept, contentType, body, new APICallBack<FlightStatusResponse>() {
        public void onSuccess(HttpContext context, FlightStatusResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="create_flight_creation_async"></a>![Method: ](https://apidocs.io/img/method.png "com.globalmiles.api.test1.controllers.FlightsController.createFlightCreationAsync") createFlightCreationAsync

> This endpoint allows to create a flight on the system and defines the mileage rules for the passenger.


```java
void createFlightCreationAsync(
        final String accept,
        final String contentType,
        final FlightCreateRequest body,
        final APICallBack<Response> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accept |  ``` Required ```  ``` DefaultValue ```  | It advertises which content type is able to understand. |
| contentType |  ``` Required ```  ``` DefaultValue ```  | It tells the client what the content type of the returned. |
| body |  ``` Required ```  | The body of the request. |


#### Example Usage

```java
try {
    String accept = "application/json";
    String contentType = "application/json";
    FlightCreateRequest body = new FlightCreateRequest();
    // Invoking the API call with sample inputs
    flights.createFlightCreationAsync(accept, contentType, body, new APICallBack<Response>() {
        public void onSuccess(HttpContext context, Response response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="create_member_search_async"></a>![Method: ](https://apidocs.io/img/method.png "com.globalmiles.api.test1.controllers.FlightsController.createMemberSearchAsync") createMemberSearchAsync

> This endpoint allows to search a member on the airline system.


```java
void createMemberSearchAsync(
        final String accept,
        final String contentType,
        final MemberSearchRequest body,
        final APICallBack<MemberSearchResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accept |  ``` Required ```  ``` DefaultValue ```  | It advertises which content type is able to understand. |
| contentType |  ``` Required ```  ``` DefaultValue ```  | It tells the client what the content type of the returned. |
| body |  ``` Required ```  | The body of the request. |


#### Example Usage

```java
try {
    String accept = "application/json";
    String contentType = "application/json";
    MemberSearchRequest body = new MemberSearchRequest();
    // Invoking the API call with sample inputs
    flights.createMemberSearchAsync(accept, contentType, body, new APICallBack<MemberSearchResponse>() {
        public void onSuccess(HttpContext context, MemberSearchResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)



# airline-java-sdk
