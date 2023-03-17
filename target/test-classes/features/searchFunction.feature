@SmokeTest
Feature: Search Function Testing

  @searchBox
  Scenario Outline: Happy Path Search Box Testing
    Given Enter this word in searchBox "searchValue"
    When Click the search button
    Then Get the title
    Then Get the url

    ##  < > (Diamond) bracket means Dynamic value acceptance.
    ##1- searchValue === laptop
    ##2- searchValue === car
    @laptop
    Examples: 
      | searchValue |
      | laptop      |
