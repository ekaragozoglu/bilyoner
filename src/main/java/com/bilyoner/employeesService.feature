Feature: Employees Service Test

    Background:
        * def config = call read('karate-config.js')
        * url baseUrl

    @employees
    Scenario: Get request to employees service - Status code is 200
        Given path employeesPath
        * request {}
        * method GET
        Then status 200
        * match $.status == 'success'
        * match $.data == '#[24]'
        And def employee = karate.filter(response.data, function(x){ return x.employee_salary == 313500 })[0]
        Then match employee.employee_name == "Haley Kennedy"
