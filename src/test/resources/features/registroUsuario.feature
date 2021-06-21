#Autor: Katherin Granada Rojas

@stories
Feature: User Register
  As a user, I want to carry out the registration process on the uTest platform
  @scenario1
  Scenario: New user registration
    Given than the user wants to register on the platform
    When the user press the Join Today button on the platform
    | firstName | lastName  | email | month | day | year  | language  | city  | country |postalCode  |  password | confirmPassword  |
    | usuario | apellido  | prueeba@gmail.com | November  | 25  | 1997  | Spanish |  El Agrado  |  Colombia  |  102030  |   Prueba123.  | Prueba123.  |
    Then it should allow you to register on the platform
