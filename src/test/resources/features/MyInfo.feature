#Proyecto de pruebas y cargado en Github
#01/06/2023
#Jhonatan Medina Blanco
Feature: my informations

  @HU003
  Scenario Outline: update personal details
    Given the user open brower
    And the user fill out user <user> password <password>
    When the user updates my information personal detail middle <middleName> nationality <nationality> marital status <maritalStatus>
    Then the user validate update field <nationality> <maritalStatus>

    Examples:
      | user  | password | middleName | nationality | maritalStatus |
      | Admin | admin123 | Jhonatan   | Colombian   | Other         |

