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

  @HU004
  Scenario Outline: update personal details
    Given the user open brower
    And the user fill out user <user> password <password>
    When the user fill out contact details <streetOne> country <country> street <streetTwo>
    Then the user validate save information contact details

    Examples:
      | user  | password | streetOne | country     | streetTwo |
      | Admin | admin123 | calle 5   | Afghanistan | kGGr 6    |