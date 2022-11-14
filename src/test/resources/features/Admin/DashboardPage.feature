Feature: Dashboard Page

  #WBC_4
  Scenario Outline: Dasboard Page Flow Valid Service Type and Price
    Given Already log in
    When Click change status field
    And Click detail button
    And Input text in add service type "<servicetype>"
    And Input price in add price "<price>"
#    And Click detail submit button
#    Then Redirect to dashboard page

    Examples:
    | servicetype      | price    |
    | Ganti Velg       | 1900000  |
    | Ganti Ban        | 35000    |
    | Ganti Oli        | 35000    |


  #WBC_5
  Scenario Outline: Dasboard Page Flow Invalid Service Type and Price
    Given Already log in
    When Click detail button
    And Input text in add service type "<servicetype>"
    And Input price in add price "<price>"
#    And Click detail submit button
    Then Can't redirect to dashboard page

    Examples:
      | servicetype      | price       |
      | Nasi goreng      | 356770123   |
      | Sop Ayam         | 138291863   |
      | Semur            | 1237129379  |
