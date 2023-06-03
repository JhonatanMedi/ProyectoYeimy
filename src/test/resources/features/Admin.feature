#Proyecto de pruebas y cargado en Github
#01/06/2023
#Jhonatan Medina Blanco
@Regresion
Feature: Admin

  @HU005
  Scenario Outline: new user add
    Given the user open brower
    And the user fill out user <user> password <password>
    And the user select option admin and new user
    When the user fill out <employee> rol <rol> status <status> user <userName> password <pass> confirm <confirmPass>
    Then the user validate save information contact details
    And the user close brower

    Examples:
      | user  | password | employee | rol | status  | userName | pass     | confirmPass |
      | Admin | admin123 | Li       | ESS | Enabled | Prueba1X | Prueba01 | Prueba01    |
