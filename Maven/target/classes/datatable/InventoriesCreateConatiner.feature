
#Regression suite for Inventory Container create
# Data Base tables
Feature: Create Container sceanrios

  Background: 
    Given the URI

  
  Scenario: 
    When Create the container with  Location name as Null
    Then the repsonse code should be 201

  
  Scenario: 
    When Create the container with  Location name as Empty
    Then the response code should be 201

  
  Scenario: 
    When Create the container with Unknown  Location name
    Then the response code should be 409

  
  Scenario: 
    When Create the container by passing values to locationOrgUnitId with more than specfied data range
    Then the response code is Bad request 400

  
  Scenario: 
    When Create the container by passing space in the  Location name
    Then the response code should be 201

  
  Scenario: 
    When Create the Container by passing floating values to locationOrgUnitId
    Then the response code should be 201 and locationOrgUnitId should be trimmed

  
  Scenario: 
    When Create the Container  by passing negative values to locationOrgUnitId
    Then the response code should be 201 and locationOrgUnitId should be trimmed

  
  Scenario: 
    When Create the Container by passing  null value to locationOrgUnitId
    Then the response code should be 201 and locationOrgUnitId should be trimmed

  
  Scenario: 
    When Create  the container with  User Name as Empty
    Then the response code should be 201

  
  Scenario: 
    When Create the container with Unknown  User Name
    Then the response code should be 201

  
  Scenario: 
    When Create  the container by passing values to Username with more than 15 chars
    Then the response code should be 201

  
  Scenario: 
    When Create container with Tracking Id as Null
    Then the response code should be 409

  
  Scenario: 
    When Create container with Tracking Id as Empty
    Then the response code should be 201

  
  Scenario: 
    When Create Container with Tracking id as Negative value
    Then the response code should be 201

  
  Scenario: 
    When Create container by passing string values/characters to containerId
    Then the response code is Bad request 400

  
  Scenario: 
    When Create Container by containerIdby passing floating values
    Then the response code is Bad request 201 and container id should be trimmed to accept only integer

  
  Scenario: 
    When Create Container by containerIdby passing negative values
    Then the response code is Bad request 201 and container id should be trimmed to accept only integer

  
  Scenario: 
    When Create Container by containerIdby setting value as 0
    Then the response code is Bad request 201

  
  Scenario: 
    When Create Container by destination LocationIdby passing string values_characters
    Then the response code is Bad request 400

  
  Scenario: 
    When Create Container by destination LocationIdby passing space
    Then the response code is Bad request 201

  
  Scenario: 
    When Create Container by destination LocationIdby passing floating values
    Then the response code is Bad request 201 and destination loaction id should be trimmed to integer

  
  Scenario: 
    When Create Container by destination LocationIdby passing negative values
    Then the response code is Bad request 201 and destination loaction id should be trimmed to integer

  
  Scenario: 
    When Create Container by destination LocationIdby setting value as 0
    Then the response code should be 201

  
  Scenario: 
    When Create Conatiner by setting a  String value to the VendorPKratio
    Then the response code is Bad request 400

  
  Scenario: 
    When Create Conatiner by setting   Null the VendorPKratio
    Then the response code should be 201 and VpkRatio should be 1

  
  Scenario: 
    When Create Container by passing AlphaNumeric Digits to VendorPKratio
    Then the response code is Bad request 400

  
  Scenario: 
    When Create Conatiner by setting   value as 0  to  the VendorPKratio
    Then the response code should be 201 and VpkRatio should be 1

  
  Scenario: 
    When Create Conatiner by setting negative values to the VendorPKratio
    Then the response code should be 201 and VpkRatio should be 1
 
  Scenario: 
    When Create Container by setting Data range for the VendorPKratio
    Then the response code is Bad request 400
