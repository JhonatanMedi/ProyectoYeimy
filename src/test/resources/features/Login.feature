#Proyecto de pruebas y cargado en Github
#01/06/2023
#Jhonatan Medina Blanco
Feature: Login

  @HU001
  Scenario Outline: login successful
    Given the user open brower
    When the user fill out user <user> password <password>

    Examples:
      | user  | password |
      | Admin | admin123 |
