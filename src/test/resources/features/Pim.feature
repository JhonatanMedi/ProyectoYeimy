#Proyecto de pruebas y cargado en Github
#01/06/2023
#Jhonatan Medina Blanco
Feature: Pim

  @HU002
  Scenario Outline: Add employee
    Given the user open brower
    And the user fill out user <user> password <password>
    When the user select add employee and fill out first name <firstName> last name <lastName>

    Examples:
      | user  | password | firstName | lastName |
      | Admin | admin123 | Jhonatan  | medina   |
