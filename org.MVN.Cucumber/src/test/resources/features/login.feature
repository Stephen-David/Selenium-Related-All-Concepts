Feature: Validating the facebook login page



@smoke @regression

  Scenario Outline: verifying the login credentials with valid Data

    When user enters user name as "<userName>"

    When user enters password as "<passWord>"

    And User Clicks the login button



    Examples: 

      | userName        | passWord   |

      | tester@mail.com | Tester@123 |

      | admin@mail.com  | Admin@123  |

      | dev@mail.com    | Dev@123    |

@sanity

  Scenario: verifying the login page links

    When User wants to get all the links in the webpage

    And User gets links count

    And User gets each links href attribute and text


